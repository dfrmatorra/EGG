package Entities;

public class EdificioDeOficinas extends Edificio {
    protected int numeroDeOficinas;
    protected int cantidadDePer;
    protected int numPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int numeroDeOficinas, int cantidadDePer, int numPisos, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.numeroDeOficinas = numeroDeOficinas;
        this.cantidadDePer = cantidadDePer;
        this.numPisos = numPisos;
    }

    public int getNumeroDeOficinas() {
        return numeroDeOficinas;
    }

    public void setNumeroDeOficinas(int numeroDeOficinas) {
        this.numeroDeOficinas = numeroDeOficinas;
    }

    public int getCantidadDePer() {
        return cantidadDePer;
    }

    public void setCantidadDePer(int cantidadDePer) {
        this.cantidadDePer = cantidadDePer;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    @Override
    public String toString() {
        return "EdificioDeOficinas{" + "numeroDeOficinas=" + numeroDeOficinas + '}';
    }

    @Override
    public int calcularSuperficie() {
        return super.calcularSuperficie()*numPisos;
    }

    @Override
    public int calcularVolumen() {
        return super.calcularVolumen()*numPisos;
    }
}
