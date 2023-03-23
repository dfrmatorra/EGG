/*
Crear una función rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o
procedimiento que imprima el vector.
 */
package guia5;


import java.util.Random;

/**
 *
 * @author Dario
 */
public class ejericioExtra3 {
  

    public static void main(String[] args) {
        Random random = new Random();
        
    }
    
    public static void vector ()  {
        int [] vector = new int [3];
        
        for (int i = 0; i < 3; i++) {
            vector[i]= random.nextInt(10);
        }
    }
    
}
