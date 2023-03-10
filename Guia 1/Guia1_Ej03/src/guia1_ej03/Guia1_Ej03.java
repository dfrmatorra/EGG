/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
 */
package guia1_ej03;

import java.util.Scanner;

/**
 *
 * @author Dario
 */
public class Guia1_Ej03 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
      String frase;
      
      System.out.println("Ingrese una frase");
      frase = leer.nextLine();
      System.out.println("En mayusculas: " + frase.toUpperCase() + "// En minusculas: " + frase.toLowerCase());
    }
    
}
