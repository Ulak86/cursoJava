-- ============================================================================
-- INTRODUCIR DATOS EN LA TABLA
-- ============================================================================
insert into tb_productos_profe (
   nombre,
   categoria,
   precio,
   stock,
   fecha_alta,
   estado,
   codigo_sku,
   iva
) values ( 'Smartphone 128GB',
           'TECNOLOGIA',
           499.00,
           30,
           to_date('05/09/2025','DD/MM/YYYY'),
           'ACTIVO',
           'SKU-T-003',
           21 );

insert into tb_productos_profe (
   nombre,
   categoria,
   precio,
   stock,
   fecha_alta,
   estado,
   codigo_sku,
   iva
) values ( 'Tablet 10"',
           'TECNOLOGIA',
           199.99,
           0,
           to_date('20/07/2025','DD/MM/YYYY'),
           'INACTIVO',
           'SKU-T-004',
           21 );

insert into tb_productos_profe (
   nombre,
   categoria,
   precio,
   stock,
   fecha_alta,
   estado,
   codigo_sku
) values ( 'Monitor 27" 2K',
           'TECNOLOGIA',
           279.00,
           7,
           sysdate,
           'ACTIVO',
           'SKU-T-005' );

insert into tb_productos_profe (
   nombre,
   categoria,
   precio,
   stock,
   fecha_alta,
   estado,
   codigo_sku
) values ( 'Teclado mecánico',
           'TECNOLOGIA',
           89.90,
           15,
           to_date('12/08/2025','DD/MM/YYYY'),
           'ACTIVO',
           'SKU-T-006' );

insert into tb_productos_profe (
   nombre,
   categoria,
   precio,
   stock,
   fecha_alta,
   estado,
   codigo_sku
) values ( 'Cámara deportiva 4K',
           'TECNOLOGIA',
           149.00,
           10,
           to_date('28/05/2025','DD/MM/YYYY'),
           'ACTIVO',
           'SKU-T-007' );

insert into tb_productos_profe (
   nombre,
   categoria,
   precio,
   stock,
   fecha_alta,
   estado,
   codigo_sku
) values ( 'Auriculares gaming',
           'TECNOLOGIA',
           69.00,
           25,
           to_date('03/10/2025','DD/MM/YYYY'),
           'ACTIVO',
           'SKU-T-008' );

insert into tb_productos_profe (
   nombre,
   categoria,
   precio,
   stock,
   fecha_alta,
   estado,
   codigo_sku
) values ( 'Smartwatch',
           'TECNOLOGIA',
           139.00,
           14,
           to_date('18/06/2025','DD/MM/YYYY'),
           'ACTIVO',
           'SKU-T-009' );

-- HOGAR
insert into tb_productos_profe (
   nombre,
   categoria,
   precio,
   stock,
   fecha_alta,
   estado,
   codigo_sku
) values ( 'Robot aspirador',
           'HOGAR',
           229.00,
           5,
           to_date('03/06/2025','DD/MM/YYYY'),
           'ACTIVO',
           'SKU-H-003' );

insert into tb_productos_profe (
   nombre,
   categoria,
   precio,
   stock,
   fecha_alta,
   estado,
   codigo_sku
) values ( 'Batidora de vaso',
           'HOGAR',
           45.00,
           18,
           sysdate,
           'ACTIVO',
           'SKU-H-004' );

insert into tb_productos_profe (
   nombre,
   categoria,
   precio,
   stock,
   fecha_alta,
   estado,
   codigo_sku
) values ( 'Funda de almohada',
           'HOGAR',
           9.99,
           0,
           to_date('11/07/2025','DD/MM/YYYY'),
           'INACTIVO',
           'SKU-H-005' );

insert into tb_productos_profe (
   nombre,
   categoria,
   precio,
   stock,
   fecha_alta,
   estado,
   codigo_sku,
   iva
) values ( 'Silla ergonómica',
           'HOGAR',
           159.00,
           8,
           to_date('22/04/2025','DD/MM/YYYY'),
           'ACTIVO',
           'SKU-H-006',
           21 );

insert into tb_productos_profe (
   nombre,
   categoria,
   precio,
   stock,
   fecha_alta,
   estado,
   codigo_sku
) values ( 'Cafetera espresso',
           'HOGAR',
           129.00,
           6,
           to_date('09/09/2025','DD/MM/YYYY'),
           'ACTIVO',
           'SKU-H-007' );

insert into tb_productos_profe (
   nombre,
   categoria,
   precio,
   stock,
   fecha_alta,
   estado,
   codigo_sku
) values ( 'Freidora de aire',
           'HOGAR',
           99.00,
           0,
           to_date('30/08/2025','DD/MM/YYYY'),
           'INACTIVO',
           'SKU-H-008' );

insert into tb_productos_profe (
   nombre,
   categoria,
   precio,
   stock,
   fecha_alta,
   estado,
   codigo_sku
) values ( 'Lámpara LED escritorio',
           'HOGAR',
           22.90,
           40,
           to_date('05/05/2025','DD/MM/YYYY'),
           'ACTIVO',
           'SKU-H-009' );

