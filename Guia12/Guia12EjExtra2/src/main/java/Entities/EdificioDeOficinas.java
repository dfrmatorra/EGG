package Entities;

public class EdificioDeOficinas extends Edificio {
    protected int numeroDeOficinas;
    protected int cantidadDePer;

    protected int numPisos;

    public EdificioDeOficinas(int numeroDeOficinas, String direccion, int numeroDePisos, int numeroDeHabitaciones) {
        super(direccion, numeroDePisos, numeroDeHabitaciones);
        this.numeroDeOficinas = numeroDeOficinas;
    }

    public int getNumeroDeOficinas() {
        return numeroDeOficinas;
    }

    public void setNumeroDeOficinas(int numeroDeOficinas) {
        this.numeroDeOficinas = numeroDeOficinas;
    }

    @Override
    public String toString() {
        return "EdificioDeOficinas{" + "numeroDeOficinas=" + numeroDeOficinas + '}';
    }

    @Override
    public int calcularSuperficie() {
        return super.calcularSuperficie();
    }

    @Override
    public int calcularVolumen() {
        return super.calcularVolumen();
    }
}
