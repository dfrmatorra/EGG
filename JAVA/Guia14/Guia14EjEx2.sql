/*1. Devuelve un listado con el código de oficina y la ciudad donde hay oficinas.*/

select ciudad, codigo_oficina
from oficina;

/*2. Devuelve un listado con la ciudad y el teléfono de las oficinas de España.*/

select ciudad, telefono
from oficina
where pais = 'españa';

/*3. Devuelve un listado con el nombre, apellidos y email de los empleados cuyo jefe tiene un
código de jefe igual a 7.*/

select nombre, apellido1, apellido2, email, codigo_jefe
from empleado
where codigo_jefe >= 7;

/*4. Devuelve el nombre del puesto, nombre, apellidos y email del jefe de la empresa.*/

select puesto, nombre, apellido1, apellido2, email
from empleado 
where codigo_empleado=1;

/*5. Devuelve un listado con el nombre, apellidos y puesto de aquellos empleados que no sean
representantes de ventas.*/

select nombre,apellido1,apellido2,puesto
from empleado 
where puesto not in ('representante ventas', 'representante de ventas');

/*6. Devuelve un listado con el nombre de los todos los clientes españoles.*/

select *
from cliente
where pais in ('spain', 'españa');

/*7. Devuelve un listado con los distintos estados por los que puede pasar un pedido.*/

select estado
from pedido
group by estado;

/*8. Devuelve un listado con el código de cliente de aquellos clientes que realizaron algún pago
en 2008. Tenga en cuenta que deberá eliminar aquellos códigos de cliente que aparezcan
repetidos. Resuelva la consulta:
o Utilizando la función YEAR de MySQL.
o Utilizando la función DATE_FORMAT de MySQL.
o Sin utilizar ninguna de las funciones anteriores.*/

SELECT DISTINCT codigo_cliente
FROM pago
WHERE YEAR(fecha_pago) = 2008;

SELECT DISTINCT codigo_cliente
FROM pago
WHERE DATE_FORMAT(fecha_pago, '%Y') = '2008';

SELECT DISTINCT codigo_cliente
FROM pago
WHERE fecha_pago >= '2008-01-01' AND fecha_pago < '2009-01-01';

/*9. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de
entrega de los pedidos que no han sido entregados a tiempo.*/

select codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega
from pedido
where DATE_FORMAT(fecha_entrega,'%Y-%m-%d') > DATE_FORMAT(fecha_esperada,'%Y-%m-%d');

/*10. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de
entrega de los pedidos cuya fecha de entrega ha sido al menos dos días antes de la fecha
esperada.
o Utilizando la función ADDDATE de MySQL.
o Utilizando la función DATEDIFF de MySQL.*/

select codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega
FROM pedido
WHERE fecha_entrega < ADDDATE(fecha_esperada, -1);

SELECT codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega
FROM pedido
WHERE DATEDIFF(fecha_esperada, fecha_entrega) >= 2;

/*11. Devuelve un listado de todos los pedidos que fueron rechazados en 2009.*/

select *
from pedido
where estado = 'rechazado' and DATE_FORMAT(fecha_esperada, '%Y') = '2009';

/*12. Devuelve un listado de todos los pedidos que han sido entregados en el mes de enero de
cualquier año.*/

select *
from pedido
where date_format(fecha_entrega,'%m') = 01;

/*13. Devuelve un listado con todos los pagos que se realizaron en el año 2008 mediante Paypal.
Ordene el resultado de mayor a menor.*/

select *
from pedido
where date_format(fecha_entrega,'%m') = 01;

/*14. Devuelve un listado con todas las formas de pago que aparecen en la tabla pago. Tenga en
cuenta que no deben aparecer formas de pago repetidas.*/

select forma_pago 
from pago
group by forma_pago;

/*15. Devuelve un listado con todos los productos que pertenecen a la gama Ornamentales y que
tienen más de 100 unidades en stock. El listado deberá estar ordenado por su precio de
venta, mostrando en primer lugar los de mayor precio.*/

select *
from producto
where gama = 'ornamentales'
and cantidad_en_stock > 100
order by precio_venta desc;

/*16. Devuelve un listado con todos los clientes que sean de la ciudad de Madrid y cuyo
representante de ventas tenga el código de empleado 11 o 30.*/

select *
from cliente
where ciudad='madrid'
and codigo_empleado_rep_ventas in (11, 30);

