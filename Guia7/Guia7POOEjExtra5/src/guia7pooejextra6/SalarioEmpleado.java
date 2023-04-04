/*
Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
"salario". Luego, crea un método "calcular_aumento" que calcule el
aumento salarial de un empleado en función de su edad y salario actual.
El aumento salarial debe ser del 10% si el empleado tiene más de 30
años o del 5% si tiene menos de 30 años.
 */
package guia7pooejextra6;

import Entidad.Empleado;
import java.util.Scanner;

/**
 *
 * @author Dario
 */
public class SalarioEmpleado {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Empleado empleado1 = new Empleado();

        System.out.println("---EMPLEADO 1---");
        System.out.println("Ingrese el sueldo base");
        empleado1.setSalario(leer.nextDouble());
        System.out.println("Ingrese la edad del empleado");
        empleado1.setEdad(leer.nextInt());
        empleado1.calcular_aumento();

//        Empleado empleado2 = new Empleado();
//
//        System.out.println("---EMPLEADO 2---");
//        System.out.println("Ingrese el sueldo base");
//        empleado2.setSalario(leer.nextDouble());
//        System.out.println("Ingrese la edad del empleado");
//        empleado2.setEdad(leer.nextInt());
//        empleado2.calcular_aumento();
        
//        System.out.println("La diferencia entra los dos es: " + (empleado1.getSalario()-empleado2.getSalario()));

    }

}
