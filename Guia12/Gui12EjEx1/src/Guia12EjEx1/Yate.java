package Guia12EjEx1;

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

    public Yate(Integer cv, Integer numCam, String matricula, Double eslora, Integer anio, Date fechaAlquiler, Date fechaDev, String posicionAmarre) {
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
        return "Yate{" + "cv=" + cv + ", numCam=" + numCam + '}';
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + cv + numCam;
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
