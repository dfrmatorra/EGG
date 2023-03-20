/*
Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author Dario
 */
public class ejercicioExtra6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contador = 0;
        float altura, total = 0;
        String respuesta = ""; 
        
        do {
            System.out.println("Ingrese la altura");
            altura = leer.nextFloat();
            if (altura < 1.60){
                contador++;
                total = total + altura;
               }
            System.out.println("Quiere seguir ingresando alturas (si/no");
            respuesta = leer.next();
        }while (respuesta.equalsIgnoreCase("si"));
        
        System.out.println("El promedio de latura menor a 1.60 es:" + (total / contador));
        
        
    }
    
}
