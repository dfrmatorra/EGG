/*
Crear un programa que dado un número determine si es par o impar.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author Dario
 */
public class ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese un numero");
    
    int num = leer.nextInt();
    
    if (num%2==0){
        System.out.println("El numero es par");
        }else {
        System.out.println("El numero es impar");
    
    }
    
}
}