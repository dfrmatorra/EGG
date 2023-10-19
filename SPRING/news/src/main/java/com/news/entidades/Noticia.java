package com.news.entidades;

import org.w3c.dom.Text;

import java.time.LocalDate;
import java.util.Date;
import javax.persistence.*;


@Entity
public class Noticia {
    @Id
    private long id; 
    
    private String titulo;
    private String descripcion;
    
    @Temporal(TemporalType.DATE)
    private Date publicacion;
    
    @ManyToOne
    private Autor autor;
    
    @ManyToOne
    private Seccion seccion;

    public Noticia() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Column
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Date publicacion) {
        this.publicacion = publicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }
    
    
    
    
}
