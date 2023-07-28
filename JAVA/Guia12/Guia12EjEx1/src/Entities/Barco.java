package Entities;

<<<<<<< HEAD:Guia12/Guia12EjEx1/src/Entities/Barco.java
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
=======
import Enum.Amarre;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
>>>>>>> 6bce9e2e489650acf13b8e3f123b2f1481a61213:Guia12/Gui12EjEx1/src/Entities/Barco.java
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

<<<<<<< HEAD:Guia12/Guia12EjEx1/src/Entities/Barco.java

=======
>>>>>>> 6bce9e2e489650acf13b8e3f123b2f1481a61213:Guia12/Gui12EjEx1/src/Entities/Barco.java
    public Barco() {
    }

    public Barco(String matricula, Double eslora, Integer anio, LocalDate fechaAlquiler, LocalDate fechaDev, String posicionAmarre) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anio = anio;
<<<<<<< HEAD:Guia12/Guia12EjEx1/src/Entities/Barco.java
            }
    public Barco(String matricula, Double eslora, Integer anio) {
=======
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDev = fechaDev;
        this.posicionAmarre = posicionAmarre;
    }
        public Barco(String matricula, Double eslora, Integer anio) {
>>>>>>> 6bce9e2e489650acf13b8e3f123b2f1481a61213:Guia12/Gui12EjEx1/src/Entities/Barco.java
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


<<<<<<< HEAD:Guia12/Guia12EjEx1/src/Entities/Barco.java
    public double calcularModulo (Barco barco){
        return 10*barco.eslora;
    }
    
    public double precioFinal(Barco barco){
        long numeroDeDias = ChronoUnit.DAYS.between(barco.fechaAlquiler, barco.fechaDev);

        return (calcularModulo(barco)*numeroDeDias);
=======
public void alquilerBarco(){
    
    System.out.println("Ingrese la fecha de INICIO de alquiler del barco (yyyy-MM-dd):");
    LocalDate fechaAlq = new LocalDate.parse(leer.next());
    this.fechaAlquiler = fechaAlq;
    System.out.println("Ingrese la fecha de DEVOLUCION de alquiler del barco(yyyy-MM-dd):");
    LocalDate fechaD = new LocalDate.parse(leer.next());
    this.fechaDev = fechaD;
    System.out.println("Eliga la posicion de amarre:");
    for (Amarre aux : Amarre.values()) {
            System.out.println(aux);
        }
    this.posicionAmarre = leer.next().toUpperCase();
    
}       

    public double calcularModulo (){
        return 10*eslora;
    }
    
    public double precioFinal(){
        long numeroDeDias = ChronoUnit.DAYS.between(fechaAlquiler, fechaDev);
        return (calcularModulo()*numeroDeDias);
>>>>>>> 6bce9e2e489650acf13b8e3f123b2f1481a61213:Guia12/Gui12EjEx1/src/Entities/Barco.java
    }
    
}
