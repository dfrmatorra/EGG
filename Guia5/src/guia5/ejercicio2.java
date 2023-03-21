/*
Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido
 */
package guia5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Dario
 */
public class ejercicio2 {


   public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Ingrese la dimension del vector");
        int n = ingrese.nextInt();

        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = random.nextInt(5);
        }

        for (int i = 0; i < n; i++) {
            System.out.print("(" + vector[i] + ")");
        }
        System.out.println("");

        System.out.println("Ingrese un numero a buscar");
            
        int cont = 0;
        
        int buscar = ingrese.nextInt();
        for (int i = 0; i < n; i++) {
            if (vector[i] == buscar) {
                System.out.println("Su numero esta en el elemento [" + (i + 1) + "]");
                cont++;
            } 
           
        }
        if (cont == 0) {
            System.out.println("su numero no esta");
        }

    }
}
