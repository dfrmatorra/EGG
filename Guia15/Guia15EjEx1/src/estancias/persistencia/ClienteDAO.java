package estancias.persistencia;

import estancias.entidades.Cliente;
import java.util.ArrayList;

/**
 *
 * @author CASA
 */
public class ClienteDAO extends DAO {
    
    
    public void crearCliente(Cliente cliente) throws Exception {

        try {
            if (cliente == null) {
                throw new Exception("Debe indicar el cliente");
            }

            String sql = "INSERT INTO clientes (int idCliente, String nombre, int calle, int numero, String codigoPostal, "
                    + "String ciudad, String pais, " + "String email)"
                    + "VALUES ( " + cliente.getIdCliente()+ " , '" + cliente.getNombre() + "' , '" + cliente.getCalle() + "' , "
                    + cliente.getNumero() + " , '" + cliente.getCodigoPostal() + "' , '" + cliente.getCiudad() + "' , '" + cliente.getPais()
                    + "' , '" + cliente.getEmail() + "' );";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void modificarCliente(Cliente cliente, Cliente cliente2) throws Exception {
        try {
            if (cliente == null) {
                throw new Exception("Debe indicar el cliente que desea modificar");
            }
            String sql = "UPDATE clientes SET "
                    + "id_cliente = " + cliente2.getIdCliente() + "' , nombre = '" + cliente2.getNombre() + "' , calle = '" + cliente2.getCalle() + "' , numero = " + cliente2.getNumero() + " , codigo_postal = '" + cliente2.getCodigoPostal()
                    + "' , ciudad = '" + cliente2.getCiudad() + "' , pais = '" + cliente2.getPais() + "' , email = '" + cliente2.getEmail() + "' WHERE codigo = " + cliente.getIdCliente();
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void eliminarCliente(int idCliente) throws Exception {
        try {

            String sql = "DELETE FROM clientes WHERE id_cliente = '" + idCliente + "'";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public Cliente buscarClientePorId(int idCliente) throws Exception {
        try {

            String sql = "SELECT * FROM clientes "
                    + " WHERE id_cliente = " + idCliente;

            consultarBase(sql);

            Cliente cliente = null;
            while (resultado.next()) {
                cliente = new Cliente();
                cliente.setIdCliente(resultado.getInt(1));
                cliente.setNombre(resultado.getString(2));
                cliente.setCalle(resultado.getString(3));
                cliente.setNumero(resultado.getInt(4));
                cliente.setCodigoPostal(resultado.getString(5));
                cliente.setCiudad(resultado.getString(6));
                cliente.setPais(resultado.getString(7));
                cliente.setEmail(resultado.getString(8));
            }
            desconectarBase();
            return cliente;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public ArrayList<Cliente> listarClientes() throws Exception {
        try {
            String sql = "SELECT * FROM clientes";

            consultarBase(sql);

            Cliente cliente = null;
            ArrayList<Cliente> clientes = new ArrayList();
            while (resultado.next()) {
                cliente = new Cliente();
                cliente.setIdCliente(resultado.getInt(1));
                cliente.setNombre(resultado.getString(2));
                cliente.setCalle(resultado.getString(3));
                cliente.setNumero(resultado.getInt(4));
                cliente.setCodigoPostal(resultado.getString(5));
                cliente.setCiudad(resultado.getString(6));
                cliente.setPais(resultado.getString(7));
                cliente.setEmail(resultado.getString(8));
                clientes.add(cliente);
            }
            desconectarBase();
            return clientes;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }

    /* public Cliente buscarClienteMasBarato() throws Exception {
        try {

            String sql = "SELECT * FROM cliente "
                    + "WHERE precio = (SELECT MIN(precio) FROM cliente)";

            consultarBase(sql);

            Cliente cliente = null;
            while (resultado.next()) {
                cliente = new Cliente();
                cliente.setCodigo(resultado.getInt(1));
                cliente.setNombre(resultado.getString(2));
                cliente.setPrecio(resultado.getDouble(3));
                cliente.setCodigoFabricante(resultado.getInt(4));
            }
            desconectarBase();
            return cliente;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }*/
    
}
