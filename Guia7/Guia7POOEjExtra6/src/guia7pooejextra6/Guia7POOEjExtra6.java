/*
Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un
método "calcular_area" que calcule y devuelva el área del rectángulo.
Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados
de 4 y 6 y imprime el área del rectángulo.
 */
package guia7pooejextra6;

import Entidad.Rectangulo;

/**
 *
 * @author CASA
 */
public class Guia7POOEjExtra6 {

    public static void main(String[] args) {
        
        Rectangulo rectangulo1 = new Rectangulo();
        
        
        rectangulo1.setLado1(4);
        rectangulo1.setLado2(6);
        int area1 = rectangulo1.calcular_area();
        System.out.println(rectangulo1.toString());
        System.out.println( "area= " + area1);
    }
    
}
