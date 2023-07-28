package estancias.entidades;

import java.util.Date;

/**
 *
 * @author DarioF
 */
public class Casa {
    
    private int idCasa;
    private String calleCasa;
    private int numeroCasa;
    private String codigoPostalCasa;
    private String ciudadCasa;
    private String paisCasa;
    private Date fechaDesdeCasa;
    private Date fechaHastaCasa;
    private int tiempoMinimo;
    private int tiempoMaximo;
    private double precioHabitacion;
    private String tipoVivienda;

    public Casa() {
    }

    public Casa(int idCasa, String calleCasa, int numeroCasa, String codigoPostalCasa, String ciudadCasa, String paisCasa, Date fechaDesdeCasa, Date fechaHastaCasa, int tiempoMinimo, int tiempoMaximo, double precioHabitacion, String tipoVivienda) {
        this.idCasa = idCasa;
        this.calleCasa = calleCasa;
        this.numeroCasa = numeroCasa;
        this.codigoPostalCasa = codigoPostalCasa;
        this.ciudadCasa = ciudadCasa;
        this.paisCasa = paisCasa;
        this.fechaDesdeCasa = fechaDesdeCasa;
        this.fechaHastaCasa = fechaHastaCasa;
        this.tiempoMinimo = tiempoMinimo;
        this.tiempoMaximo = tiempoMaximo;
        this.precioHabitacion = precioHabitacion;
        this.tipoVivienda = tipoVivienda;
    }

    public int getIdCasa() {
        return idCasa;
    }

    public void setIdCasa(int idCasa) {
        this.idCasa = idCasa;
    }

    public String getCalleCasa() {
        return calleCasa;
    }

    public void setCalleCasa(String calleCasa) {
        this.calleCasa = calleCasa;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getCodigoPostalCasa() {
        return codigoPostalCasa;
    }

    public void setCodigoPostalCasa(String codigoPostalCasa) {
        this.codigoPostalCasa = codigoPostalCasa;
    }

    public String getCiudadCasa() {
        return ciudadCasa;
    }

    public void setCiudadCasa(String ciudadCasa) {
        this.ciudadCasa = ciudadCasa;
    }

    public String getPaisCasa() {
        return paisCasa;
    }

    public void setPaisCasa(String paisCasa) {
        this.paisCasa = paisCasa;
    }

    public Date getFechaDesdeCasa() {
        return fechaDesdeCasa;
    }

    public void setFechaDesdeCasa(Date fechaDesdeCasa) {
        this.fechaDesdeCasa = fechaDesdeCasa;
    }

    public Date getFechaHastaCasa() {
        return fechaHastaCasa;
    }

    public void setFechaHastaCasa(Date fechaHastaCasa) {
        this.fechaHastaCasa = fechaHastaCasa;
    }

    public int getTiempoMinimo() {
        return tiempoMinimo;
    }

    public void setTiempoMinimo(int tiempoMinimo) {
        this.tiempoMinimo = tiempoMinimo;
    }

    public int getTiempoMaximo() {
        return tiempoMaximo;
    }

    public void setTiempoMaximo(int tiempoMaximo) {
        this.tiempoMaximo = tiempoMaximo;
    }

    public double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    public String getTipoVivienda() {
        return tipoVivienda;
    }

    public void setTipoVivienda(String tipoVivienda) {
        this.tipoVivienda = tipoVivienda;
    }

    @Override
    public String toString() {
        return "Casa{" + "idCasa=" + idCasa + ", calleCasa=" + calleCasa + ", numeroCasa=" + numeroCasa + ", codigoPostalCasa=" + codigoPostalCasa + ", ciudadCasa=" + ciudadCasa + ", paisCasa=" + paisCasa + ", fechaDesdeCasa=" + fechaDesdeCasa + ", fechaHastaCasa=" + fechaHastaCasa + ", tiempoMinimo=" + tiempoMinimo + ", tiempoMaximo=" + tiempoMaximo + ", precioHabitacion=" + precioHabitacion + ", tipoVivienda=" + tipoVivienda + '}';
    }
    
    
    
    
}
