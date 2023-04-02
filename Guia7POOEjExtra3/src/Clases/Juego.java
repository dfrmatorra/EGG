/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita
a dos jugadores jugar un juego de adivinanza de números. El primer
jugador elige un número y el segundo jugador intenta adivinarlo. El
segundo jugador tiene un número limitado de intentos y recibe una pista
de "más alto" o "más bajo" después de cada intento. El juego termina
cuando el segundo jugador adivina el número o se queda sin intentos.
Registra el número de intentos necesarios para adivinar el número y el
número de veces que cada jugador ha ganado.
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author CASA
 */
public class Juego {

    String jugador1;
    String jugador2;

    public Juego() {
    }

    public int iniciar_juego(int elegido, int intentos) {
        int num;

        do {
            System.out.println("Adivina el numero:");
            Scanner leer = new Scanner(System.in);
            num = leer.nextInt();
            if (num > elegido) {
                System.out.println("Mas bajo");
                intentos--;
                System.out.println("Te quedan " + intentos + " intentos");
            } else if (num < elegido) {
                System.out.println("Mas alto");
                intentos--;
                System.out.println("Te quedan " + intentos + " intentos");
            }
        } while (num != elegido && intentos != 0);

        if (elegido == num) {
            System.out.println("Acertaste el numero, era el " + elegido);
            return 1;
        } else {
            System.out.println("No acertaste el numero");
            return 0;
        }
    }

}
