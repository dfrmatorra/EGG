package Guia12EjEx1;

import Enum.Amarre;
import java.util.Calendar;
import java.util.Date;
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
    protected Date fechaAlquiler;
    protected Date fechaDev;
    protected String posicionAmarre;

    public Barco() {
    }

    public Barco(String matricula, Double eslora, Integer anio, Date fechaAlquiler, Date fechaDev, String posicionAmarre) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anio = anio;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDev = fechaDev;
        this.posicionAmarre = posicionAmarre;
    }
        public Barco(String matricula, Double eslora, Integer anio) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anio = anio;
    }
    

    @Override
    public String toString() {
        return "Barco{" + "leer=" + leer + ", matricula=" + matricula + ", eslora=" + eslora + ", anio=" + anio + ", fechaAlquiler=" + fechaAlquiler + ", fechaDev=" + fechaDev + ", posicionAmarre=" + posicionAmarre + '}';
    }


public void alquilerBarco(){
    
    System.out.println("Ingrese la fecha de INICIO de alquiler del barco:");
    System.out.println("Dia:");
    int dia = leer.nextInt();
    System.out.println("Mes:");
    int mes = leer.nextInt();
    System.out.println("Anio:");
    int ano = leer.nextInt();
    Date fecha = new Date(dia, mes, ano);
    this.fechaAlquiler = fecha;
    System.out.println("Ingrese la fecha de DEVOLUCION de alquiler del barco:");
    System.out.println("Dia:");
    int diaDev = leer.nextInt();
    System.out.println("Mes:");
    int mesDev = leer.nextInt();
    System.out.println("Anio:");
    int anoDev = leer.nextInt();
    Date fechaD = new Date(dia, mes, ano);
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
        long diferenciaEnMilisegundos = fechaDev.getTime() - fechaAlquiler.getTime();
        int numeroDeDias = (int) (diferenciaEnMilisegundos / (1000 * 60 * 60 * 24));
        return (calcularModulo()*numeroDeDias);
    }
    
}
