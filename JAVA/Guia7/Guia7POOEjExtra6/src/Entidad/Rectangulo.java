/*
Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un
método "calcular_area" que calcule y devuelva el área del rectángulo.
Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados
de 4 y 6 y imprime el área del rectángulo.
 */
package Entidad;

/**
 *
 * @author CASA
 */
public class Rectangulo {

    int lado1;
    int lado2;

    public Rectangulo() {
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int calcular_area() {
        int area = lado1 * lado2;
        return area;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "lado1=" + lado1 + ", lado2=" + lado2 + '}';
    }
    

}
