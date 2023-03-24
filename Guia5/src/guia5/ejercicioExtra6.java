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

/**
 *
 * @author Dario
 */
public class ejercicioExtra6 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        int dimension = 20;
        int cantidadPalabras = 5;

        String[][] sopa = new String[20][20];

        iniciar(sopa, dimension);
//buclecompleta el vector palabra para poder completar con las condiciones solicitadas
        String palabra[] = new String[5];
        for (int i = 0; i < 5; i++) {
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
        int[] vectorAleat2 = new int[cantidadPalabras];//5 numeros del 0 hasta 20-el largo de la palabra, para que se salga de la columna 20
        aleatorio2(cantidadPalabras, palabra, vectorAleat2);//completa el vector vectorAleat2[cont]

//completo matriz sopa con las palabras ingresadas en forma aleatoria
        int cont = 0;
        do {

            for (int i = 0; i < 20; i++) {
                if (i == vectorAleat1[cont]) {
                    for (int j = 0; j < 20; j++) {
                        if ((j >= vectorAleat2[cont]) && (j < (vectorAleat2[cont] + (palabra[cont].length())))) {
                            sopa[i][j] = palabra[cont].substring(j - vectorAleat2[cont], (j - vectorAleat2[cont]) + 1);
                        }
                    }
                }
            }
            cont++;
        } while (cont < 5);//bucle hasta completar las 5 palabras
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

    public static void aleatorio2(int num, String palabra[], int vectorAleat[]) {
        Random random = new Random();
        for (int i = 0; i < num; i++) {
            vectorAleat[i] = random.nextInt(20 - palabra[i].length());
        }

    }
}

//        String[] vector1 = new String[palabra1.length()];
//        String[] vector2 = new String[palabra2.length()];
//        String[] vector3 = new String[palabra3.length()];
//        String[] vector4 = new String[palabra4.length()];
//        String[] vector5 = new String[palabra5.length()];
