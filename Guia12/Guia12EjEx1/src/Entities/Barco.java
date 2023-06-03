package Entities;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author CASA
 */
public class Barco {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    protected String matricula;
    protected Double eslora;
    protected Integer anio;
    protected LocalDate fechaAlquiler;
    protected LocalDate fechaDev;
    protected String posicionAmarre;


    public Barco() {
    }

    public Barco(String matricula, Double eslora, Integer anio, LocalDate fechaAlquiler, LocalDate fechaDev, String posicionAmarre) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anio = anio;
            }
    public Barco(String matricula, Double eslora, Integer anio) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anio = anio;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getEslora() {
        return eslora;
    }

    public void setEslora(Double eslora) {
        this.eslora = eslora;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDev() {
        return fechaDev;
    }

    public void setFechaDev(LocalDate fechaDev) {
        this.fechaDev = fechaDev;
    }

    public String getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(String posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", anio=" + anio + ", fechaAlquiler=" + fechaAlquiler + ", fechaDev=" + fechaDev + ", posicionAmarre=" + posicionAmarre + '}';
    }


    public double calcularModulo (Barco barco){
        return 10*barco.eslora;
    }
    
    public double precioFinal(Barco barco){
        long numeroDeDias = ChronoUnit.DAYS.between(barco.fechaAlquiler, barco.fechaDev);

        return (calcularModulo(barco)*numeroDeDias);
    }
    
}
