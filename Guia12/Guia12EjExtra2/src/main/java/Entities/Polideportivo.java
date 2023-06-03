package Entities;

public class Polideportivo extends Edificio {
    private String polideportivo;
    private String techado;

    public Polideportivo(String polideportivo, String techado) {
        this.polideportivo = polideportivo;
        this.techado = techado;
    }

    public String getPolideportivo() {
        return polideportivo;
    }

    public void setPolideportivo(String polideportivo) {
        this.polideportivo = polideportivo;
    }

    public String getTechado() {
        return techado;
    }

    public void setTechado(String techado) {
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
