/*1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente.*/

select nombre
from jugadores
order by nombre asc;

/*2. Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 libras,
ordenados por nombre alfabéticamente.*/

select nombre, peso
from jugadores
where jugadores.peso > 200
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

select 



