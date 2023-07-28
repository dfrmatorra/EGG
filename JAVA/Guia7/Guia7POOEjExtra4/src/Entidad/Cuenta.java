/*
Crea una clase "Cuenta" que tenga atributos como "saldoCuenta" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldoCuenta de la cuenta. Asegúrate de que el saldoCuenta nunca sea
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

    public double retirar_dinero(double saldoCuenta) {
        double extraccion = 0;
        System.out.println("Cuanto desea retirar?");
        Scanner leer = new Scanner(System.in);
        extraccion = leer.nextDouble();
        saldoCuenta -= extraccion;
        if (saldoCuenta < 0) {
            System.out.println("No cuenta con suficiente saldoCuenta en la cuenta");
            return saldoCuenta += extraccion;
        } else {
            System.out.println("La transaccion fue exitosa");
            System.out.println("Su nuevo saldoCuenta es: " + saldoCuenta);
            return saldoCuenta;
        }
    }
}
