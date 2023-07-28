package Servicios;

import Entidades.Cliente;
import Persistencia.ClienteDAO;
import java.util.Scanner;

public class ClienteService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ClienteDAO dao = new ClienteDAO();

    
    
    public Cliente crearCliente(Long documento, String nombre, String apellido, String telefono) {
        
        try {
//            
            Cliente cliente = new Cliente();           
            cliente.setNombre(nombre);
            cliente.setApellido(apellido);
            cliente.setDocumento(documento);
            cliente.setTelefono(telefono);
            dao.crearCliente(cliente);
            System.out.println("Guardado con exito.");
            return cliente;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Cliente buscarClientePorNombre(String nombre) {
        try {
            return dao.buscarCliente(nombre);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public Cliente buscarClientePorDNI(Long documento) {
        Cliente clientePorDNI = new Cliente();
        try {
            clientePorDNI = dao.buscarClientePorDNI(documento);
            return clientePorDNI;
        } catch (Exception e) {
            System.out.println("Error. No se encontro el cliente por DNI");
            return null;
        }
    }
    public void darDeBaja(String nombre){
        Cliente cliente = buscarClientePorNombre(nombre);
        cliente.setAlta(false);
        dao.editarAlta(cliente);
    }    
    
    public void darDeAlta(String nombre){
        Cliente cliente = buscarClientePorNombre(nombre);
        cliente.setAlta(true);
        dao.editarAlta(cliente);
    } 
    
}