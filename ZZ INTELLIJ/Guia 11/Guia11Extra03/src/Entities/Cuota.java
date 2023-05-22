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
    
    private int cantCuotas;
    private double montoCuota;
    private boolean pagado;
    private Date vencimiento;
    private Polizas poliza;
    private FormaPago formaPago;

    public Cuota() {
    }

    public Cuota(int cantCuotas, double montoCuota, boolean pagado, Date vencimiento, Polizas poliza, FormaPago formaPago) {
        this.cantCuotas = cantCuotas;
        this.montoCuota = montoCuota;
        this.pagado = pagado;
        this.vencimiento = vencimiento;
        this.poliza = poliza;
        this.formaPago = formaPago;
    }

    public int getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(int cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    public double getMontoCuota() {
        return montoCuota;
    }

    public void setMontoCuota(double montoCuota) {
        this.montoCuota = montoCuota;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }

    public Polizas getPoliza() {
        return poliza;
    }

    public void setPoliza(Polizas poliza) {
        this.poliza = poliza;
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
                "cantCuotas=" + cantCuotas +
                ", montoCuota=" + montoCuota +
                ", pagado=" + pagado +
                ", vencimiento=" + vencimiento +
                ", poliza=" + poliza +
                ", formaPago=" + formaPago +
                '}';
    }
}
