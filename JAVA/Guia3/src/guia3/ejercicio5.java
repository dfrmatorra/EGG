/*
Escriba un programa en el cual se ingrese un valor límite positivo, 
y a continuación solicite números al usuario hasta que la suma de los números
introducidos supere el límite inicial.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author CASA
 */
public class ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int limite;
        System.out.println("Ingrese el numero limite");
        limite = leer.nextInt();
        int num, suma = 0;

        while (suma <= limite) {

            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            suma = suma + num;
        }
        System.out.println("La suma de los numeros es:" + suma);
    }

}