/*Consultas multitabla (Composición interna)
Las consultas se deben resolver con INNER JOIN.
1. Obtén un listado con el nombre de cada cliente y el nombre y apellido de su representante
de ventas.*/

select cliente.nombre_cliente, empleado.nombre, empleado.apellido1
from cliente
inner join empleado on cliente.codigo_empleado_rep_ventas = empleado.codigo_empleado;

/*2. Muestra el nombre de los clientes que hayan realizado pagos junto con el nombre de sus
representantes de ventas.*/

select pago.id_transaccion, cliente.nombre_cliente, empleado.nombre as nombre_representante, empleado.apellido1 as apellido_representante
from cliente
inner join empleado on cliente.codigo_empleado_rep_ventas = empleado.codigo_empleado
inner join pago on pago.codigo_cliente = cliente.codigo_cliente;

/*3. Muestra el nombre de los clientes que no hayan realizado pagos junto con el nombre de
sus representantes de ventas.*/

select cliente.nombre_cliente, empleado.nombre as nombre_representante, empleado.apellido1 as apellido_representante, pago.id_transaccion
from cliente
left join pago ON pago.codigo_cliente = cliente.codigo_cliente
inner join empleado on empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas
where pago.id_transaccion is null;

/*4. Devuelve el nombre de los clientes que han hecho pagos y el nombre de sus representantes
junto con la ciudad de la oficina a la que pertenece el representante.*/

select cliente.nombre_cliente, empleado.nombre as nombre_representante, empleado.apellido1 as apellido_representante, oficina.ciudad
from cliente
inner join pago on cliente.codigo_cliente = pago.codigo_cliente
inner join empleado on cliente.codigo_empleado_rep_ventas = empleado.codigo_empleado
inner join oficina on empleado.codigo_oficina = oficina.codigo_oficina;

/*5. Devuelve el nombre de los clientes que no hayan hecho pagos y el nombre de sus
representantes junto con la ciudad de la oficina a la que pertenece el representante.*/

select cliente.nombre_cliente, empleado.nombre as nombre_representante, empleado.apellido1 as apellido_representante, oficina.ciudad, pago.id_transaccion
from cliente
inner join empleado on cliente.codigo_empleado_rep_ventas = empleado.codigo_empleado
inner join oficina on empleado.codigo_oficina = oficina.codigo_oficina
left join pago ON pago.codigo_cliente = cliente.codigo_cliente
where pago.id_transaccion is null;

/*6. Lista la dirección de las oficinas que tengan clientes en Fuenlabrada.*/

select cliente.nombre_cliente, cliente.ciudad, oficina.linea_direccion1 as direccion_oficina_1, oficina.linea_direccion2 as direccion_oficina_2
from oficina
inner join empleado on oficina.codigo_oficina = empleado.codigo_oficina
inner join cliente on empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas
where cliente.ciudad = 'fuenlabrada';

/*7. Devuelve el nombre de los clientes y el nombre de sus representantes junto con la ciudad
de la oficina a la que pertenece el representante.*/

select cliente.nombre_cliente, empleado.nombre as nombre_rep, empleado.apellido1 as apellido_rep, oficina.ciudad
from empleado
inner join cliente on cliente.codigo_empleado_rep_ventas = empleado.codigo_empleado
inner join oficina on empleado.codigo_oficina = oficina.codigo_oficina;

/*8. Devuelve un listado con el nombre de los empleados junto con el nombre de sus jefes.*/


SELECT empleado.nombre, empleado.apellido1, jefe.nombre AS nombre_jefe
FROM empleado
INNER JOIN empleado AS jefe ON empleado.codigo_jefe = jefe.codigo_empleado;
 

/*9. Devuelve el nombre de los clientes a los que no se les ha entregado a tiempo un pedido.*/

select cliente.nombre_cliente, pedido.codigo_pedido, pedido.fecha_esperada, pedido.fecha_entrega
from cliente
inner join pedido on pedido.codigo_cliente = cliente.codigo_cliente
where date(fecha_esperada) < date(fecha_entrega);

/*10. Devuelve un listado de las diferentes gamas de producto que ha comprado cada cliente.*/

select distinct cliente.nombre_cliente, producto.gama
from cliente
inner join pedido on pedido.codigo_cliente = cliente.codigo_cliente	-- codigo pedido
inner join detalle_pedido on detalle_pedido.codigo_pedido = pedido.codigo_pedido -- codigo producto
inner join producto on producto.codigo_producto = detalle_pedido.codigo_producto;

