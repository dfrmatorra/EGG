/*
Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos constructores: un
constructor vacío y otro con la hora, minutos y segundos ingresado por el usuario. Deberá definir
además, los métodos getters y setters correspondientes, y el método imprimirHoraCompleta().
Recordar crear una validación sobre las horas, minutos y segundos ingresados por el usuario. Te
animas a simular el paso del tiempo en consola??????

 */
package ejerciciosextra2;

import Entidades.Hora;
import Servicios.HoraServicios;
import java.time.LocalTime;


/**
 *
 * @author DarioF
 */
public class EjerciciosExtra2 {

    public static void main(String[] args) {

        HoraServicios HoraServ = new HoraServicios();

        Hora reloj = HoraServ.ingresarHora();

        HoraServ.mostrarHora(reloj);

           }

}
