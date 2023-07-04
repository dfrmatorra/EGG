package estancias.persistencia;

import estancias.entidades.Casa;
import estancias.persistencia.DAO;
import java.util.ArrayList;

/**
 *
 * @author CASA
 */
public class CasaDAO extends DAO {

    public void crearCasa(Casa casa) throws Exception {

        try {
            if (casa == null) {
                throw new Exception("Debe indicar la casa");
            }

            String sql = "INSERT INTO casas (int idCasa, String calleCasa, int numeroCasa, String codigoPostalCasa, String ciudadCasa, String paisCasa, Date fechaDesdeCasa, "
                    + "Date fechaHastaCasa, int tiempoMinimo, int tiempoMaximo, double precioHabitacion, String tipoVivienda )"
                    + "VALUES ( " + casa.getIdCasa() + " , '" + casa.getCalleCasa() + "' , " + casa.getNumeroCasa() + " , '"
                    + casa.getCodigoPostalCasa() + "' , '" + casa.getCiudadCasa() + "' , '" + casa.getPaisCasa() + "' , '" + casa.getFechaDesdeCasa()
                    + "' , '" + casa.getFechaHastaCasa() + "' , " + casa.getTiempoMinimo() + " , " + casa.getTiempoMaximo() + " , " + casa.getPrecioHabitacion()
                    + " , '" + casa.getTipoVivienda() + "' );";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void modificarCasa(Casa casa, Casa casa2) throws Exception {
        try {
            if (casa == null) {
                throw new Exception("Debe indicar la casa que desea modificar");
            }
            String sql = "UPDATE casas SET "
                    + "id_casa = " + casa2.getIdCasa() + "' , calle = '" + casa2.getCalleCasa() + "' , numero = " + casa2.getNumeroCasa() + " , codigo_postal =" + casa2.getCodigoPostalCasa() + " , ciudad = '" + casa2.getCiudadCasa()
                    + "' , pais = '" + casa2.getPaisCasa() + "' , fecha_desde = '" + casa2.getFechaDesdeCasa() + "' , fecha_hasta = '" + casa2.getFechaHastaCasa() + "' , tiempo_minimo = " + casa2.getTiempoMinimo()
                    + " , tiempo_maximo = " + casa2.getTiempoMaximo() + " , precio_habitacion = " + casa2.getPrecioHabitacion() + " , tipo_vivienda = '" + casa2.getTipoVivienda() + "' WHERE codigo = " + casa.getIdCasa();

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void eliminarCasa(int idCasa) throws Exception {
        try {

            String sql = "DELETE FROM casas WHERE id_casa = '" + idCasa + "'";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public Casa buscarCasaPorId(int id) throws Exception {
        try {
            
            String sql = "SELECT * FROM clientes "
                    + " WHERE id_casa = " + id;

            consultarBase(sql);

            Casa casa = null;
            while (resultado.next()) {
                casa = new Casa();
                casa.setIdCasa(resultado.getInt(1));
                casa.setCalleCasa(resultado.getString(2));
                casa.setNumeroCasa(resultado.getInt(3));
                casa.setCodigoPostalCasa(resultado.getString(4));
                casa.setCiudadCasa(resultado.getString(5));
                casa.setPaisCasa(resultado.getString(6));
                casa.setFechaDesdeCasa(resultado.getDate(7));
                casa.setFechaHastaCasa(resultado.getDate(8));
                casa.setTiempoMinimo(resultado.getInt(9));
                casa.setTiempoMaximo(resultado.getInt(10));
                casa.setPrecioHabitacion(resultado.getDouble(11));
                casa.setTipoVivienda(resultado.getString(12));
            }
            desconectarBase();
            return casa;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public ArrayList<Casa> listarCasas() throws Exception {
        try {
            String sql = "SELECT * FROM casas";

            consultarBase(sql);

            Casa casa = null;
            ArrayList<Casa> casas = new ArrayList();
            while (resultado.next()) {
                casa = new Casa();
                casa.setIdCasa(resultado.getInt(1));
                casa.setCalleCasa(resultado.getString(2));
                casa.setNumeroCasa(resultado.getInt(3));
                casa.setCodigoPostalCasa(resultado.getString(4));
                casa.setCiudadCasa(resultado.getString(5));
                casa.setPaisCasa(resultado.getString(6));
                casa.setFechaDesdeCasa(resultado.getDate(7));
                casa.setFechaHastaCasa(resultado.getDate(8));
                casa.setTiempoMinimo(resultado.getInt(9));
                casa.setTiempoMaximo(resultado.getInt(10));
                casa.setPrecioHabitacion(resultado.getDouble(11));
                casa.setTipoVivienda(resultado.getString(12));
                casas.add(casa);
            }
            desconectarBase();
            return casas;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }

    public ArrayList <Casa> buscarCasa1(String sql) throws Exception {
        try {

            

            consultarBase(sql);

            Casa casa = null;
            ArrayList<Casa> casasAux = new ArrayList();
            while (resultado.next()) {
                casa = new Casa();
                casa.setIdCasa(resultado.getInt(1));
                casa.setCalleCasa(resultado.getString(2));
                casa.setNumeroCasa(resultado.getInt(3));
                casa.setCodigoPostalCasa(resultado.getString(4));
                casa.setCiudadCasa(resultado.getString(5));
                casa.setPaisCasa(resultado.getString(6));
                casa.setFechaDesdeCasa(resultado.getDate(7));
                casa.setFechaHastaCasa(resultado.getDate(8));
                casa.setTiempoMinimo(resultado.getInt(9));
                casa.setTiempoMaximo(resultado.getInt(10));
                casa.setPrecioHabitacion(resultado.getDouble(11));
                casa.setTipoVivienda(resultado.getString(12));
                casasAux.add(casa);
            }
            desconectarBase();
            return casasAux;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
}
