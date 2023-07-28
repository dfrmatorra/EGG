package estancias.servicios;

import estancias.entidades.Cliente;
import estancias.persistencia.ClienteDAO;
import java.util.ArrayList;

/**
 *
 * @author CASA
 */
public class ClienteService {
    
    private ClienteDAO dao;

    public ClienteService() {
        this.dao = new ClienteDAO();
    }

    public void crearCliente(int idCliente, String nombre, String calle, 
            int numero, String codigoPostal, String ciudad, String pais, 
            String email) throws Exception {

        try {
            //Validamos
            if (idCliente <= 0) {
                throw new Exception("Debe indicar el id de Cliente");
            }

            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre de cliente");
            }

            if (calle == null || calle.trim().isEmpty()) {
                throw new Exception("Debe indicar el calle del cliente");
            }

            if (numero <= 0) {
                throw new Exception("Debe indicar el numero");
            }

            if (codigoPostal == null || codigoPostal.trim().isEmpty()) {
                throw new Exception("Debe indicar el codigoPostal");
            }
            if (ciudad == null || ciudad.trim().isEmpty()) {
                throw new Exception("Debe indicar la ciudad");
            }
            if (pais == null || pais.trim().isEmpty()) {
                throw new Exception("Debe indicar el pais");
            }
            if (email == null || email.trim().isEmpty()) {
                throw new Exception("Debe indicar el email");
            }
            //Creamos la cliente
            Cliente cliente = new Cliente();
            cliente.setIdCliente(idCliente);
            cliente.setNombre(nombre);
            cliente.setCalle(calle);
            cliente.setNumero(numero);
            cliente.setCodigoPostal(codigoPostal);
            cliente.setCiudad(ciudad);
            cliente.setPais(pais);
            cliente.setEmail(email);
            dao.crearCliente(cliente);

        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarCliente(int id, Cliente cliente2) throws Exception {

        try {

            //Validamos
            if (id <= 0) {
                throw new Exception("Debe ingresar un id valido");
            }

            //Buscamos
            Cliente cliente = buscarClientePorCodigo(id);

            dao.modificarCliente(cliente, cliente2);
        } catch (Exception e) {
            throw e;
        }
    }

    public Cliente buscarClientePorCodigo(int id) throws Exception {

        try {

            //Validamos
            if (id <= 0) {
                throw new Exception("Debe ingresar un id valido");
            }
            Cliente cliente = dao.buscarClientePorId(id);
            //Verificamos
            if (cliente == null) {
                throw new Exception("No se econtró el cliente indicado");
            }

            return cliente;
        } catch (Exception e) {
            throw e;
        }
    }

    public ArrayList<Cliente> listarClientes() throws Exception {

        try {

            ArrayList<Cliente> clientes = dao.listarClientes();

            return clientes;
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirClientes(int opc) throws Exception {

        try {

            //Listamos los clientes
            ArrayList<Cliente> clientes = listarClientes();

            //Imprimimos los clientes
            if (clientes.isEmpty()) {
                throw new Exception("No existen clientes para imprimir");
            } else {
                if (opc == 1) {
                    for (Cliente p : clientes) {
                        System.out.println(p);
                    }
                }
                /*if (opc == 2) {
                    for (Cliente p : clientes) {
                        System.out.println(p.getCodigo() + " - " + p.getNombre().toString());
                    }
                }
                if (opc == 3) {
                    for (Cliente p : clientes) {
                        System.out.println(p.getCodigo() + " - " + "Nombre: " + p.getNombre() + " - Precio: "
                                + p.getPrecio());
                    }
                }
                if (opc == 4) {
                    for (Cliente p : clientes) {
                        if (p.getNombre().toLowerCase().contains("portátil")) {
                            System.out.println("Nombre: " + p.getNombre() + " - Precio: "
                                    + p.getPrecio());
                        }
                    }
                }
                if (opc == 5) {
                    System.out.println(dao.buscarClienteMasBarato());
                }*/
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarCliente(int id) throws Exception {

        try {

            //Validamos 
            if (id <= 0) {
                throw new Exception("Debe indicar el id del cliente");
            }
            dao.eliminarCliente(id);
        } catch (Exception e) {
            throw e;
        }
    }
    
}
