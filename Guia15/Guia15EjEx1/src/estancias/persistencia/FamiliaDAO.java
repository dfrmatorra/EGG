package estancias.persistencia;

import estancias.entidades.Familia;
import java.util.ArrayList;

/**
 *
 * @author CASA
 */
public class FamiliaDAO extends DAO{
    
    public void crearFamilia(Familia familia) throws Exception {

        try {
            if (familia == null) {
                throw new Exception("Debe indicar el familia");
            }

            String sql = "INSERT INTO familias (int idFamilia, String nombre, int edad_minima, int edad_maxima, int num_hijos, "
                    + "String email, int  id_casa_familia)"
                    + "VALUES ( " + familia.getIdFamilia()+ " , '" + familia.getNombreFamilia() + "' , " + familia.getEdadMinima() + " , "
                    + familia.getEdadMaxima() + " , " + familia.getNumHijos() + " , '" + familia.getEmailFamilia() + "' , " 
                    + familia.getIdCasaFamilia()+ "' );";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void modificarFamilia(Familia familia, Familia familia2) throws Exception {
        try {
            if (familia == null) {
                throw new Exception("Debe indicar el familia que desea modificar");
            }
            String sql = "UPDATE familias SET "
                    + "id_familia = " + familia2.getIdFamilia() + "' , nombre = '" + familia2.getNombreFamilia() + "' , edad_minima = " + familia2.getEdadMinima() + " , edad_maxima = " + familia2.getEdadMaxima() + " , num_hijos = " + familia2.getNumHijos()
                    + " , email = '" + familia2.getEmailFamilia() + "' , id_casa_familia = " + familia2.getIdCasaFamilia() + "' WHERE codigo = " + familia.getIdFamilia();
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void eliminarFamilia(int idFamilia) throws Exception {
        try {

            String sql = "DELETE FROM familias WHERE id_familia = " + idFamilia + "";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public Familia buscarFamiliaPorId(int idFamilia) throws Exception {
        try {

            String sql = "SELECT * FROM familias "
                    + " WHERE id_familia = "  + idFamilia;

            consultarBase(sql);

            Familia familia = null;
            while (resultado.next()) {
                familia = new Familia();
                familia.setIdFamilia(resultado.getInt(1));
                familia.setNombreFamilia(resultado.getString(2));
                familia.setEdadMinima(resultado.getInt(3));
                familia.setEdadMaxima(resultado.getInt(4));
                familia.setNumHijos(resultado.getInt(5));
                familia.setEmailFamilia(resultado.getString(6));
                familia.setIdCasaFamilia(resultado.getInt(7));
            }
            desconectarBase();
            return familia;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public ArrayList<Familia> listarFamilias() throws Exception {
        try {
            String sql = "SELECT * FROM familias";

            consultarBase(sql);

            Familia familia = null;
            ArrayList<Familia> familias = new ArrayList();
            while (resultado.next()) {
                familia = new Familia();
                familia.setIdFamilia(resultado.getInt(1));
                familia.setNombreFamilia(resultado.getString(2));
                familia.setEdadMinima(resultado.getInt(3));
                familia.setEdadMaxima(resultado.getInt(4));
                familia.setNumHijos(resultado.getInt(5));
                familia.setEmailFamilia(resultado.getString(6));
                familia.setIdCasaFamilia(resultado.getInt(7));
                familias.add(familia);
            }
            desconectarBase();
            return familias;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }

    public ArrayList <Familia> buscarFamilia1(String sql) throws Exception {
        try {

            consultarBase(sql);

            Familia familia = null;
            ArrayList<Familia> familias1 = new ArrayList();
            while (resultado.next()) {
                familia = new Familia();
                familia.setIdFamilia(resultado.getInt(1));
                familia.setNombreFamilia(resultado.getString(2));
                familia.setEdadMinima(resultado.getInt(3));
                familia.setEdadMaxima(resultado.getInt(4));
                familia.setNumHijos(resultado.getInt(5));
                familia.setEmailFamilia(resultado.getString(6));
                familia.setIdCasaFamilia(resultado.getInt(7));
                familias1.add(familia);
            }
            desconectarBase();
            return familias1;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    
}
