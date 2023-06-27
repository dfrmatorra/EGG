/*1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente.*/

select nombre
from jugadores
order by nombre asc;

/*2. Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 libras,
ordenados por nombre alfabéticamente.*/

select nombre, peso, Posicion
from jugadores
where jugadores.peso > 200 and jugadores.Posicion like '%c%'
order by nombre;

/*3. Mostrar el nombre de todos los equipos ordenados alfabéticamente.*/

select nombre
from equipos
order by nombre asc;

/*4. Mostrar el nombre de los equipos del este (East).*/

select nombre, conferencia
from equipos
where conferencia in ('east');

/*5. Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.*/

select nombre, ciudad
from equipos
where ciudad like'c%'
order by nombre;

/*6. Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.*/

select *
from jugadores
order by Nombre_equipo;

/*7. Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.*/

select *
from jugadores
where Nombre_equipo = 'raptors'
order by nombre;

/*8. Mostrar los puntos por partido del jugador ‘Pau Gasol’.*/

select j.nombre, e.Puntos_por_partido
from estadisticas e, jugadores j
where e.jugador=j.codigo
and j.nombre = 'pau gasol';

select Puntos_por_partido
from estadisticas
where jugador = (select codigo from jugadores where nombre = 'pau gasol');

/*9. Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.*/

select j.nombre, e.Puntos_por_partido, e.temporada
from estadisticas e, jugadores j
where e.jugador=j.codigo
and j.nombre = 'pau gasol' and e.temporada = '04/05';


/*10. Mostrar el número de puntos de cada jugador en toda su carrera.*/

select j.nombre, round(sum(e.Puntos_por_partido))
from estadisticas e, jugadores j
where e.jugador=j.codigo
group by j.nombre
order by sum(e.Puntos_por_partido) desc;

/*11. Mostrar el número de jugadores de cada equipo.*/

select e.Nombre, count(j.Nombre_equipo) as numero_jugadores
from jugadores j, equipos e
where j.Nombre_equipo=e.Nombre
group by e.nombre;

/*12. Mostrar el jugador que más puntos ha realizado en toda su carrera.*/

select j.nombre, round (sum(e.Puntos_por_partido)) as puntos_carrera
from estadisticas e, jugadores j
where e.jugador=j.codigo
group by j.nombre 
order by puntos_carrera desc
limit 1;

/*13. Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.*/

select j.nombre as nombre_jugador, j.Altura, e.Nombre as nombre_equipo, e.Conferencia, e.Division
from equipos e, jugadores j
where e.Nombre=j.Nombre_equipo
having j.Altura = (select max(Altura) from jugadores)
limit 1;

select nombre, conferencia, division 
from equipos 
where nombre =(
	select Nombre_equipo 
    from jugadores
    where altura=(
    select max(altura) from jugadores)
    );

/*14. Mostrar la media de puntos en partidos de los equipos de la división Pacific.*/

select e.nombre, avg((p.puntos_local+p.puntos_visitante)/2) as media_puntos_pacific
from partidos p, equipos e
where (e.Nombre=p.equipo_local or e.Nombre=p.equipo_visitante)
and e.Division = 'pacific'
group by e.nombre;

/*15. Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor
diferencia de puntos.*/

select equipo_local, equipo_visitante, abs(puntos_local - puntos_visitante) as mayor_diferencia
from partidos
order by mayor_diferencia desc
limit 4;

SELECT *,abs( puntos_local - puntos_visitante) as diferencia 
from partidos 
where abs( puntos_local - puntos_visitante)=(
select max(abs( puntos_local - puntos_visitante))
 from partidos);

/*16. Mostrar la media de puntos en partidos de los equipos de la división Pacific.*/


SELECT round(AVG(puntos_visitante)) AS media_puntos_visitante 
FROM partidos p
INNER JOIN equipos e ON p.equipo_visitante = e.Nombre
WHERE e.Division = 'pacific';

SELECT round(AVG(puntos_local)) AS media_puntos_local
FROM partidos p
INNER JOIN equipos e ON p.equipo_local = e.Nombre
WHERE e.Division = 'pacific';

SELECT round(AVG((puntos_local + puntos_visitante) / 2))  AS media_puntos
FROM partidos p, equipos e
WHERE e.Nombre = p.equipo_local
or e.Nombre = p.equipo_visitante
AND e.Division = 'pacific';

/*17. Mostrar los puntos de cada equipo en los partidos, tanto de local como de visitante.*/

/*cantidad de partidos con where*/
select equipos.nombre, count(nombre) as cantidad_partidos
from partidos, equipos
where equipo_visitante = equipos.Nombre
or equipo_local = equipos.Nombre
group by nombre;

/*cantidad de partidos con con inner join*/
SELECT equipos.nombre, COUNT(nombre) AS cantidad_partidos
FROM partidos
INNER JOIN equipos ON partidos.equipo_visitante = equipos.Nombre OR partidos.equipo_local = equipos.Nombre
GROUP BY equipos.nombre;

/*con having pero no funciona TODO*/
SELECT equipos.nombre, COUNT(nombre) as cantidad_partidos
FROM partidos
INNER JOIN equipos ON partidos.equipo_visitante = equipos.Nombre OR partidos.equipo_local = equipos.Nombre
GROUP BY equipos.nombre
HAVING COUNT(CASE WHEN equipos.division = 'pacific' THEN 1 ELSE 0 END) > 0;


SELECT equipo_local, SUM(puntos_local)
FROM partidos
group by equipo_local;

SELECT equipo_visitante, SUM(puntos_visitante)
FROM partidos
group by equipo_visitante;

/*solucion*/
SELECT equipo, SUM(total_puntos) AS puntos_totales
FROM (
    SELECT equipo_local AS equipo, SUM(puntos_local) AS total_puntos
    FROM partidos
    GROUP BY equipo_local
    
    UNION ALL
    
    SELECT equipo_visitante AS equipo, SUM(puntos_visitante) AS total_puntos
    FROM partidos
    GROUP BY equipo_visitante
) AS subquery
GROUP BY equipo
ORDER BY equipo;

/*18. Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante,
equipo_ganador), en caso de empate sera null.*/

/*solucion con CASE*/
SELECT codigo, equipo_local, puntos_local, equipo_visitante, puntos_visitante,
       CASE WHEN puntos_local > puntos_visitante THEN equipo_local
            WHEN puntos_local < puntos_visitante THEN equipo_visitante
            ELSE NULL
       END AS equipo_ganador
FROM partidos;

/*solucion con IF*/
SELECT codigo, equipo_local, puntos_local, equipo_visitante, puntos_visitante,
       IF(puntos_local > puntos_visitante, equipo_local, IF(puntos_local < puntos_visitante, equipo_visitante, NULL)) AS equipo_ganador
FROM partidos;

select *,   if (puntos_visitante > puntos_local, equipo_visitante,  -- if
			if (puntos_visitante < puntos_local, equipo_local, 		-- else if
			null)) 													-- else
as equipo_ganador
from partidos;

select *,
	case																-- switch
		when puntos_local > puntos_visitante then equipo_local			-- case1, then (es la funcion)
		when puntos_local < puntos_visitante then equipo_visitante 		-- case2, then (es la funcion)
        else 
        null															-- else = default 
	end																	-- llave de cierre de switch // break
	as equipo_ganador
	from partidos;














