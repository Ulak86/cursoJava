 ## Elementos básicos de la sintaxis

### Explicación general de los elementos

#### Sentencia SQL

- Una instrucción completa que indica a la base de datos qué hacer.
    
- Siempre termina con **;** (punto y coma), que marca el final de la sentencia.
    

#### Bloque de sentencias

- Conjunto de varias sentencias SQL escritas de forma consecutiva.
    
- Cada sentencia se interpreta y ejecuta de manera independiente, aunque formen parte de un mismo script.
    

#### Palabras reservadas

- Son términos del lenguaje SQL con un significado fijo y no modificable.
    
- No se pueden usar como identificadores (nombres de tablas, columnas, etc.) salvo que se escriban entre comillas dobles `"..."`.
    
- Ejemplos generales:
    
    - **DDL (Data Definition Language)** → CREATE, ALTER, DROP, TRUNCATE, RENAME.
        
    - **DML (Data Manipulation Language)** → SELECT, INSERT, UPDATE, DELETE.
        
    - **DCL (Data Control Language)** → GRANT, REVOKE.
        
    - **TCL (Transaction Control Language)** → COMMIT, ROLLBACK, SAVEPOINT.
        
- El orden de las palabras reservadas es fijo porque siguen la gramática SQL (no se puede cambiar arbitrariamente).
    

#### Identificadores

- Son nombres definidos por el usuario para objetos de la base de datos: tablas, columnas, vistas, índices, esquemas, etc.
    
- Reglas generales:
    
    - No pueden coincidir con palabras reservadas (ej. no llamar a una tabla `SELECT`).
        
    - Pueden contener letras, números y guiones bajos (`_`).
        
    - Normalmente no se distinguen mayúsculas de minúsculas, salvo que se usen comillas dobles (`"MiTabla"`).
        
- Ejemplos: `clientes`, `id_empleado`, `ventas2025`.
    

#### Tipos de datos

- **tipo_dato** → Define qué clase de valores pueden almacenarse en una columna.
    
- Conjuntos principales en Oracle (y subtipos comunes):
    

**Numéricos**

- `NUMBER(p,s)` → Número con precisión _p_ y escala _s_.
    
- `INTEGER` → Alias de NUMBER entero.
    
- `FLOAT` → Número en coma flotante.
    

**Cadenas de caracteres**

- `CHAR(n)` → Cadena de longitud fija.
    
- `VARCHAR2(n)` → Cadena de longitud variable hasta _n_ caracteres (el más usado).
    
- `CLOB` → Character Large Object (texto muy largo).
    

**Fechas y tiempo**

- `DATE` → Fecha + hora (segundos incluidos).
    
- `TIMESTAMP` → Fecha + hora + fracciones de segundo.
    
- `INTERVAL` → Diferencias de tiempo (ej. “+3 días, 2 horas”).
    

**Binarios**

- `RAW(n)` → Datos binarios de longitud fija.
    
- `BLOB` → Binary Large Object (archivos, imágenes, etc.).
    

#### Restricciones

- Son reglas de integridad que limitan o definen el comportamiento de los valores de una columna o tabla.
    
- Principales:
    
    - **NOT NULL** → Obliga a que el valor exista.
        
        ```sql
        nombre VARCHAR2(50) NOT NULL
        ```
        
    - **UNIQUE** → Evita valores duplicados en la columna.
        
        ```sql
        email VARCHAR2(100) UNIQUE
        ```
        
    - **PRIMARY KEY** → Combina NOT NULL + UNIQUE.
        
        ```sql
        id NUMBER PRIMARY KEY
        ```
        
    - **FOREIGN KEY** → Relaciona con otra tabla.
        
        ```sql
        dept_id NUMBER REFERENCES departamentos(id)
        ```
        
    - **CHECK** → Condición lógica que deben cumplir los valores.
        
        ```sql
        salario NUMBER CHECK (salario > 0)
        ```
        

#### Estructura de la definición de columnas

- **Paréntesis ( ... )** → Agrupan la lista de columnas que forman parte de la tabla.
    
- **Coma ,** → Separa cada definición de columna dentro de los paréntesis (la última no lleva coma).
    

#### Terminación

- **Punto y coma ;** → Marca el final de la sentencia completa.
    
- Permite que el motor de base de datos distinga entre varias sentencias en un mismo script.

---

## Definición de tablas

### Sintaxis general

```sql
CREATE TABLE nombre_tabla (
    nombre_columna tipo_dato [restricciones],
    ...
);
```

- **CREATE TABLE** → Crea una nueva tabla en la base de datos.
    
- **nombre_tabla** → Nombre que recibirá la tabla.
    
- **nombre_columna** → Identificador de la columna.
    
- **tipo_dato** → Tipo de dato que almacenará (ej. NUMBER, VARCHAR2).
    
