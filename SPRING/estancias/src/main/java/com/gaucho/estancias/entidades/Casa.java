package com.gaucho.estancias.entidades;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.ArrayList;
import java.util.Date;

@Entity
public class Casa {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String calle;
    private int numero;
    private String codPostal;
    private String ciudad;
    private String pais;
    @Temporal(TemporalType.DATE)
    private Date fechaDesde;
    @Temporal(TemporalType.DATE)
    private Date fechaHasta;
    private int minDias;
    private int maxDias;
    private double precio;
    private String tipoVivienda;




    public Casa() {
    }

    public Casa(String id, String calle, int numero, String codPostal, String ciudad, String pais, Date fechaDesde, Date fechaHasta,
                int minDias, int maxDias, double precio, String tipoVivienda) {
        this.id = id;
        this.calle = calle;
        this.numero = numero;
        this.codPostal = codPostal;
        this.ciudad = ciudad;
        this.pais = pais;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.minDias = minDias;
        this.maxDias = maxDias;
        this.precio = precio;
        this.tipoVivienda = tipoVivienda;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Date getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public Date getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public int getMinDias() {
        return minDias;
    }

    public void setMinDias(int minDias) {
        this.minDias = minDias;
    }

    public int getMaxDias() {
        return maxDias;
    }

    public void setMaxDias(int maxDias) {
        this.maxDias = maxDias;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipoVivienda() {
        return tipoVivienda;
    }

    public void setTipoVivienda(String tipoVivienda) {
        this.tipoVivienda = tipoVivienda;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "id='" + id + '\'' +
                ", calle='" + calle + '\'' +
                ", numero=" + numero +
                ", codPostal='" + codPostal + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", pais='" + pais + '\'' +
                ", fechaDesde=" + fechaDesde +
                ", fechaHasta=" + fechaHasta +
                ", minDias=" + minDias +
                ", maxDias=" + maxDias +
                ", precio=" + precio +
                ", tipoVivienda='" + tipoVivienda + '\'' +
                '}';
    }
}
