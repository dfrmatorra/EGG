/*
a) Método fechaNacimiento que pregunte al usuario día, mes y año de
su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =
new Date(anio, mes, dia);
b) Método fechaActual que cree un objeto fecha con el día actual. Para
esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
fechaActual = new Date();
El método debe retornar el objeto Date.
c) Método diferencia que reciba las dos fechas por parámetro
 */
package Servicios;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author DarioF
 */
public class FechaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Date fechaNacimiento (){
        System.out.println("FECHA DE NACIMIENTO");
        System.out.println("Ingrese dia:");
        int dia = leer.nextInt();
        System.out.println("Ingrese mes:");
        int mes = leer.nextInt();
        System.out.println("Ingrese anio:");
        int anio = leer.nextInt();
        return new Date (anio, mes, dia);
    }
    
    public Date fechaActual (){
        Date fechaActual = new Date();
        return fechaActual;
    }
    
    public void diferencia (Date fechaNac, Date fechaActual){
        long diferenciaEnMilisegundos = fechaNac.getTime() - fechaActual.getTime();
        int dias = (int) (diferenciaEnMilisegundos / (1000 * 60 * 60 * 24));
        int edad = 1900 -(dias / 365);
        System.out.println("La edad es: " + edad);
    }
    
}
