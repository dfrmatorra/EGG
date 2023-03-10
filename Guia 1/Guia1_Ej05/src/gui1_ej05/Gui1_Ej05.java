/*
Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
 */
package gui1_ej05;

import java.util.Scanner;

/**
 *
 * @author CASA
 */
public class Gui1_Ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num;
        double doble;
        double triple;
        double raiz;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar un numero");
        num = leer.nextDouble();
        doble = num * 2;
        triple = num * 3;
        raiz = Math.sqrt(num);
        System.out.println("El doble del numero ingresado es:"+ doble);
        System.out.println("El triple del numero ingresado es:"+ triple);
        System.out.println("La raiz cuadrada del numero ingresado es:"+ raiz);
    }
    
}
