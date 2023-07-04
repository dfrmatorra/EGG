package estancias.entidades;

/**
 *
 * @author DarioF
 */
public class Comentario{
    
    private int idComentario;
    private int idCasaComentario;
    private String comentario;

    public Comentario() {
    }

    public Comentario(int idComentario, int idCasaComentario, String comentario) {
        this.idComentario = idComentario;
        this.idCasaComentario = idCasaComentario;
        this.comentario = comentario;
    }

    public int getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(int idComentario) {
        this.idComentario = idComentario;
    }

    public int getIdCasaComentario() {
        return idCasaComentario;
    }

    public void setIdCasaComentario(int idCasaComentario) {
        this.idCasaComentario = idCasaComentario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "Comentario{" + "idComentario=" + idComentario + ", idCasaComentario=" + idCasaComentario + ", comentario=" + comentario + '}';
    }
    
    
    
}
