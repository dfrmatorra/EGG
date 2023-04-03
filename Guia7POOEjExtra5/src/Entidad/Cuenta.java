/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author CASA
 */
public class Cuenta {

    double saldo;
    String titular;

    public Cuenta() {
    }

    public double retirar_dinero(double saldo) {
        double extraccion = 0;
        System.out.println("Cuanto desea retirar?");
        Scanner leer = new Scanner(System.in);
        extraccion = leer.nextDouble();
        saldo -= extraccion;
        if (saldo < 0) {
            System.out.println("No cuenta con suficiente saldo en la cuenta");
            return saldo += extraccion;
        } else {
            System.out.println("La transaccion fue exitosa");
            System.out.println("Su nuevo saldo es: " + saldo);
            return saldo;
        }
    }
}
