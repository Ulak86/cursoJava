---

title: Java + Oracle — `insert()` seguro para `TB_ORDENADOR`

tags: [java, jdbc, oracle, sql, seguridad, insert, dao]

created: 2025-10-02

---

  

## Contexto

  

Este método Java pretende insertar un registro en Oracle, pero solo construye un `String` y no ejecuta nada:

  

```java

@Override

public void insert() {

    String insert = "INSERT INTO TABLE TB_ORDENADOR (\"procesador\",\"nombre\",\"precio\") "

            + "VALUES (" + this.procesador + "," + getNombre() + ", " + getPrecio() + ") )";

    System.out.println("Insertando ordenador");

}

```

  

## Problemas detectados (y por qué)

  

1) **Sintaxis SQL incorrecta** → En Oracle (y SQL estándar) es `INSERT INTO TB_ORDENADOR (...) VALUES (...)`; **no** lleva la palabra `TABLE`.<br>

2) **Paréntesis extra** → Hay un `) )` final sobrante.<br>

3) **Concatenación de valores sin comillas** → Las cadenas deben ir entre comillas simples (`'...'`); así como escapar comillas internas. Aquí no se ponen, por lo que la sentencia resultante será inválida.<br>

4) **Comillas dobles en identificadores** → `\"procesador\"` crea identificadores *sensibles a mayúsculas/minúsculas*; terminarás obligado a escribirlos siempre igual y entre comillas. Mejor evitar comillas en nombres de columnas salvo que sea imprescindible.<br>

5) **Riesgo crítico de *SQL injection*** → Construir SQL con concatenación permite inyectar código malicioso si cualquier valor proviene de entrada de usuario.<br>

6) **La SQL no se ejecuta** → Solo se crea el `String` y se imprime un mensaje. Falta JDBC (`PreparedStatement`/`executeUpdate`).

  

## SQL correcta (forma literal, solo a modo ilustrativo)

  

```sql

INSERT INTO TB_ORDENADOR (PROCESADOR, NOMBRE, PRECIO)

VALUES ('Intel i5', 'Mi PC', 1499.99);

```

> Nota: en Oracle el separador decimal es `.` en literales SQL. Para evitar problemas de configuración regional, en Java usa `BigDecimal` y **`PreparedStatement`**.

  

## Implementación recomendada (JDBC + `PreparedStatement`)

  

```java

import java.math.BigDecimal;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.SQLException;

  

public void insert(Connection conn) throws SQLException {

    final String sql = "INSERT INTO TB_ORDENADOR (PROCESADOR, NOMBRE, PRECIO) VALUES (?, ?, ?)";

  

    try (PreparedStatement ps = conn.prepareStatement(sql)) {

        ps.setString(1, this.procesador);     // String

        ps.setString(2, getNombre());         // String

        ps.setBigDecimal(3, getPrecio());     // BigDecimal recomendado para dinero

        int rows = ps.executeUpdate();

        System.out.println("Filas insertadas: " + rows);

    }

}

```

  

### (Opcional) Obtener la clave generada

  

Si `TB_ORDENADOR` tiene un `ID` autogenerado (secuencia + trigger o `GENERATED AS IDENTITY`), puedes recuperar la clave:

  

```java

final String sql = "INSERT INTO TB_ORDENADOR (PROCESADOR, NOMBRE, PRECIO) VALUES (?, ?, ?)";

try (PreparedStatement ps = conn.prepareStatement(sql, new String[] {"ID"})) {

    ps.setString(1, this.procesador);

    ps.setString(2, getNombre());

    ps.setBigDecimal(3, getPrecio());

    ps.executeUpdate();

    try (var rs = ps.getGeneratedKeys()) {

        if (rs.next()) {

            long id = rs.getLong(1);

            // this.id = id; // si procede

        }

    }

}

```

  

> En Oracle clásico (secuencia + trigger) la devolución de claves generadas depende de cómo se creó la tabla. Con `IDENTITY` (12c+) suele funcionar con `getGeneratedKeys()`.

  

## Alternativa **no recomendada** (concatenación con escape)

  

Solo a título didáctico. Evítala en producción.

  

```java

String sql = "INSERT INTO TB_ORDENADOR (PROCESADOR, NOMBRE, PRECIO) VALUES ('"

        + this.procesador.replace("'", "''") + "', '"

        + getNombre().replace("'", "''") + "', "

        + getPrecio().toPlainString() + ")";

```

Problemas: propensa a errores, difícil de mantener y sigue expuesta a inyección si olvidas escapar algo.

  

## Notas específicas de Oracle

  

- **Evita comillas dobles** en nombres de columnas/tabla. Úsalas solo si de verdad necesitas mayúsculas/minúsculas exactas o caracteres especiales.

- **Tipos recomendados**: `PRECIO NUMBER(10,2)` (o almacena en céntimos como entero). En Java usa `BigDecimal` para cantidades monetarias.

- **Transacciones**: si `autoCommit=false`, recuerda `conn.commit()` o `conn.rollback()` en errores.

- **NLS/locale**: no construyas literales numéricos como texto. `PreparedStatement` evita problemas de separador decimal y formato de fecha.

- **Fechas**: inserta con `PreparedStatement#setDate`/`setTimestamp` en lugar de `TO_DATE(...)` literal.

  

## Checklist rápido

  

- [ ] Quitar `TABLE` y el paréntesis sobrante.

- [ ] No usar comillas dobles en los identificadores.

- [ ] Usar `PreparedStatement` con `?`.

- [ ] `String` → `setString`, dinero → `setBigDecimal`.

- [ ] Ejecutar con `executeUpdate()` y gestionar la transacción.

- [ ] (Si aplica) recuperar la clave generada.