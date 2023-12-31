/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
 */
package Main;

import Servicios.PPServicios;
import java.util.Scanner;

public class Extra01Main {

    public static void main(String[] args) {

        PPServicios pps = new PPServicios();

        pps.crearPersona();

        pps.crearPerro();

        pps.adoptarPerros();

        pps.mostrar();
    }
}
