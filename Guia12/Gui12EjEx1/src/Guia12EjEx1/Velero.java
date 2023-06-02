package Guia12EjEx1;

import java.util.Date;

/**
 *
 * @author CASA
 */
public final class Velero extends Barco {
    
    protected Integer numMastiles;

    public Velero() {
    }

    public Velero(Integer numMastiles, String matricula, Double eslora, Integer anio, Date fechaAlquiler, Date fechaDev, String posicionAmarre) {
        super(matricula, eslora, anio, fechaAlquiler, fechaDev, posicionAmarre);
        this.numMastiles = numMastiles;
    }
    public Velero(Integer numMastiles, String matricula, Double eslora, Integer anio) {
        super(matricula, eslora, anio);
        this.numMastiles = numMastiles;
    }

    public Integer getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(Integer numMastiles) {
        this.numMastiles = numMastiles;
    }

    @Override
    public String toString() {
        return "Velero{" + "numMastiles=" + numMastiles + '}';
    }

    @Override
    public double calcularModulo() {
        return (super.calcularModulo())+numMastiles; 
    }

    @Override
    public void alquilerBarco() {
        super.alquilerBarco(); 
        
    }

    @Override
    public double precioFinal() {
        return super.precioFinal(); 
    }
    
    
    
}
