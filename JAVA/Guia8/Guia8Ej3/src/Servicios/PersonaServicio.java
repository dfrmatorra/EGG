/*
Método esMayorDeEdad(): indica si la persona es mayor de edad. La
función devuelve un booleano.
Metodo crearPersona(): el método crear persona, le pide los valores
de los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Persona. Además, comprueba que el
sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
deberá mostrar un mensaje.
Método calcularIMC(): calculara si la persona está en su peso ideal
(peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un
valor menor que 20, significa que la persona está por debajo de su
peso ideal y la función devuelve un -1. Si la fórmula da por resultado
un número entre 20 y 25 (incluidos), significa que la persona está en
su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene
sobrepeso, y la función devuelve un 1.
 */
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author DarioF
 */
public class PersonaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona(int num) {

        System.out.println("Ingrese el nombre de la persona " + num + ":");
        String nombre = leer.next();
        System.out.println("Ingrese el sexo de la persona (Hombre:H, Mujer:M u Otro:O):");
        String sexo = leer.next();
        if (!sexo.equalsIgnoreCase("h") && !sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("o")) {
            System.out.println("Ingrese el sexo de la persona M/H/O");
            sexo = leer.next();
        }
        System.out.println("Ingrese la edad de la persona:");
        int edad = leer.nextInt();
        System.out.println("Ingrese el peso de la persona:");
        double peso = leer.nextDouble();
        System.out.println("Ingrese la altura de la persona:");
        double altura = leer.nextDouble();

        return new Persona(nombre, sexo, edad, peso, altura);
    }

    public boolean esMayor(int edad) {
        boolean mayor;
        if (edad >= 18) {
            mayor = true;
        } else {
            mayor = false;
        }
        return mayor;
    }

    public int calcularIMC(double peso, double altura) {
        double calculoImc = peso / Math.sqrt(altura);
        int imc=0;
        if (calculoImc < 20) {
            imc = -1;
        } else if (calculoImc >= 20 && calculoImc <= 25) {
            imc = 0;
        } else if (calculoImc > 25) {
            imc = 1;
        }
        return imc;
    }

    public String mostrarPersona() {
        Persona ps = new Persona();
        return ps.toString();
    }

}
