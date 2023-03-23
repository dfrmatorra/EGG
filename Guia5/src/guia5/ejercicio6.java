/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
idénticas. Crear un programa que permita introducir un cuadrado por
teclado y determine si este cuadrado es mágico o no. El programa
deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author Dario
 */
public class ejercicio6 {

    public static void main(String[] args) {
        

        int[][] matriz = new int[3][3];

        System.out.println("Ingrese los elementos de la matriz del 1 al 9:");
        int aux = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                Scanner ingresar = new Scanner(System.in);
                aux = 0;
                aux = ingresar.nextInt();
                if (aux > 1 && aux < 9) {
                    matriz[i][j] = aux;
                } else {
                    System.out.println("Ingrese los elementos de la matriz del 1 al 9:");
                    aux = ingresar.nextInt();
                    matriz[i][j] = aux;

            }
               

            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("(" + matriz[i][j] + ")");
                
            }
            System.out.println(" ");
            
        }

        int fila1, fila2, fila3;
        fila1 = 0;
        fila2 = 0;
        fila3 = 0;

        for (int i = 0;
                i < 3; i++) {
            fila1 = fila1 + matriz[0][i];
            fila2 = fila2 + matriz[1][i];
            fila3 = fila3 + matriz[2][i];
        }

        int columna1, columna2, columna3;
        columna1 = 0;
        columna2 = 0;
        columna3 = 0;
        for (int i = 0;
                i < 3; i++) {
            columna1 = columna1 + matriz[i][0];
            columna2 = columna2 + matriz[i][1];
            columna3 = columna3 + matriz[i][2];
        }

        int diagonal1;
        diagonal1 = 0;
        for (int i = 0;
                i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    diagonal1 += matriz[i][j];
                }
            }

        }

        int diagonal2;
        diagonal2 = 0;
        for (int i = 0;
                i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i == 0 && j == 2) || ((i == 1) && (j == 1)) || (i == 2 && j == 0)) {
                    diagonal2 += matriz[i][j];
                }

            }

        }
        boolean condicionFila = false;
        boolean condicionColumna = false;
        boolean condicionDiagonal = false;
        boolean condicionFinal = false;

        if ((fila1 == fila2) && (fila2 == fila3)) {
            condicionFila = true;

        }

        if ((columna1 == columna2) && (columna2 == columna3)) {
            condicionColumna = true;
        }
        if (diagonal1 == diagonal2) {
            condicionDiagonal = true;
        }
        if ((fila1 == columna1) && (columna1 == diagonal1) && (condicionFila = true) && (condicionColumna = true) && (condicionDiagonal = true)) {
            condicionFinal = true;
        }

        if (condicionFinal
                == true) {
            System.out.println("La matriz es magica");
        } else {
            System.out.println("La matriz no es magica");

        }
    }
}



