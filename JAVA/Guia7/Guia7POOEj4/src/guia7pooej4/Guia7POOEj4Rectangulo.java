/*
Crear una clase Rectángulo que modele rectángulos por medio de un
atributo privado base y un atributo privado altura. La clase incluirá un
método para crear el rectángulo con los datos del Rectángulo dados por
el usuario. También incluirá un método para calcular la superficie del
rectángulo y un método para calcular el perímetro del rectángulo. Por
último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los
métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package guia7pooej4;

import Entidad.Rectangulo2;

/**
 *
 * @author CASA
 */
public class Guia7POOEj4Rectangulo {

    public static void main(String[] args) {

        Rectangulo2 r1 = new Rectangulo2();
          r1.crearRectangulo();
        System.out.println("La superficie es: " + r1.calcularSuperficie());
        System.out.println("El perimetro es: " + r1.calcularPerimetro());
        System.out.println("---------------------");
        r1.dibujarRectangulo();    
        
        
//        Rectangulo2 r2 = new Rectangulo2 ((r1.getBase()*2),(r1.getAltura()*2));
//        
//        System.out.println("La superficie es: " + r2.calcularSuperficie());
//        System.out.println("El perimetro es: " + r2.calcularPerimetro());
//        System.out.println("---------------------");
//        r2.dibujarRectangulo();   
//
//        Rectangulo2 r3 = new Rectangulo2();
//        r3.crearRectangulo();
//        System.out.println("La superficie es: " + r3.calcularSuperficie());
//        System.out.println("El perimetro es: " + r3.calcularPerimetro());
//        System.out.println("---------------------");
//        r3.dibujarRectangulo();  

    }
}
