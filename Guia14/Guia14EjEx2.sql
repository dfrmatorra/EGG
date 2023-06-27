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





















 