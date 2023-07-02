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

            String sql = "INSERT INTO Estancia (id_Estancia, id_Cliente, id_Casa, nombre_Huesped, fecha_Desde, fecha_Hasta)"
                    + "VALUES ( " + estancia.getIdEstancia()+ " , " + estancia.getIdCliente()+ " , " + estancia.getIdCasa()+ " , '" + 
                    estancia.getNombreHuesped() + "' , " +estancia.getFechaDesde() + " , " + estancia.getFechaHasta() + " );";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
/*
    public void modificarEstancia(Estancia estancia, Estancia estancia2) throws Exception {
        try {
            if (estancia == null) {
                throw new Exception("Debe indicar el estancia que desea modificar");
            }

            String sql = "UPDATE Estancia SET "
                    + "nombre = '" + estancia2.getNombre() + "' , precio =  " + estancia2.getPrecio() + " , codigo_fabricante = "
                    + estancia2.getCodigoFabricante() + " WHERE codigo = " + estancia.getCodigo();
                   

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void eliminarEstancia(int codigo) throws Exception {
        try {

            String sql = "DELETE FROM Estancia WHERE codigo = '" + codigo + "'";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public Estancia buscarEstanciaPorCodigo(int codigo) throws Exception {
        try {

            String sql = "SELECT * FROM estancia "
                    + " WHERE codigo = '" + codigo + "'";

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
    }

    public Estancia buscarEstanciaMasBarato() throws Exception {
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
    }

    public Collection<Estancia> listarEstancias() throws Exception {
        try {
            String sql = "SELECT * FROM Estancia";

            consultarBase(sql);

            Estancia estancia = null;
            Collection<Estancia> estancias = new ArrayList();
            while (resultado.next()) {
                estancia = new Estancia();
                estancia.setCodigo(resultado.getInt(1));
                estancia.setNombre(resultado.getString(2));
                estancia.setPrecio(resultado.getDouble(3));
                estancia.setCodigoFabricante(resultado.getInt(4));
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
    
}
