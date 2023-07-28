/*
Escriba un programa que pida una frase o palabra y valide si la primera letra
de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author Dario
 */
public class ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese frase o palabra");
        frase = leer.nextLine();
        String primerLetra;
        primerLetra = frase.substring(0,1);

        if ("a".equalsIgnoreCase(primerLetra)){
            System.out.println("CORRECTO");
        }
        else{
            System.out.println("INCORRECTO");
        }
    }      
 
}