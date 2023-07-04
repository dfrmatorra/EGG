package estancias.entidades;

/**
 *
 * @author DarioF
 */
public class Familia{
    
    private int idFamilia;
    private String nombreFamilia;
    private int edadMinima;
    private int edadMaxima;
    private int numHijos;
    private String emailFamilia;
    private int idCasaFamilia;

    public Familia() {
    }

    public Familia(int idFamilia, String nombreFamilia, int edadMinima, int edadMaxima, int numHijos, String emailFamilia, int idCasaFamilia) {
        this.idFamilia = idFamilia;
        this.nombreFamilia = nombreFamilia;
        this.edadMinima = edadMinima;
        this.edadMaxima = edadMaxima;
        this.numHijos = numHijos;
        this.emailFamilia = emailFamilia;
        this.idCasaFamilia = idCasaFamilia;
    }

    public int getIdFamilia() {
        return idFamilia;
    }

    public void setIdFamilia(int idFamilia) {
        this.idFamilia = idFamilia;
    }

    public String getNombreFamilia() {
        return nombreFamilia;
    }

    public void setNombreFamilia(String nombreFamilia) {
        this.nombreFamilia = nombreFamilia;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public int getEdadMaxima() {
        return edadMaxima;
    }

    public void setEdadMaxima(int edadMaxima) {
        this.edadMaxima = edadMaxima;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    public String getEmailFamilia() {
        return emailFamilia;
    }

    public void setEmailFamilia(String emailFamilia) {
        this.emailFamilia = emailFamilia;
    }

    public int getIdCasaFamilia() {
        return idCasaFamilia;
    }

    public void setIdCasaFamilia(int idCasaFamilia) {
        this.idCasaFamilia = idCasaFamilia;
    }

    @Override
    public String toString() {
        return "Familia{" + "idFamilia=" + idFamilia + ", nombreFamilia=" + nombreFamilia + ", edadMinima=" + edadMinima + ", edadMaxima=" + edadMaxima + ", numHijos=" + numHijos + ", emailFamilia=" + emailFamilia + ", idCasaFamilia=" + idCasaFamilia + '}';
    }
    
    
    
}