- **restricciones** → Condiciones opcionales aplicadas a la columna (ej. PRIMARY KEY, NOT NULL, UNIQUE).
    

### Ejemplo práctico

```sql
CREATE TABLE usuarios (
    id     NUMBER PRIMARY KEY,
    nombre VARCHAR2(50)  NOT NULL,
    email  VARCHAR2(100) NOT NULL UNIQUE
);
```

#### Aplicación en el ejemplo

- Se usa la estructura general: **CREATE TABLE + nombre + definición de columnas**.
    
- Cada columna se define como: **nombre + tipo + restricciones**.
    
- El esquema resultante combina tres tipos de restricciones:
    
    - **PRIMARY KEY** (clave primaria)
        
    - **NOT NULL** (no permite nulos)
        
    - **UNIQUE** (unicidad)
        

#### Palabras reservadas y descripción

- **CREATE TABLE** → Crea una nueva tabla en la base de datos.
    
- **usuarios** → Nombre de la tabla.
    

Dentro de la definición de columnas:

- **id** → Nombre de la columna.
    
    - **NUMBER** → Tipo numérico.
        
    - **PRIMARY KEY** → Restricción: valor único + no nulo, identifica cada fila.
        
- **nombre** → Nombre de la columna.
    
    - **VARCHAR2(50)** → Cadena variable, hasta 50 caracteres.
        
    - **NOT NULL** → No admite valores nulos.
        
- **email** → Nombre de la columna.
    
    - **VARCHAR2(100)** → Cadena variable, hasta 100 caracteres.
        
    - **NOT NULL** → No admite valores nulos.
        
    - **UNIQUE** → Cada valor debe ser distinto (sin duplicados).

---

## Definición de tablas – Versión extendida

### Ejemplo práctico

```sql
-- 1) Crear la tabla USUARIOS

CREATE TABLE usuarios (
  id              NUMBER GENERATED ALWAYS AS IDENTITY    -- autoincrementable
                      PRIMARY KEY,                        -- clave primaria
  nombre          VARCHAR2(50)       NOT NULL,           -- no nulo
  email           VARCHAR2(100)      NOT NULL,           -- no nulo
  fecha_registro  DATE DEFAULT SYSDATE                    -- valor por defecto: fecha/hora actual
);

-- Añadimos la unicidad de email (explícita con CONSTRAINT)
ALTER TABLE usuarios
  ADD CONSTRAINT uq_usuarios_email UNIQUE (email);

-- 2) Añadir columna TELEFONO (nullable)
ALTER TABLE usuarios
  ADD telefono VARCHAR2(15);

-- 3) Modificar la columna NOMBRE para ampliar su tamaño
ALTER TABLE usuarios
  MODIFY nombre VARCHAR2(100);
```

#### Aplicación en el ejemplo

- **Autoincremento con IDENTITY** → En Oracle 21c se puede definir una columna con `GENERATED ALWAYS AS IDENTITY` para que se incremente automáticamente en cada inserción.
    
- **DEFAULT SYSDATE** → Permite asignar un valor por defecto a la columna `fecha_registro`. En este caso, toma la fecha y hora actuales del servidor.
    
- **Restricciones con nombre explícito** → Se puede definir una restricción de unicidad usando `ALTER TABLE ... ADD CONSTRAINT nombre_constraint UNIQUE (columna)`. Aquí se nombra `uq_usuarios_email`.
    
- **Añadir columna** → `ALTER TABLE ... ADD` permite agregar nuevas columnas. Si no se especifica `NOT NULL`, acepta valores nulos por defecto.
    
- **Modificar tipo de dato** → `ALTER TABLE ... MODIFY` ajusta las características de una columna existente. En este ejemplo se amplía el tamaño de `nombre` de 50 a 100 caracteres (válido porque no reduce capacidad, lo cual evita pérdida de datos).

---

## Definición de tablas – Ejemplo con restricciones avanzadas

### Ejemplo práctico

```sql
-- 1) Creación de la tabla PRODUCTOS

CREATE TABLE productos (
  id              NUMBER GENERATED ALWAYS AS IDENTITY,
  nombre          VARCHAR2(100)   NOT NULL,
  descripcion     VARCHAR2(500)   NULL,
  precio          NUMBER(8,2)     NOT NULL,
  stock           NUMBER(10)      DEFAULT 0 NOT NULL,
  fecha_registro  TIMESTAMP       DEFAULT SYSTIMESTAMP NOT NULL,
  descuento       NUMBER(3)       NULL,
  estado          VARCHAR2(8)     DEFAULT 'activo' NOT NULL,
  -- Restricciones
  CONSTRAINT ck_productos_precio_nonneg    CHECK (precio >= 0),
  CONSTRAINT ck_productos_descuento_0_100  CHECK (descuento BETWEEN 0 AND 100),
  CONSTRAINT ck_productos_estado_enum      CHECK (estado IN ('activo','inactivo')),
  CONSTRAINT pk_usuarios PRIMARY KEY (id)
);

-- Alternativa: crear la clave primaria después de la tabla
ALTER TABLE usuarios
  ADD CONSTRAINT pk_usuarios PRIMARY KEY (id);
```

