/*
Realizar un programa que solo permita introducir solo frases o palabras
de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en
caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la
función Lenght() en Java.
 */
package guia3;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeArray.length;

/**
 *
 * @author Dario
 */
public class ejercicio3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese frase: ");
        String frase = leer.nextLine();
        int longitud = (int) length(frase);

        if (longitud <= 8) {
            System.out.println("La frase tiene 8 caracteres o menos");
        } else {
            System.out.println("La frase tiene mas de 8 caracteres");
        }
    }
}
