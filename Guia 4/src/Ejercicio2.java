
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dario
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in);
        String respuesta = "";
        String nombre = "";
        int edad = 0;
        do {
            respuesta = datos(nombre, edad);
            
            
            
        } while (respuesta.equalsIgnoreCase("s") );
        
    }
    
    public static String datos(String nombre, int edad) {
        String retorno;
        Scanner ingrese = new Scanner(System.in);
        System.out.println("Ingrese un nombre");
        nombre = ingrese.next();
        System.out.println("Ingrese edad");
        edad = ingrese.nextInt();
        if (edad < 18) {
            System.out.println(nombre + " es menor de edad.");
        } else {
            System.out.println(nombre + " es mayor de edad.");
        }
        
        System.out.println("Desea continuar? [s/n]");
        retorno = ingrese.next();
        
        return retorno;
        
    }
}