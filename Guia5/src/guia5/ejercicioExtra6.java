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

        int[] vectorAleat1 = new int[5];

        for (int i = 0; i < vectorAleat1.length; i++) {
            vectorAleat1[i] = random.nextInt(20);
        }

        String[][] sopa = new String[20][20];

        iniciar(sopa, dimension);

        int cont = 1;

        do {

            for (int i = 0; i < 20; i++) {
                int aux = 1;
                
                int aleatorio = random.nextInt(20 - palabra.length());

                if (i == vectorAleat1[0] || i == vectorAleat1[1] || i == vectorAleat1[2] || i == vectorAleat1[3] || i == vectorAleat1[4]) {
                    String palabra = ingresarPalabra(aux);
                    aux++;
                    for (int j = 0; j < 20; j++) {

                        if (j >= aleatorio && j < (aleatorio + palabra.length())) {

                            sopa[i][j] = palabra.substring(j - aleatorio, ((j - aleatorio) + 1));

                        }

                    }

                }
            }
            cont++;
        } while (cont < 6);

        completar(sopa, dimension);

        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa.length; j++) {
                System.out.print(" " + sopa[i][j] + " ");
            }
            System.out.println("");
        }
    }

    /*------------------------------------------------------------------------------
    
     */
    public static String ingresarPalabra(int cont) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese palabras de 3 a 5 caracteres " + cont + ":");
        String palabra = leer.nextLine();
        if (palabra.length() > 5 || palabra.length() < 3) {
            System.out.println("Ingrese palabras de 3 a 5 caracteres " + cont + ":");
            palabra = leer.nextLine();
        }
        return palabra;
    }

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
}

//        String[] vector1 = new String[palabra1.length()];
//        String[] vector2 = new String[palabra2.length()];
//        String[] vector3 = new String[palabra3.length()];
//        String[] vector4 = new String[palabra4.length()];
//        String[] vector5 = new String[palabra5.length()];