-- DEPORTE
insert into tb_productos_profe (
   nombre,
   categoria,
   precio,
   stock,
   fecha_alta,
   estado,
   codigo_sku
) values ( 'Mancuernas 5kg',
           'DEPORTE',
           35.00,
           20,
           to_date('14/07/2025','DD/MM/YYYY'),
           'ACTIVO',
           'SKU-D-002' );

insert into tb_productos_profe (
   nombre,
   categoria,
   precio,
   stock,
   fecha_alta,
   estado,
   codigo_sku
) values ( 'Esterilla de yoga',
           'DEPORTE',
           19.95,
           0,
           to_date('21/06/2025','DD/MM/YYYY'),
           'INACTIVO',
           'SKU-D-003' );

insert into tb_productos_profe (
   nombre,
   categoria,
   precio,
   stock,
   fecha_alta,
   estado,
   codigo_sku,
   iva
) values ( 'Zapatillas running',
           'DEPORTE',
           79.00,
           12,
           to_date('02/09/2025','DD/MM/YYYY'),
           'ACTIVO',
           'SKU-D-004',
           21 );

insert into tb_productos_profe (
   nombre,
   categoria,
   precio,
   stock,
   fecha_alta,
   estado,
   codigo_sku
) values ( 'Bicicleta de spinning',
           'DEPORTE',
           499.00,
           3,
           to_date('17/03/2025','DD/MM/YYYY'),
           'ACTIVO',
           'SKU-D-005' );

insert into tb_productos_profe (
   nombre,
   categoria,
   precio,
   stock,
   fecha_alta,
   estado,
   codigo_sku
) values ( 'Balón de baloncesto',
           'DEPORTE',
           24.50,
           50,
           to_date('12/10/2025','DD/MM/YYYY'),
           'ACTIVO',
           'SKU-D-006' );

insert into tb_productos_profe (
   nombre,
   categoria,
   precio,
   stock,
   fecha_alta,
   estado,
   codigo_sku
) values ( 'Cinta de correr',
           'DEPORTE',
           699.00,
           2,
           to_date('08/01/2025','DD/MM/YYYY'),
           'ACTIVO',
           'SKU-D-007' );

insert into tb_productos_profe (
   nombre,
   categoria,
   precio,
   stock,
   fecha_alta,
   estado,
   codigo_sku,
   iva
) values ( 'Comba de velocidad',
           'DEPORTE',
           12.99,
           35,
           to_date('25/08/2025','DD/MM/YYYY'),
           'ACTIVO',
           'SKU-D-008',
           21 );

insert into tb_productos_profe (
   nombre,
   categoria,
   precio,
   stock,
   fecha_alta,
   estado,
   codigo_sku
) values ( 'Rodillo foam',
           'DEPORTE',
           16.50,
           9,
           to_date('19/05/2025','DD/MM/YYYY'),
           'ACTIVO',
           'SKU-D-009' );

commit;

-- ============================================================================
-- 1) Listado básico
-- Enunciado: Muestra todas las columnas de todos los productos.
select *
  from tb_productos_profe;

-- ============================================================================
-- 2) Proyección y ordenación
-- Enunciado: Lista `nombre`, `categoria` y `precio`, ordenado alfabéticamente por `nombre`.
select nombre,
       categoria,
       precio
  from tb_productos_profe
 order by nombre;

-- ============================================================================
-- 3) Filtro simple
-- Enunciado: Muestra los productos de la categoría TECNOLOGIA con `precio` entre 100 y 300 euros.
select *
  from tb_productos_profe
 where categoria = 'TECNOLOGIA'
   and precio between 100 and 300;

-- ============================================================================
-- 4) Nulos, defaults y condiciones
-- Enunciado: Obtén los productos con stock = 0 (rotación nula) y muestra `id`, `nombre`, `estado`.
select id,
       nombre,
       estado
  from tb_productos_profe
 where stock = 0;

-- ============================================================================
-- 5) Funciones sobre fechas
-- Enunciado: Muestra los productos dados de alta en septiembre de 2025.
select *
  from tb_productos_profe
 where fecha_alta >= date '2025-09-01'
   and fecha_alta < date '2025-10-01';

-- ============================================================================
-- 6) Agregación por categoría
-- Enunciado: Muestra cuántos productos hay por `categoria`.
select categoria,
       count(categoria) as num_productos
  from tb_productos_profe
 group by categoria;

-- ============================================================================
-- 7) Métricas de negocio
-- Enunciado: Para cada `categoria`, calcula precio medio, precio máx y unidades totales en stock.
select categoria,
       round(
          avg(precio),
          2
       ) as precio_medio,
       max(precio) as precio_max,
       sum(stock) as stock_total
  from tb_productos_profe
 group by categoria;

-- ============================================================================
-- 8) Top-N
-- Enunciado: Devuelve los 5 productos más caros (id, nombre, categoria, precio).
select id,
       nombre,
       categoria,
       precio
  from tb_productos_profe
 order by precio desc
 fetch first 5 rows only;

