
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

   public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in);
        String respuesta;
        do {
            String nombre = "";
            int edad = 0;
            respuesta = datos(nombre, edad);
            
        } while (!respuesta.equalsIgnoreCase("no"));
        
    }
    
    public static String datos(String nombre, int edad) {
        Scanner ingrese = new Scanner(System.in);
        String respuesta;
        System.out.println("Ingrese un nombre");
        nombre = ingrese.next();
        System.out.println("Ingrese edad");
        edad = ingrese.nextInt();
        if (edad < 18) {
            System.out.println("El personaje no es mayor de edad");
        } else {
            System.out.println("La persona es mayor");
        }
        System.out.println("Desea continuar ingresando datos");
        respuesta = ingrese.next();
            return respuesta;
        
    }
}
