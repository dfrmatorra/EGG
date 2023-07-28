/*
Hay que insertar estos 3 valores para construir el objeto a través de un método constructor. 
Luego, en RaicesServicio las operaciones que se podrán realizar son las siguientes:
a) Método getDiscriminante(): devuelve el valor del discriminante
(double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
b) Método tieneRaices(): devuelve un booleano indicando si tiene dos
soluciones, para que esto ocurra, el discriminante debe ser mayor o
igual que 0.
c) Método tieneRaiz(): devuelve un booleano indicando si tiene una
única solución, para que esto ocurra, el discriminante debe ser igual
que 0.
d) Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true,
imprime las 2 posibles soluciones.
e) Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime
una única raíz. Es en el caso en que se tenga una única solución
posible.
f) Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(),
y mostrará por pantalla las posibles soluciones que tiene nuestra
ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo
que devuelvan nuestros métodos y en caso de no existir solución, se
mostrará un mensaje.

(-b±√((b^2)-(4*a*c)))/(2*a)
 */
package Servicios;

import Entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author DarioF
 */
public class RaicesServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");


    public Raices crearRaices() {
        System.out.println("Ingrese la variable \"a\"");
        int a = leer.nextInt();
        System.out.println("Ingrese la variable \"b\"");
        int b = leer.nextInt();
        System.out.println("Ingrese la variable \"c\"");
        int c = leer.nextInt();
        return new Raices(a, b, c);
    }
//a)Método getDiscriminante(): devuelve el valor del discriminante
//(double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c

    public double getDiscriminante(int a, int b, int c) {
        double disc = Math.pow(b,2) - (4 * a * c);
        return disc;
    }

//b) Método tieneRaices(): devuelve un booleano indicando si tiene dos
//soluciones, para que esto ocurra, el discriminante debe ser mayor o
//igual que 0.
    public boolean tieneRaices(double disc) {
        boolean raices;
        if (disc > 0) {
            raices = true;
        } else {
            raices = false;
        }
        return raices;
    }

//c) Método tieneRaiz(): devuelve un booleano indicando si tiene una
//única solución, para que esto ocurra, el discriminante debe ser igual
//que 0.
    public boolean tieneRaiz(double disc) {
        boolean raiz;
        if (disc == 0) {
            raiz = true;
        } else {
            raiz = false;
        }
        return raiz;
    }
//e) Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime
//una única raíz. Es en el caso en que se tenga una única solución
//posible.

    public void obtenerRaiz(boolean tieneRaiz) {
        if (tieneRaiz == true) {
            System.out.println("La ecuacion tiene solucion unica.");
        }
    }
//f) Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(),
//y mostrará por pantalla las posibles soluciones que tiene nuestra
//ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo
//que devuelvan nuestros métodos y en caso de no existir solución, se
//mostrará un mensaje.

    public void calcular(Raices r1, double disc, boolean tieneRaiz, boolean tieneRaices) {

        if (tieneRaiz == true) {
            double resultadoB = (-1)*r1.getB();
            double resultadoA = (2 * r1.getA());
            System.out.println("El resultado es: " + (resultadoB/resultadoA));
        }else if (tieneRaices == false){
            System.out.println("La ecuacion no tiene solucion");
        }else if (tieneRaices == true){
            double resultado1 = (-r1.getB() + Math.sqrt(disc)) / (2 * r1.getA());
            double resultado2 = (-r1.getB() - Math.sqrt(disc)) / (2 * r1.getA());
            System.out.println("Los resultados son:");
            System.out.println(resultado1);
            System.out.println(resultado2);
        }

    }

}
