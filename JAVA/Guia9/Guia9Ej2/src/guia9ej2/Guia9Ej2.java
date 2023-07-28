/*
Realizar una clase llamada ParDeNumeros que tenga como atributos dos
números reales con los cuales se realizarán diferentes operaciones
matemáticas. La clase debe tener un constructor vacío, getters y setters.
En el constructor vacío se usará el Math.random para generar los dos
números. Crear una clase ParDeNumerosService, en el paquete
Servicios, que deberá además implementar los siguientes métodos:
a) Método mostrarValores que muestra cuáles son los dos números
guardados.
b) Método devolverMayor para retornar cuál de los dos atributos tiene
el mayor valor
c) Método calcularPotencia para calcular la potencia del mayor valor de
la clase elevado al menor número. Previamente se deben redondear
ambos valores.
d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los
dos valores. Antes de calcular la raíz cuadrada se debe obtener el
valor absoluto del número.
 */
package guia9ej2;

import Entidades.ParDeNumeros;
import Servicios.ParDeNumerosService;
import java.util.Scanner;

/**
 *
 * @author CASA
 */
public class Guia9Ej2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ParDeNumerosService ns = new ParDeNumerosService();

        ParDeNumeros n1 = ns.mostrarValores();
        System.out.println(n1.toString());

        if (ns.devolverMayor(n1) == 0) {
            System.out.println("Los numeros son iguales");
        } else if (ns.devolverMayor(n1) > 0) {
            System.out.println("El primer numero es mayor al segundo");
        } else if (ns.devolverMayor(n1) < 0) {
            System.out.println("El segundo numero es mayor al primero");
        }
        
        ns.calcularPotencia(n1);
        
        ns.calculaRaiz(n1);
        
    }

}
