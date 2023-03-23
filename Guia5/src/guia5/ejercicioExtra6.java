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
import static jdk.nashorn.internal.objects.NativeString.substring;

/**
 *
 * @author Dario
 */
public class ejercicioExtra6 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Random random = new Random();

        int[] vectorAleat1 = new int[5];

        for (int i = 0; i < vectorAleat1.length; i++) {
            vectorAleat1[i] = random.nextInt(20);
        }

        String[][] sopa = new String[20][20];
        int cont = 0;

        do {

            System.out.println("Ingrese palabras de 3 a 5 caracteres:");
            String palabra = leer.nextLine();
            int aux = 1;
            for (int i = 0; i < 20; i++) {
                int aleatorio = random.nextInt(15);
                for (int j = 0; j < 20; j++) {
                    aux=1;
                    if (i == vectorAleat1[0] || i == vectorAleat1[1] || i == vectorAleat1[2] || i == vectorAleat1[3] || i == vectorAleat1[4]) {

                        if (j >= aleatorio && j < (aleatorio + palabra.length())) {
                            sopa[i][j] = palabra.substring(j - aleatorio, ((j - aleatorio) + aux));
                            aux++;

                        } else {
                            sopa[i][j] = String.valueOf(random.nextInt(9));
                        }
                    } else {
                        sopa[i][j] = String.valueOf(random.nextInt(9));
                    }
                }

            }
            cont++;

        } while (cont < 5);

        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa.length; j++) {
                System.out.print(" " + sopa[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
//        String palabra1 = leer.nextLine();
//        String palabra2 = leer.nextLine();
//        String palabra3 = leer.nextLine();
//        String palabra4 = leer.nextLine();
//        String palabra5 = leer.nextLine();
//        String[] vector1 = new String[palabra1.length()];
//        String[] vector2 = new String[palabra2.length()];
//        String[] vector3 = new String[palabra3.length()];
//        String[] vector4 = new String[palabra4.length()];
//        String[] vector5 = new String[palabra5.length()];
