/*
Realizar un programa que llene una matriz de tamaño NxM con valores
aleatorios y muestre la suma de sus elementos.
 */
package guia5;

import java.util.Random;

/**
 * @author Dario
 */
public class ejercicioExtra5 {

    public static void main(String[] args) {
        //dos formas para aleatorio del 0 al 100
//        Random aleatorio = new Random();
//        int num1 = aleatorio.nextInt(100);
//        int num2 = (int)(Math.random()*100);
//        System.out.println("Random:" + num1);
//        System.out.println("Math.ramdom: " + num2);

        int vectorDim[] = new int[2];
        dimensionar(vectorDim);

        int matriz[][] = new int[vectorDim[0]][vectorDim[1]];

        llenarMatriz(matriz, vectorDim);

        mostrarMatriz(matriz, vectorDim);
        
        int sumaElementos = sumaMatriz(matriz, vectorDim);

        System.out.println("La suma de los elementos de la matriz es: " + sumaElementos);

    }

    /*---------------------------------------------------------*/
    public static void dimensionar(int vector[]) {
        Random azar = new Random();
        vector[0] = azar.nextInt(10);
        vector[1] = azar.nextInt(10);
    }

    public static void llenarMatriz(int matriz[][],int vector[]) {
        Random random = new Random();
        for (int i = 0; i < vector[0]; i++) {
            for (int j = 0; j < vector[1]; j++) {
                matriz[i][j] = random.nextInt(10);
            }

        }
    }

    public static void mostrarMatriz(int matriz[][], int vector[]) {
        for (int i = 0; i < vector[0]; i++) {
            for (int j = 0; j < vector[1]; j++) {
                System.out.print("(" + matriz[i][j] + ")");
            }
            System.out.println("");
        }
    }

    public static int sumaMatriz(int matriz[][], int vector[]) {
        int suma = 0;
        for (int i = 0; i < vector[0]; i++) {
            for (int j = 0; j < vector[1]; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }
}

