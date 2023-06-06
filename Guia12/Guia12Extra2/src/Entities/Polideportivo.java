package Entities;

public class Polideportivo extends Edificio {
    private String polideportivo;
    private boolean techado;

    public Polideportivo() {
    }

    public Polideportivo(String polideportivo, boolean techado, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.polideportivo = polideportivo;
        this.techado = techado;
    }

    public String getPolideportivo() {
        return polideportivo;
    }

    public void setPolideportivo(String polideportivo) {
        this.polideportivo = polideportivo;
    }

    public boolean getTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }

    @Override
    public String toString() {
        return "Polideportivo{" +
                "polideportivo='" + polideportivo + '\'' +
                ", techado='" + techado + '\'' +
                '}';
    }

    @Override
    public int calcularSuperficie() {
        return super.calcularSuperficie();
    }

    @Override
    public int calcularVolumen() {
        return super.calcularVolumen();
    }
}
