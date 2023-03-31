/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author CASA
 */
public class Rectangulo2 {

    private double base;
    private double altura;

    public Rectangulo2() {
    }

    public Rectangulo2(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo");
        base = leer.nextDouble();
        System.out.println("Ingrese la altura del rectangulo");
        altura = leer.nextDouble();
    }

    public double calcularSuperficie() {
        double sup = base * altura;
        return sup;
    }

    public double calcularPerimetro() {
        double per = (base + altura) * 2;
        return per;
    }

    public void dibujarRectangulo() {

        for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
                if (i == 0 || i == base - 1) {
                    System.out.print(" * ");
                } else {
                    if (j == 0 || j == altura - 1) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                }
            }
            System.out.println("");
        }
    }
}
