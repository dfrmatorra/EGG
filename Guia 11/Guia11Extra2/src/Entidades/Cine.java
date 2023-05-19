package Entidades;


import Entidades.Pelicula;

public class Cine {

    private Pelicula pelicula;

    private Espectador[] espectadores;

    private double precio;

    private Asiento[][] sala;

    public Cine() {
    }

    public Cine(Pelicula pelicula, Espectador[] espectadores, double precio, Asiento[][] sala) {
        this.pelicula = pelicula;
        this.espectadores = espectadores;
        this.precio = precio;
        this.sala = sala;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Espectador[] getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(Espectador[] espectadores) {
        this.espectadores = espectadores;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Asiento[][] getSala() {
        return sala;
    }

    public void setSala(Asiento[][] sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "Cine{" + "pelicula=" + pelicula + ", espectadores=" + espectadores + ", precio=" + precio + ", sala=" + sala + '}';
    }
    
}
