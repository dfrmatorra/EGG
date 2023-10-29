package com.gaucho.estancias.entidades;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Familia {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name="uuid", strategy = "uuid2")
    private String id;
    private String nombre;
    private int edadMin;
    private int edadMax;
    private int numHijos;
    private String email;
    @OneToOne
    private Usuario usuario;
    @ManyToOne
    private Casa casa;

    public Familia() {
    }

    public Familia(String id, String nombre, int edadMin, int edadMax,
                   int numHijos, String email, Usuario usuario, Casa casa) {
        this.id = id;
        this.nombre = nombre;
        this.edadMin = edadMin;
        this.edadMax = edadMax;
        this.numHijos = numHijos;
        this.email = email;
        this.usuario = usuario;
        this.casa = casa;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(int edadMin) {
        this.edadMin = edadMin;
    }

    public int getEdadMax() {
        return edadMax;
    }

    public void setEdadMax(int edadMax) {
        this.edadMax = edadMax;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Casa getCasa() {
        return casa;
    }
    public void setCasa(Casa casa) {
        this.casa = casa;
    }
}
