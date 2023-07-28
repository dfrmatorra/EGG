package Entities;

import java.time.LocalDate;
<<<<<<< HEAD:Guia12/Guia12EjEx1/src/Entities/Yate.java
import java.time.temporal.ChronoUnit;
=======
>>>>>>> 6bce9e2e489650acf13b8e3f123b2f1481a61213:Guia12/Gui12EjEx1/src/Entities/Yate.java
import java.util.Date;

/**
 *
 * @author CASA
 */
public final class Yate extends Barco {

    protected Integer cv;
    protected Integer numCam;

    public Yate() {
    }

    public Yate(String matricula, Double eslora, Integer anio, LocalDate fechaAlquiler, LocalDate fechaDev, String posicionAmarre, Integer cv, Integer numCam) {
        super(matricula, eslora, anio, fechaAlquiler, fechaDev, posicionAmarre);
        this.cv = cv;
        this.numCam = numCam;
    }

    public Yate(Integer cv, Integer numCam, String matricula, Double eslora, Integer anio) {
        super(matricula, eslora, anio);
        this.cv = cv;
        this.numCam = numCam;
    }

    public Integer getCv() {
        return cv;
    }

    public void setCv(Integer cv) {
        this.cv = cv;
    }

    public Integer getNumCam() {
        return numCam;
    }

    public void setNumCam(Integer numCam) {
        this.numCam = numCam;
    }

    @Override
    public String toString() {
        return "Yate{" + super.toString() +"cv=" + cv + ", numCam=" + numCam + '}';
    }

    @Override
    public double calcularModulo(Barco barco) {
        return super.calcularModulo(barco) + cv + numCam;
    }

    @Override
    public double precioFinal(Barco barco) {
        long numeroDeDias = ChronoUnit.DAYS.between(((BarcoAMotor) barco).fechaAlquiler, barco.fechaDev);

        return (calcularModulo(barco) * numeroDeDias);
    }
}
