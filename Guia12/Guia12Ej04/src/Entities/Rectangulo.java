
package Entities;

import Intefaces.CalculoFormas;

/**
 *
 * @author DarioF
 */
public class Rectangulo implements CalculoFormas {
    
    private double ladoA;
    private double ladoB;

    public Rectangulo() {
    }

    public Rectangulo(double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "ladoA=" + ladoA + ", ladoB=" + ladoB + '}';
    }
    
    
    
    
    
    
    @Override
    public double calculoArea() {
    
        return ladoA*ladoB;
    }

    @Override
    public double caluculoPerimetro() {
        return ((ladoA+ladoB)*2);
    
    }
 
    
    
    
}
