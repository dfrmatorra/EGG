/*
Crear una función rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o
procedimiento que imprima el vector.

**Random rand = new Random(); int x = rand.nextInt(10);

 */
package guia5;

import java.util.Random;

/**
 *
 * @author Dario
 */
public class ejericioExtra3 {

    public static void main(String[] args) {
        int[] ve = new int[3];
        vector(ve);
        imprimirVector(ve);
    }

    public static int vector(int vect[]) {
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            vect[i] = random.nextInt(10);
        }
        return 0;
    }

    public static void imprimirVector(int vector[]) {
        for (int i = 0; i < 3; i++) {
            System.out.print(" [ " + vector[i] + " ] ");
        }
    }

}
