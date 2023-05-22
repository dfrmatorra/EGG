/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import Enumeradores.FormaPago;
import Enumeradores.TipoCobertura;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author DarioF
 */
public class Polizas {
    
    private Vehiculos auto;
    private Clientes cliente;
    private int nroPoliza;
    private Date fechaInicio;
    private Date fechaFin;
    private ArrayList<Cuota> cuotas;
    private FormaPago formaPago;
    private double montoAsegurado;
    private boolean granizo;
    private double maxGranizo;
    private TipoCobertura cobertura;

    public Polizas() {
    }

    public Polizas(Vehiculos auto, Clientes cliente, int nroPoliza, Date fechaInicio, Date fechaFin, ArrayList<Cuota> cuotas, FormaPago formaPago, double montoAsegurado, boolean granizo, double maxGranizo, TipoCobertura cobertura) {
        this.auto = auto;
        this.cliente = cliente;
        this.nroPoliza = nroPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cuotas = cuotas;
        this.formaPago = formaPago;
        this.montoAsegurado = montoAsegurado;
        this.granizo = granizo;
        this.maxGranizo = maxGranizo;
        this.cobertura = cobertura;
    }

    public Vehiculos getAuto() {
        return auto;
    }

    public void setAuto(Vehiculos auto) {
        this.auto = auto;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public int getNroPoliza() {
        return nroPoliza;
    }

    public void setNroPoliza(int nroPoliza) {
        this.nroPoliza = nroPoliza;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public ArrayList<Cuota> getCuotas() {
        return cuotas;
    }

    public void setCuotas(ArrayList<Cuota> cuotas) {
        this.cuotas = cuotas;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public double getMontoAsegurado() {
        return montoAsegurado;
    }

    public void setMontoAsegurado(double montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    public double getMaxGranizo() {
        return maxGranizo;
    }

    public void setMaxGranizo(double maxGranizo) {
        this.maxGranizo = maxGranizo;
    }

    public TipoCobertura getCobertura() {
        return cobertura;
    }

    public void setCobertura(TipoCobertura cobertura) {
        this.cobertura = cobertura;
    }

    @Override
    public String toString() {
        return "Polizas{" +
                "auto=" + auto +
                ", cliente=" + cliente +
                ", nroPoliza=" + nroPoliza +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", cuotas=" + cuotas +
                ", formaPago=" + formaPago +
                ", montoAsegurado=" + montoAsegurado +
                ", granizo=" + granizo +
                ", maxGranizo=" + maxGranizo +
                ", cobertura=" + cobertura +
                '}';
    }
}
