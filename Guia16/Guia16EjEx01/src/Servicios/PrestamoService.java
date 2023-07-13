package Servicios;

import Entidades.Cliente;
import Entidades.Libro;
import Entidades.Prestamo;
import Persistencia.PrestamoDAO;
import java.time.LocalDate;
import java.util.Scanner;

public class PrestamoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    PrestamoDAO dao = new PrestamoDAO();
    LibroService ls = new LibroService();
    ClienteService cs = new ClienteService();

    public Prestamo RegistrarPrestamo() {
        Prestamo prestamo = new Prestamo();
        try {
            System.out.println("Ingrese su documento para continuar:");
            Long dni = leer.nextLong();
            Cliente cliente = cs.buscarClientePorDNI(dni);
            System.out.println(cliente.toString());           
            if (cliente != null) {
                System.out.println("Usted es cliente, puede continuar");
            } else {
                System.out.println("Usted no es cliente. ¿Desea registrarse? (y/n)");
                String resp = leer.next().toLowerCase();
                if (resp.equals("y")) {
                    System.out.println("Ingrese su DNI:");
                    Long documento = leer.nextLong();
                    System.out.println("Ingrese su nombre:");
                    String nombre = leer.next();
                    System.out.println("Ingrese su apellido:");
                    String apellido = leer.next();
                    System.out.println("Ingrese su teléfono:");
                    String telefono = leer.next();
                    cliente = cs.crearCliente(documento, nombre, apellido, telefono);
                } else {
                    return null;
                }
            }

            System.out.println("Ingrese el nombre del libro que desea llevar:");
            String nombreLibro = leer.next();
            Libro libro = ls.buscarLibroPorNombre(nombreLibro);
            if (libro.getEjemplaresRestantes() > 0 || libro == null) {
                libro.setEjemplarePrestados(libro.getEjemplarePrestados() + 1);
                libro.setEjemplaresRestantes(libro.getEjemplaresRestantes() - 1);
                dao.crearPrestamo(prestamo);
                prestamo.setCliente(cliente);
                System.out.println("Libro prestado con exito.");
                LocalDate fechaInicial = prestamo.getFechaPrestamo();
                prestamo.setFechaPrestamo(fechaInicial);
                prestamo.setFechaDevolucion(fechaInicial.plusDays(7));
//                fechaActual.plusWeeks(1);
                LocalDate fechaDevolucion = prestamo.getFechaDevolucion(fechaInicial);
                System.out.println("Deberá devolverlo en la siguiente fecha: " + fechaDevolucion);
            } else {
                System.out.println("No hay ejemplares con ese nombre.");
            }
            return prestamo;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Prestamo buscarPrestamoPorNombre(String nombre) {
        try {
            return dao.buscarPrestamo(nombre);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void darDeBaja(String nombre) {
        Prestamo prestamo = buscarPrestamoPorNombre(nombre);
        prestamo.setAlta(false);
        dao.editarAlta(prestamo);
    }

    public void darDeAlta(String nombre) {
        Prestamo prestamo = buscarPrestamoPorNombre(nombre);
        prestamo.setAlta(true);
        dao.editarAlta(prestamo);
    }

}