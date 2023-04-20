/*
Realizar una clase llamada ParDeNumeros que tenga como atributos dos
números reales con los cuales se realizarán diferentes operaciones
matemáticas. La clase debe tener un constructor vacío, getters y setters.
En el constructor vacío se usará el Math.random para generar los dos
números.
 */
package Entidades;

import java.util.Random;

/**
 *
 * @author DarioF
 */
public class ParDeNumeros {

    private int num1;
    private int num2;

    public ParDeNumeros() {
        Random random = new Random();
        int rango = 10; // Este es el rango de valores que abarca tanto los números positivos como los negativos
        this.num1 = (int) (random.nextDouble() * rango * 2 - rango);
        this.num2 = (int) (random.nextDouble() * rango * 2 - rango);
    }

    public ParDeNumeros(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "ParDeNumeros{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }

}
