package Entities;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author CASA
 */
public final class BarcoAMotor extends Barco {
    
    protected Integer cv;

    public BarcoAMotor() {
    }

    public BarcoAMotor(String matricula, Double eslora, Integer anio, LocalDate fechaAlquiler, LocalDate fechaDev, String posicionAmarre, Integer cv) {
        super(matricula, eslora, anio, fechaAlquiler, fechaDev, posicionAmarre);
        this.cv = cv;
    }

    public BarcoAMotor(Integer cv, String matricula, Double eslora, Integer anio) {
        super(matricula, eslora, anio);
        this.cv = cv;
    }

    public Integer getCv() {
        return cv;
    }

    public void setCv(Integer cv) {
        this.cv = cv;
    }

    @Override
    public String toString() {
        return "BarcoAMotor{" + super.toString()+ " ,cv=" + cv + '}';
    }

    @Override
    public double calcularModulo() {
        return (super.calcularModulo())+ cv ; 
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
