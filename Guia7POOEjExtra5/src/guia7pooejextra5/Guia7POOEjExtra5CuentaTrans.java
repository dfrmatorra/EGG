/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro.
 */
package guia7pooejextra5;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author CASA
 */
public class Guia7POOEjExtra5CuentaTrans {

    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta();
        double saldo = 1000000;
        System.out.println("Quiere relizar una transaccion (si/no)");
        Scanner leer = new Scanner(System.in);
        String opcion = leer.nextLine();
        while (opcion.equalsIgnoreCase("si")){
            saldo = cuenta1.retirar_dinero(saldo);
            System.out.println("Quiere relizar una transaccion");
            opcion = leer.nextLine();
        }
        System.out.println("Gracias por operar con el Banco");
    }             
    }
