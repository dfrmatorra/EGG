package Entidades;


import java.util.ArrayList;
import java.util.List;


public class Persona {

    private String nombre;
    private String apellido;
    private Integer edad;
    private Integer dni;
    private List<Perro> perro;

    public Persona() {
        this.perro = new ArrayList<>(); // Initialize the list in the constructor
    }
    
 
    public Persona(String nombre, String apellido, Integer edad, Integer dni, List<Perro> perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.perro = perro;
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

    public List<Perro> getPerro() {
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

    public void setPerro(List<Perro> perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre: " + nombre + ", apellido: " + apellido + ", edad: " + edad + ", dni: " + dni + ", perro: " + perro + '}';
    }

}
