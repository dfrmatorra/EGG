/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author CASA
 */
public class ejemplo6 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
    Scanner ingrese = new Scanner (System.in);
System.out.println("Ingrese dos numeros");
int num1 = ingrese.nextInt();
int num2 = ingrese.nextInt();


if (num1 > 25 || num2 > 25 ) {
System.out.println("Alguno o ambos son mayores a 25");
}else {
System.out.println("Ninguno es mayor a 25");
}

    }
    
}
