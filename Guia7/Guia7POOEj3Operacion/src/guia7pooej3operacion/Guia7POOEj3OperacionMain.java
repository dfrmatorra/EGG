/*
Crear una clase llamada Operacion que tenga como atributos privados
numero1 y numero2. A continuación, se deben crear los siguientes
métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Método constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos
números y los guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el
resultado al main.
f) Método restar(): calcular la resta de los números y devolver el
resultado al main
g) Método multiplicar(): primero valida que no se haga una
multiplicación por cero, si fuera a multiplicar por cero, el método
devuelve 0 y se le informa al usuario el error. Si no, se hace la
multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero,
si fuera a pasar una división por cero, el método devuelve 0 y se le
informa al usuario el error se le informa al usuario. Si no, se hace la
división y se devuelve el resultado al main.
 */
package guia7pooej3operacion;

import OperacionesVarias.Operacion;
import java.util.Scanner;

/**
 *
 * @author CASA
 */
public class Guia7POOEj3OperacionMain {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Operacion operacion1 = new Operacion();

        operacion1.crearOperacion();

        int opc;

        do {
            System.out.println("MENU");
            System.out.println("");

            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("3.- Multiplicar");
            System.out.println("4.- Dividir");
            System.out.println("5.- Ver numeros");
            System.out.println("6.- Salir");

            opc = leer.nextInt();
            System.out.println("----------------------");

            switch (opc) {
                case 1:
                    System.out.println("Resultado: " + operacion1.sumar());
                    break;
                case 2:
                    System.out.println("Resultado: " + operacion1.restar());
                    break;
                case 3:
                    System.out.println("Resultado: " + operacion1.multiplicar());
                    break;
                case 4:
                    System.out.println("Resultado: " + String.format("%.2f", operacion1.dividir()));
                    break;
                case 5:
                    System.out.println("Resultado: " + operacion1.toString());

                    break;
                case 6:
                    break;

            }
        } while (opc != 7);

    }

}
