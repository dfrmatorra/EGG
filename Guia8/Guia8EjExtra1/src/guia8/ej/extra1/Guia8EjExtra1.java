/*
Vamos a realizar una clase llamada Raices, donde representaremos los
valores de una ecuación de 2º grado. Tendremos los 3 coeficientes
como atributos, llamémosles a, b y c. Hay que insertar estos 3 valores
para construir el objeto a través de un método constructor. 

e) Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime
una única raíz. Es en el caso en que se tenga una única solución
posible.
f) Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(),
y mostrará por pantalla las posibles soluciones que tiene nuestra
ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo
que devuelvan nuestros

(-b±√((b^2)-(4*a*c)))/(2*a)
 */
package guia8.ej.extra1;

import Entidades.Raices;
import Servicios.RaicesServicio;

/**
 *
 * @author DarioF
 */
public class Guia8EjExtra1 {

    public static void main(String[] args) {
        RaicesServicio rs = new RaicesServicio();
        Raices r1 = rs.crearRaices();

        double discriminante = rs.getDiscriminante(r1.getA(), r1.getB(), r1.getC());

        System.out.println("--------------");
        System.out.println("Discriminante=" + discriminante);
        System.out.println("--------------");

        boolean raiz = rs.tieneRaiz(discriminante);
        boolean raices = rs.tieneRaices(discriminante);
        rs.obtenerRaiz(rs.tieneRaiz(rs.getDiscriminante(r1.getA(), r1.getB(), r1.getC())));
        rs.calcular(r1, discriminante, raiz, raices);
    }

}
