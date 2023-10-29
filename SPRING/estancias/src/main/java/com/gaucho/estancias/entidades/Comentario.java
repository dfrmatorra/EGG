package com.gaucho.estancias.entidades;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Comentario {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name="uuid", strategy = "uuid2")
    private String id;
    private String descripcion;
    @ManyToOne
    private Casa casa;

    public Comentario() {
    }

    public Comentario(String id, String descripcion, Casa casa) {
        this.id = id;
        this.descripcion = descripcion;
        this.casa = casa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Casa getCasa() {
        return casa;
    }
    public void setCasa(Casa casa) {
        this.casa = casa;
    }
}
