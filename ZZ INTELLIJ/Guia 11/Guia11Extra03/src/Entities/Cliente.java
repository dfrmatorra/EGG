/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.util.ArrayList;

/**
 *
 * @author DarioF
 */
public class Cliente {
    
    private String Nombre;
    private String apellido;
    private int dni;
    private String mail;
    private String domicilio;
    private int telefono;
    private ArrayList<Vehiculo> autos;

    public Cliente() {
    }
        
    public Cliente(String Nombre, String apellido, int dni, String mail, String domicilio, int telefono) {
    }

    public Cliente(String nombre, String apellido, int dni, String mail, String domicilio, int telefono, ArrayList<Vehiculo> autos) {
        Nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.mail = mail;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.autos = autos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Vehiculo> getAutos() {
        return autos;
    }

    public void setAutos(ArrayList<Vehiculo> autos) {
        this.autos = autos;
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "Nombre='" + Nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                ", mail='" + mail + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", telefono=" + telefono +
                ", autos=" + autos +
                '}';
    }
}
