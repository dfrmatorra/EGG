/*
Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos constructores: un
constructor vacío y otro con la hora, minutos y segundos ingresado por el usuario. Deberá definir
además, los métodos getters y setters correspondientes, y el método imprimirHoraCompleta().
Recordar crear una validación sobre las horas, minutos y segundos ingresados por el usuario. Te
animas a simular el paso del tiempo en consola??????
Ejercicio 3
 */
package Entidades;

/**
 *
 * @author CASA
 */
public class Hora {

    private int hora;
    private int minutos;
    private int segundos;

    public Hora() {
    }

    public Hora(int hora, int minutos, int seguundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = seguundos;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
        String minString = Integer.toString(minutos);

    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    @Override
    public String toString() {
        String hh = "";
        String m = "";
        String s = "";

        if (hora < 10) {
            hh = "0";
        }
        if (minutos < 10) {
            m = "0";
        }
        if (segundos < 10) {
            s = "0";
        }
        return "La hora actual es: {"+  hh + hora + " : " + m + minutos + " : " + s + segundos + '}';

    }

}
