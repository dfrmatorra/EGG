/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1_ej01;

import java.util.Scanner;

/**
 *
 * @author CASA
 */
public class Guia1_Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1;
        int num2;
        int suma;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar el primer numero");
        num1 = leer.nextInt();
        System.out.println("Ingresar el segundo numero");
        num2 = leer.nextInt();
        suma = num1 + num2;
        System.out.println("La suma de " + num1 + " + " + num2 + " = " + suma);
    }
    
}
