package estancias.persistencia;

import estancias.entidades.Estancia;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author DarioF
 */
public class EstanciaDAO extends DAO{
    
    
    
     public void crearEstancia(Estancia estancia) throws Exception {

        try {
            if (estancia == null) {
                throw new Exception("Debe indicar el estancia");
            }

            String sql = "INSERT INTO estancias (id_Estancia, id_Cliente, id_Casa, nombre_Huesped, fecha_Desde, fecha_Hasta)"
                    + "VALUES ( " + estancia.getIdEstancia()+ " , " + estancia.getIdCliente()+ " , " + estancia.getIdCasa()+ " , '" + 
                    estancia.getNombreHuesped() + "' , " +estancia.getFechaDesde() + " , " + estancia.getFechaHasta() + " );";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void modificarEstancia(Estancia estancia, Estancia estancia2) throws Exception {
        try {
            if (estancia == null) {
                throw new Exception("Debe indicar el estancia que desea modificar");
            }
            String sql = "UPDATE estancias SET " 
                    + "id_Estancia = " + estancia2.getIdEstancia()+ " , id_Cliente =  " + estancia2.getIdCliente()+ " , id_Casa = "
                    + estancia2.getIdCasa() + " , nombre_Huesped =  '" + estancia2.getNombreHuesped() + "' , fecha_Desde =  '" + estancia2.getFechaDesde()
                    + "' , fecha_Hasta =  '" + estancia2.getFechaHasta() + "' WHERE codigo = " + estancia.getIdEstancia();
                  
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
    public void eliminarEstancia(int idEstancia) throws Exception {
        try {

            String sql = "DELETE FROM estancias WHERE id_estancia = '" + idEstancia + "'";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public Estancia buscarEstanciaPorId(int idEstancia) throws Exception {
        try {

            String sql = "SELECT * FROM estancias "
                    + " WHERE id_estancia = '" + idEstancia + "'";

            consultarBase(sql);

            Estancia estancia = null;
            while (resultado.next()) {
                estancia = new Estancia();
                estancia.setIdEstancia(resultado.getInt(1));
                estancia.setIdCliente(resultado.getInt(2));
                estancia.setIdCasa(resultado.getInt(3));
                estancia.setNombreHuesped(resultado.getString(4));
                estancia.setFechaDesde(resultado.getDate(5));
                estancia.setFechaHasta(resultado.getDate(6));
            }
            desconectarBase();
            return estancia;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }


    public ArrayList<Estancia> listarEstancias() throws Exception {
        try {
            String sql = "SELECT * FROM estancias";

            consultarBase(sql);

            Estancia estancia = null;
            ArrayList<Estancia> estancias = new ArrayList();
            while (resultado.next()) {
                estancia = new Estancia();
                estancia.setIdEstancia(resultado.getInt(1));
                estancia.setIdCliente(resultado.getInt(2));
                estancia.setIdCasa(resultado.getInt(3));
                estancia.setNombreHuesped(resultado.getString(4));
                estancia.setFechaDesde(resultado.getDate(5));
                estancia.setFechaHasta(resultado.getDate(6));
                estancias.add(estancia);
            }
            desconectarBase();
            return estancias;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
    
       /* public Estancia buscarEstanciaMasBarato() throws Exception {
        try {

            String sql = "SELECT * FROM estancia "
                    + "WHERE precio = (SELECT MIN(precio) FROM estancia)";

            consultarBase(sql);

            Estancia estancia = null;
            while (resultado.next()) {
                estancia = new Estancia();
                estancia.setCodigo(resultado.getInt(1));
                estancia.setNombre(resultado.getString(2));
                estancia.setPrecio(resultado.getDouble(3));
                estancia.setCodigoFabricante(resultado.getInt(4));
            }
            desconectarBase();
            return estancia;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }*/    
}
