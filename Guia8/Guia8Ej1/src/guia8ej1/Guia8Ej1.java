/*
Realizar una clase llamada CuentaBancaria en el paquete Entidades con
los siguientes atributos: numeroCuenta(entero), dniCliente(entero largo),
saldoActual. Agregar constructor vacío, con parámetros, getters y
setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que
contenga:
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
package guia8ej1;

import Servicios.CuentaBancariaServicios;
import java.util.Scanner;

/**
 *
 * @author CASA
 */
public class Guia8Ej1 {

    public static void main(String[] args) {

        CuentaBancariaServicios cb1 = new CuentaBancariaServicios();
                       
        int opcion = 0;

        do {
            System.out.println("MENU");
            System.out.println("Opcion 1: Crear cuenta");
            System.out.println("Opcion 2: Ingresar dinero en cuenta");
            System.out.println("Opcion 3: Retirar dinero en cuenta");
            System.out.println("Opcion 4: Retiro rapido de dinero en cuenta");
            System.out.println("Opcion 5: Consultar saldo en cuenta");
            System.out.println("Opcion 6: Consultar datos de cuenta");

            System.out.println("-----------------------------------");

            Scanner leer = new Scanner(System.in);
            System.out.println("Seleccione la opcion:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    cb1.crearCuenta();
                    break;
                case 2:
                    cb1.ingresarCuenta();
                    break;
                case 3:
                    cb1.retirarCuenta();
                    break;
                case 4:
                    cb1.extraccionRapida();
                    break;
                case 5:
                    cb1.consultarSaldo();
                    break;
                case 6:
                    cb1.mostrarDatos();
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    ;
            }
        } while (opcion != 7);
    }

}
