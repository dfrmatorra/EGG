/*
Declarar una clase llamada Circunferencia que tenga como atributo
privado el radio de tipo real. A continuación, se deben crear los
siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda
en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia (Area=〖
π*radio〗^2).
e) Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
 */
package Geometria;

import java.util.Scanner;

/**
 *
 * @author CASA
 */
//Declarar una clase llamada Circunferencia que tenga como atributo
//privado el radio de tipo real.
public class Circunferencia {

    private double radio;


// Método constructor que inicialice el radio pasado como parámetro.
    public Circunferencia() {
       
    }


//Métodos get y set para el atributo radio de la clase Circunferencia.
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


//Método para crearCircunferencia(): que le pide el radio y lo guarda
//en el atributo del objeto.
    public void crearCirc() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor del radio:");
        radio = leer.nextDouble();
    }
// d) Método area(): para calcular el área de la circunferencia (Area=〖
// π*radio〗^2).

    public double calcularArea() {
        double area = Math.PI * Math.pow(radio, 2);//radio al cuadrado
        return area;
    }

//Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
    public double calcularPerimetro() {
        double perimetro = 2 * Math.PI * radio;
        return perimetro;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + ", area=" + calcularArea() + ", per=" + calcularPerimetro() + '}';
    }
    
}
