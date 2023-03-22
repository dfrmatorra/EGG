package guia5;

/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
A se denota por B y se obtiene cambiando sus filas por columnas (o
viceversa).
 */

import java.util.Random;

public class ejercicio4 {

    public static void main(String[] args) {
        
        Random random = new Random();
        int[][] matriz = new int[4][4];
        
        String aux = "";
        
//      Completar la matriz  
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }
        
//      Mostrar la matriz
        for (int[] fila : matriz) {
            aux = "";
            for (int elemento : fila) {
                aux += " " + elemento;

            }

            System.out.println(aux);
        }
        
        System.out.println("--------------");

        int[][] matriz2 = new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz2[j][i] = matriz[i][j];
            }
        }
        
        for (int[] fila : matriz2) {
            aux = "";
            for (int elemento : fila) {
                aux += " " + elemento;

            }

            System.out.println(aux);

        }

        }
}