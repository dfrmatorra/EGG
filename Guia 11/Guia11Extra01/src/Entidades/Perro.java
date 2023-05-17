package Entidades;

import Enums.Raza;

public class Perro {

    private String nombre;
    private Raza raza;
    private Integer edad;
    private String tamanio;
    private boolean adoptado;

    public Perro() {
    }

    public Perro(String nombre, Raza raza, Integer edad, String tamanio, boolean adoptado) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
        this.adoptado = adoptado;
    }

    public String getNombre() {
        return nombre;
    }

    public Raza getRaza() {
        return raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public String getTamanio() {
        return tamanio;
    }

    public boolean getAdoptado() {
        return adoptado;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public void setAdoptado(boolean adoptado) {
        this.adoptado = adoptado;
    }
    

    @Override
    public String toString() {
        return "Perro{" + "nombre: " + nombre + ", raza: " + raza + ", edad: " + edad + ", tamanio: " + tamanio + '}';
    }

}
