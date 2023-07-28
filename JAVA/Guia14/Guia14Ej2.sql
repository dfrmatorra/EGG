/*Lista los nombres y los precios de todos los productos de la tabla producto.*/

select nombre
from producto;

/*Lista los nombres y los precios de todos los productos de la tabla producto, redondeando
el valor del precio.*/

select nombre, round(precio)
from producto;

/*Lista el código de los fabricantes que tienen productos en la tabla producto.*/

select codigo_fabricante
from producto
group by codigo_fabricante;


/*Lista los nombres de los fabricantes ordenados de forma ascendente.*/

select nombre
from fabricante
order by nombre;

/*Lista los nombres de los productos ordenados en primer lugar por el nombre de forma
ascendente y en segundo lugar por el precio de forma descendente.*/

select nombre, precio
from producto
order by nombre, precio desc;

/*Devuelve una lista con las 5 primeras filas de la tabla fabricante.*/

select *
from fabricante
limit 5;

/*Lista el nombre y el precio del producto más barato. (Utilice solamente las cláusulas
ORDER BY y LIMIT)*/

select nombre, precio
from producto
order by precio
limit 1;

/*Lista el nombre y el precio del producto más caro. (Utilice solamente las cláusulas ORDER
BY y LIMIT)*/

select nombre, precio
from producto
order by precio desc
limit 1;

/* Lista el nombre de los productos que tienen un precio menor o igual a $120.*/

select *
from producto
where precio<= 120;

/* Lista todos los productos que tengan un precio entre $60 y $200. Utilizando el operador
BETWEEN. */

select *
from producto
where precio between 60 and 200;

/*Lista todos los productos donde el código de fabricante sea 1, 3 o 5. Utilizando el operador
IN.*/

select *
from producto
where codigo_fabricante in (1,3,5);

/* Devuelve una lista con el nombre de todos los productos que contienen la cadena Portátil
en el nombre. */

select *
from producto
where nombre like '%portatil%';

/* Devuelve una lista con el código del producto, nombre del producto, código del fabricante
y nombre del fabricante, de todos los productos de la base de datos. */

select p.nombre, p.codigo, f.codigo, f.nombre
from producto p, fabricante f
where p.codigo_fabricante = f.codigo;


/*Devuelve una lista con el nombre del producto, precio y nombre de fabricante de todos
los productos de la base de datos. Ordene el resultado por el nombre del fabricante, por
orden alfabético.*/

select p.nombre, p.precio, f.nombre
from producto p, fabricante f
where p.codigo_fabricante = f.codigo
order by f.nombre;

/* Devuelve el nombre del producto, su precio y el nombre de su fabricante, del producto
más barato. */

select p.nombre, p.precio, f.nombre
from producto p, fabricante f
where p.codigo_fabricante = f.codigo
order by p.precio
limit 1;

/*Devuelve una lista de todos los productos del fabricante Lenovo.*/

select *
from producto p, fabricante f
where p.codigo_fabricante = f.codigo
and f.nombre like 'lenovo';

/* Devuelve una lista de todos los productos del fabricante Crucial que tengan un precio
mayor que $200. */

select p.nombre, p.precio, f.nombre
from producto p, fabricante f
where p.codigo_fabricante = f.codigo
and f.nombre like 'Crucial'
and p.precio > 200;

/*Devuelve un listado con todos los productos de los fabricantes Asus, Hewlett-Packard.
Utilizando el operador IN.*/

select p.nombre, f.nombre
from producto p, fabricante f
where p.codigo_fabricante = f.codigo
and f.nombre in('Asus', 'Hewlett-Packard');

/* Devuelve un listado con el nombre de producto, precio y nombre de fabricante, de todos
los productos que tengan un precio mayor o igual a $180. Ordene el resultado en primer
lugar por el precio (en orden descendente) y en segundo lugar por el nombre (en orden
ascendente) */

select p.nombre, p.precio, f.nombre
from producto p, fabricante f
where p.codigo_fabricante = f.codigo
and p.precio >= 180
order by p.precio desc, p.nombre asc;

/* Devuelve un listado de todos los fabricantes que existen en la base de datos, junto con los
productos que tiene cada uno de ellos. El listado deberá mostrar también aquellos
fabricantes que no tienen productos asociados. */

select *
from fabricante f 
Left join producto p
on p.codigo_fabricante = f.codigo ;

select * 
from fabricante;

/*Devuelve un listado donde sólo aparezcan aquellos fabricantes que no tienen ningún
producto asociado.*/

select *
from fabricante f
left join producto p
on p.codigo_fabricante = f.codigo
where p.precio is null;

/*Devuelve todos los productos del fabricante Lenovo. (Sin utilizar INNER JOIN).*/

select *
from producto p, fabricante f
where p.codigo_fabricante = f.codigo
and f.nombre like 'lenovo';

/*Devuelve todos los datos de los productos que tienen el mismo precio que el producto
más caro del fabricante Lenovo. (Sin utilizar INNER JOIN).*/

select *
from producto p, fabricante f
where p.codigo_fabricante = f.codigo
and p.precio > ;

SELECT *
FROM producto 
where precio =(SELECT MAX(precio) FROM producto , fabricante  WHERE fabricante.nombre = 'LENOVO');

/*3. Lista el nombre del producto más caro del fabricante Lenovo.*/

select p.nombre
from producto p
where precio = (SELECT MAX(precio) FROM producto, fabricante where fabricante.nombre = 'lenovo');

/*4. Lista todos los productos del fabricante Asus que tienen un precio superior al precio
medio de todos sus productos.*/

select *
from producto
where precio > (SELECT avg(precio) FROM producto, fabricante where fabricante.nombre = 'asus');

select round(avg (precio))
from producto;

/*Devuelve los nombres de los fabricantes que tienen productos asociados. (Utilizando IN o
NOT IN).*/


SELECT nombre
FROM fabricante 
WHERE codigo IN (select codigo_fabricante from producto);

/*Devuelve los nombres de los fabricantes que no tienen productos asociados. (Utilizando
IN o NOT IN).*/


SELECT nombre
FROM fabricante 
WHERE codigo NOT IN (SELECT codigo_fabricante FROM producto);

/*Devuelve un listado con todos los nombres de los fabricantes que tienen el mismo número
de productos que el fabricante Lenovo.*/

select f.nombre
from fabricante f, producto p
where p.codigo_fabricante=f.codigo
group by f.nombre
having count(f.nombre) = (select count(*) from producto where  codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = 'lenovo'));
/*having count(f.nombre) = (select count(*) from producto where codigo_fabricante='lenovo');*/



                
                

