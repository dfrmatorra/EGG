/*
Realizar un algoritmo que calcule la suma de todos los elementos de un
vector de tamaño N, con los valores ingresados por el usuario.
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author Dario
 */
public class ejercicioExtra1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresar la cantidad de numeros para calcular");
        int n = leer.nextInt();
        float suma = 0;
        
        float[] vector = new float[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Ingrese el numero:");

            vector[i] = leer.nextFloat();
            
            suma = suma + vector[i];
        }
        
        System.out.println("La suma de los numeros es igual a: " + suma);
        
        
        
        
    }

}
