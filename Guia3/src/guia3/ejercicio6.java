/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre
por pantalla el siguiente menú:El usuario deberá elegir una opción y el programa
deberá mostrar el resultado por pantalla y luego volver al menú. 
El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que,
si el usuario selecciona la opción 5, en vez de salir del programa directamente,
se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir 
del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, 
caso contrario se vuelve a mostrar el menú.

 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author CASA
 */
public class ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner leer2 = new Scanner(System.in);
        double num1;
        double num2;
        System.out.println("Ingresar dos numeros enteros positivos");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        int opcion;

        String respuesta = "n";

        do {
            System.out.println("MENU");
            System.out.println("1-SUMAR");
            System.out.println("2-RESTAR");
            System.out.println("3-MULTIPLICAR");
            System.out.println("4-DIVIDIR");
            System.out.println("5-SALIR");
            System.out.println("Elija opcion:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("La suma es:" + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta es:" + (num1 - num2));

                    break;
                case 3:
                    System.out.println("La multiplicacion es:" + (num1 * num2));

                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("El divisor no puede ser cero");
                        break;
                    } else {
                        System.out.println("La division es:" + (num1 / num2));
                    }
                    break;
                case 5:

                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    respuesta = leer2.nextLine();
                    if (respuesta.equalsIgnoreCase("s")) {
                        
                    }
                    break;
                default:
                    System.out.println("La opcion ingresada no es correcta");

            }
        } while (respuesta.equalsIgnoreCase("n"));

    }
}