-- ============================================================================
-- 9) Cálculo de PVP con IVA
-- Enunciado: Muestra `nombre`, `precio` y el PVP (precio con IVA), redondeado a 2 decimales.
select nombre,
       precio,
       round(
          (precio) *((iva / 100) + 1),
          2
       ) as precio_con_iva
  from tb_productos_profe;

-- ============================================================================
-- 10) Búsqueda por texto
-- Enunciado: Encuentra productos cuyo nombre contenga la palabra “cafe”.
select *
  from tb_productos_profe
 where lower(nombre) like '%cafe%';

-- ============================================================================
-- 11) Media de precio por categoría (solo TECNOLOGIA y HOGAR, activos)
-- Enunciado: Para las categorías TECNOLOGIA y HOGAR con `estado = 'ACTIVO'`, muestra precio medio y nº de productos. Solo devuelve categorías cuya media sea > 100€. Ordena por media desc.
select categoria,
       round(
          avg(precio),
          2
       ) as precio_medio,
       count(categoria) as productos_num
  from tb_productos_profe
 where categoria in ( 'TECNOLOGIA',
                      'HOGAR' )
   and estado = 'ACTIVO'
 group by categoria;

-- ============================================================================
-- 12) Stock por mes para (ago, sep, oct) 2025 en categorías seleccionadas
-- Enunciado: Para HOGAR y DEPORTE, en los meses agosto, septiembre, octubre de 2025, agrupa por mes y categoría, muestra stock total. Devuelve solo grupos con stock ≥ 20. Ordena por mes asc, stock desc.
select categoria,
       fecha_alta,
       stock
  from tb_productos_profe
 where fecha_alta >= date '2025-08-01'
   and fecha_alta < date '2025-11-01'
   and categoria in ( 'HOGAR',
                      'DEPORTE' )
 group by categoria,
          fecha_alta,
          stock
having stock >= 20
 order by fecha_alta asc,
          stock desc;

-- 12) Stock por mes para (ago, sep, oct) 2025 en categorías seleccionadas
-- Enunciado: Para HOGAR y DEPORTE, en los meses agosto, septiembre, octubre de 2025,
-- agrupa por mes y categoría, muestra stock total.
-- Devuelve solo grupos con stock ≥ 20. Ordena por mes asc, stock desc.
select categoria,
       to_char(
          fecha_alta,
          'YYYY-MM'
       ) as mes,
       sum(stock) as stock_total
  from tb_productos_profe
 where fecha_alta >= date '2025-08-01'
   and fecha_alta < date '2025-11-01'
   and categoria in ( 'HOGAR',
                      'DEPORTE' )
 group by categoria,
          to_char(
             fecha_alta,
             'YYYY-MM'
          )
having sum(stock) >= 20
 order by mes asc,
          stock_total desc;

-- ============================================================================
-- 13) IVA y categoría con masa crítica
-- Enunciado: Considera solo productos con IVA en (21,10) y categoría en (TECNOLOGIA, HOGAR, DEPORTE). Agrupa por IVA y categoría y muestra nº de productos y precio máximo. Devuelve solo grupos con al menos 3 productos. Ordena por IVA asc, nº desc.
select iva,
       categoria,
       count(*) as numero_productos,
       max(precio) as precio_max
  from tb_productos_profe
 where iva in ( 21,
                10 )
   and categoria in ( 'TECNOLOGIA',
                      'HOGAR',
                      'DEPORTE' )
 group by iva,
          categoria
having count(*) >= 3
 order by iva asc,
          numero_productos desc;

-- ============================================================================
-- 14) Catálogo filtrado por nombres concretos
-- Enunciado: Toma solo los productos cuyo nombre esté en la lista
-- `('Auriculares BT','Auriculares gaming','Cafetera espresso','Freidora de aire','Smartwatch')`.
-- Agrupa por categoría y estado y muestra precio medio y stock total. Devuelve grupos con precio medio > 50. Ordena por precio medio desc.
select categoria,
       estado,
       count(*) as stock_total,
       round(
          avg(precio),
          2
       ) as precio_medio
  from tb_productos_profe
 where nombre in ( 'Auriculares BT',
                   'Auriculares gaming',
                   'Cafetera espresso',
                   'Freidora de aire',
                   'Smartwatch' )
 group by categoria,
          estado
having avg(precio) > 50
 order by avg(precio);

-- ============================================================================
-- 15) Control de “rotación cero” dentro de categorías
-- Enunciado: Sobre HOGAR y DEPORTE, agrupa por categoría y estado y calcula cuántos tienen stock = 0 y el precio medio. Devuelve solo grupos con al menos 1 producto con stock 0 y precio medio ≥ 20. Ordena por categoría, estado.

SELECT
    categoria,
    estado,
    COUNT(CASE WHEN stock = 0 THEN 1 END) AS productos_sin_stock,
    ROUND(AVG(precio), 2) AS precio_medio
FROM
    tb_productos_profe
WHERE
    categoria IN ('HOGAR', 'DEPORTE')
GROUP BY
    categoria, estado
HAVING
    COUNT(CASE WHEN stock = 0 THEN 1 END) >= 1
    AND AVG(precio) >= 20
ORDER BY
    categoria, estado;
