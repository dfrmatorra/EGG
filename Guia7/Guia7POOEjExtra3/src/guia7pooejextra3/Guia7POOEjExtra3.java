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
package guia7pooejextra3;

import Clases.Juego;
import java.util.Scanner;

/**
 *
 * @author CASA
 */
public class Guia7POOEjExtra3 {

    public static void main(String[] args) {

        Juego primerJuego = new Juego();

        System.out.println("JUEGO DE ADIVINAR NUMERO");
        System.out.println("Ingresar cantidad de oportunidades en el modo de juego");
        Scanner leer = new Scanner(System.in);
        int intentos = leer.nextInt();
        System.out.println("El juego con " + intentos + " oportunidades empieza");
        System.out.println("--------------");

        int cond = 0;
        int trofeos1 = 0;
        int trofeos2 = 0;

        do {
            System.out.println("---JUGADOR 1---");
            System.out.println("Elige un numero:");
            int elegido = leer.nextInt();
            System.out.println("---JUGADOR 2---");
            cond = primerJuego.iniciar_juego(elegido, intentos);
              if (cond ==1){
                trofeos2++;
            }
        } while (cond == 1);

        System.out.println("-----------------");
        System.out.println("CAMBIO DE JUGADOR");
        System.out.println("-----------------");

        do {
            System.out.println("---JUGADOR 2---");
            System.out.println("Elige un numero:");
            int elegido = leer.nextInt();
            System.out.println("---JUGADOR 1---");
            cond = primerJuego.iniciar_juego(elegido, intentos);
            if (cond ==1){
                trofeos1++;
            }
        } while (cond == 1);

        System.out.println("El jugador 1 gano " + trofeos1 + " veces");
        System.out.println("El jugador 2 gano " + trofeos2 + " veces");

    }
}
