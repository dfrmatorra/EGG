package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Producto;
import tienda.persistencia.DAO;
import tienda.servicios.FabricanteService;
import tienda.servicios.ProductoService;

/**
 *
 * @author DarioF
 */
public final class ProductoDAO extends DAO {

    public void crearProducto(Producto producto) throws Exception {

        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto");
            }

            String sql = "INSERT INTO Producto (nombre, precio, codigo_Fabricante )"
                    + "VALUES ( '" + producto.getNombre() + "' , " + producto.getPrecio() + " , " + producto.getCodigoFabricante() + " );";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void modificarProducto(Producto producto, Producto producto2) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto que desea modificar");
            }

            String sql = "UPDATE Producto SET "
                    + "nombre = '" + producto2.getNombre() + "' , precio =  " + producto2.getPrecio() + " , codigo_fabricante = "
                    + producto2.getCodigoFabricante() + " WHERE codigo = " + producto.getCodigo();
                   

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void eliminarProducto(int codigo) throws Exception {
        try {

            String sql = "DELETE FROM Producto WHERE codigo = '" + codigo + "'";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public Producto buscarProductoPorCodigo(int codigo) throws Exception {
        try {

            String sql = "SELECT * FROM producto "
                    + " WHERE codigo = '" + codigo + "'";

            consultarBase(sql);

            Producto producto = null;
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
            }
            desconectarBase();
            return producto;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Producto buscarProductoMasBarato() throws Exception {
        try {

            String sql = "SELECT * FROM producto "
                    + "WHERE precio = (SELECT MIN(precio) FROM producto)";

            consultarBase(sql);

            Producto producto = null;
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
            }
            desconectarBase();
            return producto;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<Producto> listarProductos() throws Exception {
        try {
            String sql = "SELECT * FROM Producto";

            consultarBase(sql);

            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }

}
