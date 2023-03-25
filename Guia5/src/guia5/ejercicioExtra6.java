/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5
caracteres y, a medida que el usuario las va ingresando, construya una
“sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las
palabras se ubicarán todas en orden horizontal en una fila que será
seleccionada de manera aleatoria. Una vez concluida la ubicación de las
palabras, rellene los espacios no utilizados con un número aleatorio del 0
al 9. Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java substring(), Length() y Math.random().
 */
package guia5;

import java.util.Random;
import java.util.Scanner;
/*
 @author Dario
 */
public class ejercicioExtra6 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        int dimension = 30;//dimension de la sopa de letras
        int cantidadPalabras = 5; //cantidad de palabras para incorporar
        
//crear e inicializar matriz sopa
        String[][] sopa = new String[dimension][dimension];
        iniciar(sopa, dimension);
        
//bucle completa el vector palabra para poder completar con las condiciones solicitadas
        String palabra[] = new String[cantidadPalabras];

        for (int i = 0; i < cantidadPalabras; i++) {
            System.out.println("Ingrese una palabra de 3 a 5 caracteres (" + (i + 1) + "):");
            palabra[i] = leer.nextLine();
            while (palabra[i].length() > 5 || palabra[i].length() < 3) {
                System.out.println("Ingrese una palabra de 3 a 5 caracteres (" + (i + 1) + "):");
                palabra[i] = leer.nextLine();
            }
        } 

//generar 2 vectores aleatorios
        int[] vectorAleat1 = new int[cantidadPalabras]; //5 numeros del 0 al 20
        aleatorio1(cantidadPalabras, vectorAleat1);//completa el vector vectorAleat1[cont]
        int[] vectorAleat2 = new int[cantidadPalabras];//cantidad de numeros del 0 hasta 20-el largo de la palabra, para que se salga de la columna 20
        aleatorio2(cantidadPalabras, dimension, palabra, vectorAleat2);//completa el vector vectorAleat2[cont]

//completo matriz sopa con las palabras ingresadas en forma aleatoria
        int cont = 0;
        do {
            for (int i = 0; i < dimension; i++) {
                if (i == vectorAleat1[cont]) {
                    for (int j = 0; j < dimension; j++) {
                        if ((j >= vectorAleat2[cont]) && (j < (vectorAleat2[cont] + (palabra[cont].length())))) {
                            sopa[i][j] = palabra[cont].substring(j - vectorAleat2[cont], (j - vectorAleat2[cont]) + 1);
                        }
                    }
                }
            }
            cont++;
        } while (cont < cantidadPalabras);//bucle hasta completar las 5 palabras

//completo con numeros del 0 al 9 en forma aleatoria
        completar(sopa, dimension);

//muestro la matriz sopa con palabras y numero mezclados aleatoriamente
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa.length; j++) {
                System.out.print(" " + sopa[i][j] + " ");
            }
            System.out.println("");
        }
    }
    //--------------------------------------------------------------------------//
    public static void iniciar(String sopa[][], int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                sopa[i][j] = "*";
            }
        }
    }
    public static void completar(String sopa[][], int num) {
        Random random = new Random();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (sopa[i][j] == "*") {
                    sopa[i][j] = String.valueOf(random.nextInt(9));
                }
            }
        }
    }
    public static void aleatorio1(int num, int vectorAleat[]) {
        Random random = new Random();
        int cont = 0;
        for (int i = 0; i < num; i++) {
            vectorAleat[i] = random.nextInt(20);

            if (cont >= 1) {
                while (vectorAleat[cont - 1] == vectorAleat[cont]) {
                    vectorAleat[i] = random.nextInt(20);
                }
            }
            cont++;
        }
    }
    public static void aleatorio2(int num, int dimension, String palabra[], int vectorAleat2[]) {
        Random random = new Random();
        for (int i = 0; i < num; i++) {
            vectorAleat2[i] = random.nextInt(dimension - palabra[i].length());
        }

    }
}

