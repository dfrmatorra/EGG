package tienda.servicios;

import tienda.persistencia.ProductoDAO;
import java.util.Collection;
import java.util.Locale;
import tienda.entidades.Producto;

/**
 *
 * @author DarioF
 */
public class ProductoService {

    private ProductoDAO dao;

    public ProductoService() {
        this.dao = new ProductoDAO();
    }

    public void crearProducto(String nombre, double precio, int codigoFabricante) throws Exception {

        try {
            //Validamos
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }

            if (precio <= 0) {
                throw new Exception("Debe indicar el precio");
            }

            if (codigoFabricante <= 0) {
                throw new Exception("Debe indicar el codigoFabricante");
            }

            //Creamos el producto
            Producto producto = new Producto();
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigoFabricante(codigoFabricante);

            dao.crearProducto(producto);

        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarProducto(int codigo, Producto producto2) throws Exception {

        try {

            //Validamos
            if (codigo <= 0) {
                throw new Exception("Debe ingresar un codigo valido");
            }

            //Buscamos
            Producto producto = buscarProductoPorCodigo(codigo);

            dao.modificarProducto(producto, producto2);
        } catch (Exception e) {
            throw e;
        }
    }

    public Producto buscarProductoPorCodigo(int codigo) throws Exception {

        try {

            //Validamos
            if (codigo <= 0) {
                throw new Exception("Debe ingresar un codigo valido");
            }
            Producto producto = dao.buscarProductoPorCodigo(codigo);
            //Verificamos
            if (producto == null) {
                throw new Exception("No se econtró el producto indicado");
            }

            return producto;
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Producto> listarProductos() throws Exception {

        try {

            Collection<Producto> productos = dao.listarProductos();

            return productos;
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirProductos(int opc) throws Exception {

        try {

            //Listamos los productos
            Collection<Producto> productos = listarProductos();

            //Imprimimos los productos
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                if (opc == 1) {
                    for (Producto p : productos) {
                        System.out.println(p.getCodigo() + " - " + p);
                    }
                }
                if (opc == 2) {
                    for (Producto p : productos) {
                        System.out.println(p.getCodigo() + " - " + p.getNombre().toString());
                    }
                }
                if (opc == 3) {
                    for (Producto p : productos) {
                        System.out.println(p.getCodigo() + " - " + "Nombre: " + p.getNombre() + " - Precio: "
                                + p.getPrecio());
                    }
                }
                if (opc == 4) {
                    for (Producto p : productos) {
                        if (p.getNombre().toLowerCase().contains("portátil")) {
                            System.out.println("Nombre: " + p.getNombre() + " - Precio: "
                                    + p.getPrecio());
                        }
                    }
                }
                if (opc == 5) {
                    System.out.println(dao.buscarProductoMasBarato());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void eliminarProducto(int codigo) throws Exception {

        try {

            //Validamos 
            if (codigo <= 0) {
                throw new Exception("Debe indicar el codigo");
            }
            dao.eliminarProducto(codigo);
        } catch (Exception e) {
            throw e;
        }
    }


}