/*Consultas multitabla (Composición externa)
Resuelva todas las consultas utilizando las cláusulas LEFT JOIN, RIGHT JOIN, JOIN.
1. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pago.*/

select cliente.*, pago.id_transaccion
from cliente
left join pago on cliente.codigo_cliente = pago.codigo_cliente
where pago.id_transaccion is null;

/*2. Devuelve un listado que muestre solamente los clientes que no han realizado ningún
pedido.*/

select cliente.*, pedido.codigo_pedido
from cliente
left join pedido on cliente.codigo_cliente = pedido.codigo_cliente
where pedido.codigo_pedido is null;

/*3. Devuelve un listado que muestre los clientes que no han realizado ningún pago y los que
no han realizado ningún pedido.*/

select cliente.*, pedido.codigo_pedido, pago.id_transaccion
from cliente
left join pedido on cliente.codigo_cliente = pedido.codigo_cliente
left join pago on cliente.codigo_cliente = pago.codigo_cliente
where pedido.codigo_pedido is null and pago.id_transaccion is null;

/*4. Devuelve un listado que muestre solamente los empleados que no tienen una oficina
asociada.*/

select empleado.*, oficina.codigo_oficina
from empleado
left join oficina on empleado.codigo_oficina = oficina.codigo_oficina
where oficina.codigo_oficina is null;

/*5. Devuelve un listado que muestre solamente los empleados que no tienen un cliente
asociado.*/

select empleado.*, cliente.nombre_cliente
from empleado
left join cliente on cliente.codigo_empleado_rep_ventas = empleado.codigo_empleado
where cliente.codigo_empleado_rep_ventas is null;

/*6. Devuelve un listado que muestre los empleados que no tienen una oficina asociada y los
que no tienen un cliente asociado.*/

select empleado.*, oficina.codigo_oficina, cliente.nombre_cliente
from empleado
left join oficina on empleado.codigo_oficina = oficina.codigo_oficina
left join cliente on cliente.codigo_empleado_rep_ventas = empleado.codigo_empleado
where oficina.codigo_oficina is null and cliente.codigo_empleado_rep_ventas is null;

/*7. Devuelve un listado de los productos que nunca han aparecido en un pedido.*/

select producto.*, detalle_pedido.codigo_pedido
from producto
left join detalle_pedido on detalle_pedido.codigo_producto = producto.codigo_producto
where detalle_pedido.codigo_pedido is null;

/*8. Devuelve las oficinas donde no trabajan ninguno de los empleados que hayan sido los
representantes de ventas de algún cliente que haya realizado la compra de algún producto
de la gama Frutales.*/

select oficina.codigo_oficina, empleado.nombre, empleado.puesto, producto.gama
from oficina
inner join empleado on empleado.codigo_oficina = oficina.codigo_oficina
inner join cliente on cliente.codigo_empleado_rep_ventas = empleado.codigo_empleado
inner join pedido on pedido.codigo_cliente = cliente.codigo_cliente
inner join detalle_pedido on detalle_pedido.codigo_pedido= pedido.codigo_pedido
inner join producto on producto.codigo_producto = detalle_pedido.codigo_producto
where producto.gama = 'frutales' and empleado.puesto = 'representante ventas';

/*9. Devuelve un listado con los clientes que han realizado algún pedido, pero no han realizado
ningún pago.*/

select cliente.*, pedido.codigo_pedido, pago.id_transaccion
from cliente
left join pedido on cliente.codigo_cliente = pedido.codigo_cliente
left join pago on cliente.codigo_cliente = pago.codigo_cliente
where pago.id_transaccion is null and pedido.codigo_pedido is not null;

/*10. Devuelve un listado con los datos de los empleados que no tienen clientes asociados y el
nombre de su jefe asociado.*/

select empleado.*, cliente.nombre_cliente, jefe.nombre AS nombre_jefe
from empleado
INNER JOIN empleado AS jefe ON empleado.codigo_jefe = jefe.codigo_empleado
left join cliente on cliente.codigo_empleado_rep_ventas = empleado.codigo_empleado
where cliente.codigo_empleado_rep_ventas is null;

/*Consultas resumen
1. ¿Cuántos empleados hay en la compañía?*/

select count(*)
from empleado;

/*2. ¿Cuántos clientes tiene cada país?*/

select cliente.pais, count(cliente.pais)
from cliente
group by cliente.pais;

/*3. ¿Cuál fue el pago medio en 2009?*/

SELECT AVG(total) as pago_medio_2009
FROM pago
WHERE YEAR(fecha_pago) = 2009;


































 