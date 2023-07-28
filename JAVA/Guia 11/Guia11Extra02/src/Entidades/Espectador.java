package Entidades;

public class Espectador {

    private int dni;

    private String nombre;

    private int edad;

    private double dinero;

    private String asiento;

    public Espectador() {
    }

    public Espectador(int dni, String nombre, int edad, double dinero, String asiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
        this.asiento = asiento;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    @Override
    public String toString() {
        return "Espectador{" + "dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + ", asiento=" + asiento + '}';
    }
}
