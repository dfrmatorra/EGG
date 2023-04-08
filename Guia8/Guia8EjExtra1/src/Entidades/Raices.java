/*
Vamos a realizar una clase llamada Raices, donde representaremos los
valores de una ecuación de 2º grado. Tendremos los 3 coeficientes
como atributos, llamémosles a, b y c. 
 */
package Entidades;

/**
 *
 * @author CASA
 */
public class Raices {
    private int a;
    private int b;
    private int c;

    public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
       
          
}
