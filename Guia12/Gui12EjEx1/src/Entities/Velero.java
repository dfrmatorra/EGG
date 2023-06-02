package Entities;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author CASA
 */
public final class Velero extends Barco {
    
    protected Integer numMastiles;

    public Velero() {
    }

    public Velero(String matricula, Double eslora, Integer anio, LocalDate fechaAlquiler, LocalDate fechaDev, String posicionAmarre, Integer numMastiles) {
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
        return "Velero{" + super.toString() + "numMastiles=" + numMastiles + '}';
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
