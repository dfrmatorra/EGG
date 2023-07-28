/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import Enumeradores.FormaPago;
import java.util.Date;

/**
 *
 * @author DarioF
 */
public class Cuota {
    
    private int numCuotas;
    private double montoCuota;
    private boolean pagado;
    private Date vencimiento;
    private FormaPago formaPago;

    public Cuota() {
    }

    public Cuota(int numCuotas, double montoCuota, boolean pagado, Date vencimiento, FormaPago formaPago) {
        this.numCuotas = numCuotas;
        this.montoCuota = montoCuota;
        this.pagado = pagado;
        this.vencimiento = vencimiento;
        this.formaPago = formaPago;
    }

    public int getNumCuotas() {
        return numCuotas;
    }

    public void setNumCuotas(int numCuotas) {
        this.numCuotas = numCuotas;
    }

    public double getMontoCuota() {
        return montoCuota;
    }

    public void setMontoCuota(double montoCuota) {
        this.montoCuota = montoCuota;
    }

    public boolean getPagado() {
        return pagado;
    }

    public void setPagado(boolean b) {
        this.pagado = pagado;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }


    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        return "Cuota{" +
                "cantCuotas=" + numCuotas +
                ", montoCuota=" + montoCuota +
                ", pagado=" + pagado +
                ", vencimiento=" + vencimiento +
                ", formaPago=" + formaPago +
                '}';
    }
}
