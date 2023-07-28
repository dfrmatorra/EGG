/*
Recorrer un vector de N enteros contabilizando cuántos números son de
1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package guia5;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Dario
 */
public class ejercicio3a {
    
    public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Ingrese la cantidad de numeros");
        int n = ingrese.nextInt();

        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {

            vector[i] = random.nextInt(99999);
        }
        for (int i = 0; i < n; i++) {
            System.out.print("(" + vector[i] + ")");
        }
        System.out.println(" ");
        int contd1 = 0;
        int contd2 = 0;
        int contd3 = 0;
        int contd4 = 0;
        int contd5 = 0;

        for (int i = 0; i < 5; i++) {

            if (vector[i] >= 1 && vector[i] < 10) {
                contd1++;
            }
            if (vector[i] >= 10 && vector[i] < 100) {
                contd2++;
            }
            if (vector[i] >= 100 && vector[i] < 1000) {
                contd3++;
            }
            if (vector[i] >= 1000 && vector[i] < 10000) {
                contd4++;
            }
            if (vector[1] >= 10000 && vector[i] < 100000) {
                contd5++;
            }
        }
        int[] contador = new int[5];
        contador[0] = contd1;
        contador[1] = contd2;
        contador[2] = contd3;
        contador[3] = contd4;
        contador[4] = contd5;

        for (int j = 0; j < 5; j++) {
            System.out.println("Numeros de " + (j + 1) + " digitos: " + contador[j]);
        }
    }
}