#### Aplicación en el ejemplo

- **TIMESTAMP + SYSTIMESTAMP** → Para almacenar fecha y hora con mayor precisión (milisegundos y zona horaria). `DEFAULT SYSTIMESTAMP` asegura que cada fila se registre con el momento exacto de inserción.
    
- **Restricciones CHECK** → Definen condiciones lógicas para asegurar integridad en los valores:
    
    - `ck_productos_precio_nonneg` → El precio debe ser mayor o igual que 0.
        
    - `ck_productos_descuento_0_100` → El descuento debe estar entre 0 y 100.
        
    - `ck_productos_estado_enum` → Simula un **ENUM**, limitando el campo `estado` a valores `'activo'` o `'inactivo'`.
        
- **PRIMARY KEY con nombre explícito** → La clave primaria se puede definir directamente en la creación de la tabla o después con `ALTER TABLE`.
    
- **Valores por defecto en columnas** → `DEFAULT` aplicado en `stock`, `fecha_registro` y `estado` asegura que, si no se especifica valor, se asigna automáticamente uno predeterminado (0, la fecha actual, o `'activo'`).

---

## Modificación y eliminación de tablas

### Añadir columnas

Se pueden agregar una o varias columnas a una tabla existente con `ALTER TABLE ... ADD`.

- **Una sola columna**:
    

```sql
ALTER TABLE productos ADD (categoria VARCHAR2(50) NOT NULL);
```

- **Varias columnas en una sola sentencia**:
    

```sql
ALTER TABLE productos ADD (
    categoria VARCHAR2(50) NOT NULL,
    proveedor VARCHAR2(100)   -- NULL permitido por defecto
);
```

### Modificar columnas

`ALTER TABLE ... MODIFY` permite cambiar las características de columnas existentes.

- Se puede aumentar la longitud de un campo de texto o ajustar el tipo de dato.
    
- La modificación es válida siempre que no rompa compatibilidad con los datos ya almacenados.
    

Ejemplo:

```sql
ALTER TABLE productos MODIFY (descripcion VARCHAR2(500));
```

### Eliminar tablas

`DROP TABLE` borra por completo la tabla y sus datos.

- **Sin PURGE** → la tabla pasa a la papelera de reciclaje (Recycle Bin) y puede recuperarse.
    
- **Con PURGE** → elimina definitivamente la tabla, sin posibilidad de recuperación.
    

Ejemplo:

```sql
DROP TABLE productos PURGE;
```

---

## Restricciones CHECK

### Sintaxis general

```sql
CHECK (condición_logica)
```

- **CHECK** → palabra reservada que define una restricción.
    
- **( … )** → paréntesis que encierran la condición.
    
- **condición_lógica** → expresión booleana que debe cumplirse para aceptar el valor.
    

### Dónde puede declararse

- **A nivel de columna** → Se aplica solo a esa columna.
    
    ```sql
    salario NUMBER CHECK (salario > 0)
    ```
    
- **A nivel de tabla** → Puede involucrar varias columnas.
    
    ```sql
    CHECK (fecha_fin > fecha_inicio)
    ```
    

### Condiciones lógicas permitidas

**Comparación**  
Operadores: `=`, `!=` o `<>`, `<`, `<=`, `>`, `>=`

```sql
CHECK (edad >= 18)
```

**Rango**  
`BETWEEN … AND …`

```sql
CHECK (salario BETWEEN 1000 AND 5000)
```

**Conjunto de valores**  
`IN (…)`

```sql
CHECK (estado IN ('ACTIVO', 'INACTIVO'))
```

**Nulos**  
`IS NULL`, `IS NOT NULL`

```sql
CHECK (fecha_baja IS NOT NULL OR estado = 'ACTIVO')
```

**Condicionales lógicos**  
`AND`, `OR`, `NOT`

```sql
CHECK (sexo IN ('M','F') AND edad > 0)
```

**Funciones (limitado)**  
Oracle permite funciones deterministas dentro de CHECK.

```sql
CHECK (UPPER(codigo) = codigo)
-- obliga a que el valor esté en mayúsculas
```

### Ejemplo completo

```sql
CREATE TABLE empleados (
    id        NUMBER PRIMARY KEY,
    edad      NUMBER CHECK (edad >= 18),
    salario   NUMBER CHECK (salario > 0 AND salario < 100000),
    estado    VARCHAR2(10) CHECK (estado IN ('ACTIVO','INACTIVO')),
    fecha_ini DATE,
    fecha_fin DATE,
    CHECK (fecha_fin IS NULL OR fecha_fin > fecha_ini)
);
```
