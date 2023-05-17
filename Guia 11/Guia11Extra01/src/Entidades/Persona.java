package Entidades;

import java.util.ArrayList;


public class Persona {

    private String nombre;
    private String apellido;
    private Integer edad;
    private Integer dni;
    private ArrayList<Perro> perro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer edad, Integer dni, ArrayList<Perro> perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.perro = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public Integer getDni() {
        return dni;
    }

    public ArrayList<Perro> getPerro() {
        return this.perro;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public void setPerro(ArrayList<Perro> perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre: " + nombre + ", apellido: " + apellido + ", edad: " + edad + ", dni: " + dni + ", perro: " + perro + '}';
    }

}
