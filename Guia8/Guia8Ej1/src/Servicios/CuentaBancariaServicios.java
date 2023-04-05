/*
a) Método para crear cuenta pidiéndole los datos al usuario.
b) Método ingresar(double): recibe una cantidad de dinero a ingresar y
se le sumará al saldo actual.
c) Método retirar(double): recibe una cantidad de dinero a retirar y se le
restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
retirar se retirará el máximo posible hasta dejar la cuenta en 0.
d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
Validar que el usuario no saque más del 20%.
e) Método consultarSaldo: permitirá consultar el saldo disponible en la
cuenta.
f) Método consultarDatos: permitirá mostrar todos los datos de la
cuenta.
 */
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author CASA
 */
public class CuentaBancariaServicios {

    Scanner leer = new Scanner(System.in);

    CuentaBancaria cuenta1 = new CuentaBancaria();

    public void crearCuenta() {
        System.out.println("Ingrese el numero de cuenta: ");
        cuenta1.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese el DNI del cliente: ");
        cuenta1.setDniCliente(leer.nextLong());
    }

    public void ingresarCuenta() {
        System.out.println("Ingrese el valor para agregar al saldo:");
        double ingreso = leer.nextDouble();
        cuenta1.setSaldoActual((cuenta1.getSaldoActual() + ingreso));
    }

    public void extraccionRapida() {
        System.out.println("Ingrese el valor para extraer de la cuenta:");
        double retiro = leer.nextDouble();
        if ((cuenta1.getSaldoActual() * 0.20) < retiro) {
            cuenta1.setSaldoActual((cuenta1.getSaldoActual() - retiro));
//        break;
        } else {
            System.out.println("Ingrese un valor menor al 20 % del saldo en cuenta");
        }
    }

    public void retirarCuenta() {
        System.out.println("Ingrese el valor para extraer de la cuenta:");
        double retiro = leer.nextDouble();
        if ((cuenta1.getSaldoActual()) < retiro) {
            System.out.println("Usted solo pudo retirar" + cuenta1.getSaldoActual());
            cuenta1.setSaldoActual(0);
            
        } else {
            cuenta1.setSaldoActual(cuenta1.getSaldoActual() - retiro);
        }
    }

    public void consultarSaldo() {
        System.out.println("Su saldo actual es:" + cuenta1.getSaldoActual());
    }

    public void mostrarDatos() {
        System.out.println(cuenta1.toString());
    }

}
