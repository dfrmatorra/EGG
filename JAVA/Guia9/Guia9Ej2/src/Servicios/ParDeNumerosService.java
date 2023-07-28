/*
 Crear una clase ParDeNumerosService, en el paquete
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
package Servicios;

import Entidades.ParDeNumeros;
import java.util.Scanner;

/**
 *
 * @author DarioF
 */
public class ParDeNumerosService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ParDeNumeros mostrarValores() {

        return new ParDeNumeros();
    }

    public int devolverMayor(ParDeNumeros ns) {
        int mayor;
        if (ns.getNum1() > ns.getNum2()) {
            mayor = 1;
        } else if (ns.getNum2() > ns.getNum1()) {
            mayor = -1;
        } else {
            mayor = 0;
        }
        return mayor;
    }

    public void calcularPotencia(ParDeNumeros ns) {
        double potencia;
        if (ns.getNum1() >= ns.getNum2()) {
            potencia = Math.pow(ns.getNum1(), ns.getNum2());
            potencia = Math.round(potencia);
            System.out.println("El numero mayor elevado al menor es = " + potencia);
        } else if (ns.getNum2() > ns.getNum1()) {
            potencia = Math.pow(ns.getNum2(), ns.getNum1());
            int numeroDecimales = 2;
            double resultado = Math.round(potencia * Math.pow(10, numeroDecimales)) / Math.pow(10, numeroDecimales);
            System.out.println("El numero mayor elevado al menor es = " + resultado);
        }
    }

    public void calculaRaiz(ParDeNumeros ns) {
        double raiz;
        int num1 = Math.abs(ns.getNum1());
        int num2 = Math.abs(ns.getNum2());
        if (ns.getNum1() >= ns.getNum2()) {
            raiz = Math.sqrt(num2);
            System.out.println("La raiz cuadrada del menor es = " + raiz);
        } else if (ns.getNum2() > ns.getNum1()) {
            raiz = Math.sqrt(num1);
            System.out.println("La raiz cuadrada del menor es = " + raiz);
        }

    }

}
