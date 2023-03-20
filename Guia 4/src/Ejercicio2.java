
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
<<<<<<< HEAD
        String respuesta = "";
        String nombre = "";
        int edad = 0;
=======
        String respuesta;
>>>>>>> 080240dd8b63645474b86d8be333a269cb062f8a
        do {
            String nombre = "";
            int edad = 0;
            respuesta = datos(nombre, edad);
            
<<<<<<< HEAD
            
            
        } while (respuesta.equalsIgnoreCase("s") );
=======
        } while (!respuesta.equalsIgnoreCase("no"));
>>>>>>> 080240dd8b63645474b86d8be333a269cb062f8a
        
    }
    
    public static String datos(String nombre, int edad) {
        Scanner ingrese = new Scanner(System.in);
        String respuesta;
        System.out.println("Ingrese un nombre");
        nombre = ingrese.next();
        System.out.println("Ingrese edad");
        edad = ingrese.nextInt();
        if (edad < 18) {
<<<<<<< HEAD
            System.out.println(nombre + " es menor de edad.");
        } else {
            System.out.println(nombre + " es mayor de edad.");
        }
        
        System.out.println("Desea continuar? [s/n]");
        retorno = ingrese.next();
        
        return retorno;
=======
            System.out.println("El personaje no es mayor de edad");
        } else {
            System.out.println("La persona es mayor");
        }
        System.out.println("Desea continuar ingresando datos");
        respuesta = ingrese.next();
            return respuesta;
>>>>>>> 080240dd8b63645474b86d8be333a269cb062f8a
        
    }
}
