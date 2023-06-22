SELECT * FROM departamentos;
SELECT * FROM empleados;

/*Obtener el valor total a pagar a cada empleado del departamento 3000, que resulta
de: sumar el salario y la comisión, más una bonificación de 500. Mostrar el nombre del
empleado y el total a pagar, en orden alfabético.*/
SELECT nombre, (sal_emp + comision_emp + 500) 
AS total_pagar, id_depto
FROM Empleados
WHERE id_depto = 3000
ORDER BY nombre ASC;

/*Muestra los empleados cuyo nombre empiece con la letra J.*/
SELECT * FROM empleados where nombre like 'j%';

/*Listar el salario, la comisión, el salario total (salario + comisión) y nombre, de aquellos
empleados que tienen comisión superior a 1000.*/
SELECT nombre, sal_emp, comision_emp, (sal_emp + comision_emp) AS salario_total
FROM empleados
WHERE comision_emp > 1000;

/*15. Obtener un listado similar al anterior, pero de aquellos empleados que NO tienen
comisión.*/
SELECT nombre, sal_emp, comision_emp
FROM empleados
WHERE comision_emp = 0;

/*16. Obtener la lista de los empleados que ganan una comisión superior a su sueldo.*/
SELECT * FROM empleados
WHERE comision_emp>sal_emp;

/*17.Listar los empleados cuya comisión es menor o igual que el 30% de su sueldo.*/
SELECT * FROM empleados
WHERE comision_emp<=(sal_emp*0.3);

/*18.Hallar los empleados cuyo nombre no contiene la cadena “MA”*/
SELECT * FROM empleados
WHERE nombre NOT LIKE '%MA%';

/*19. Obtener los nombres de los departamentos que sean “Ventas”, “Investigación” o
‘Mantenimiento.*/
SELECT * FROM departamentos
WHERE nombre_depto like 'ventas' or nombre_depto like 'Investigación' or nombre_depto  like 'Mantenimiento';

/*20. Ahora obtener el contrario, los nombres de los departamentos que no sean “Ventas” ni
“Investigación” ni ‘Mantenimiento.*/
SELECT * FROM departamentos
WHERE nombre_depto != 'ventas' and nombre_depto != 'Investigación' and nombre_depto  != 'Mantenimiento';

/*21. Mostrar el salario más alto de la empresa.*/
SELECT MAX(sal_emp) AS MAX_SALARIO
FROM empleados;
SELECT *FROM empleados
WHERE sal_emp = (SELECT MAX(sal_emp) FROM empleados);

/*22. Mostrar el nombre del último empleado de la lista por orden alfabético.*/
SELECT * FROM empleados WHERE nombre = (SELECT MAX(nombre) FROM empleados);

/*23. Hallar el salario más alto, el más bajo y la diferencia entre ellos.*/

SELECT MAX(sal_emp) AS salario_maximo, 
       MIN(sal_emp) AS salario_minimo, 
       MAX(sal_emp) - MIN(sal_emp) AS diferencia_salarios
FROM empleados;

SELECT *, (SELECT MAX(sal_emp) FROM empleados) - sal_emp AS salario_dif
FROM empleados
WHERE sal_emp = (SELECT MIN(sal_emp) FROM empleados)
   OR sal_emp = (SELECT MAX(sal_emp) FROM empleados);
   
/*24. Hallar el salario promedio por departamento.*/
SELECT id_depto, AVG(sal_emp) AS promedio_salario
FROM empleados
GROUP BY id_depto;
   
/*25 Hallar los departamentos que tienen más de tres empleados. Mostrar el número de
empleados de esos departamentos.*/

SELECT id_depto, COUNT(*) AS num_empleados
FROM empleados
GROUP BY id_depto
HAVING COUNT(*) > 3;

SELECT d.id_depto, d.nombre_depto, COUNT(*) AS num_empleados
FROM empleados e, departamentos d
WHERE d.id_depto = e.id_depto
GROUP BY d.id_depto
HAVING COUNT(*) > 3;

/*26. Hallar los departamentos que no tienen empleados*/

SELECT d.id_depto, d.nombre_depto, COUNT(*) AS num_empleados
FROM empleados e, departamentos d
WHERE d.id_depto = e.id_depto
GROUP BY d.id_depto
HAVING COUNT(*) = 0;

/*27. Mostrar la lista de empleados, con su respectivo departamento y el jefe de cada
departamento.*/

SELECT e.nombre, d.nombre_depto, d.nombre_jefe_depto
FROM empleados e, departamentos d
WHERE e.id_depto = d.id_depto;

SELECT e.nombre, d.nombre_depto, d.nombre_jefe_depto, d.id_depto
FROM empleados e
JOIN departamentos d ON e.id_depto = d.id_depto;

/*28. Mostrar la lista de los empleados cuyo salario es mayor o igual que el promedio de la
empresa. Ordenarlo por departamento.*/

select *, (select avg (sal_emp)from empleados) as promedio
from empleados
where sal_emp >= (select avg(sal_emp) from empleados)
ORDER BY id_depto;










