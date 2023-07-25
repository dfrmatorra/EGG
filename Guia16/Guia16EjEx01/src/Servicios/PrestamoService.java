package Servicios;

import Entidades.Cliente;
import Entidades.Libro;
import Entidades.Prestamo;
import Persistencia.LibroDAO;
import Persistencia.PrestamoDAO;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class PrestamoService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    PrestamoDAO prestDAO = new PrestamoDAO();
    LibroDAO libDAO = new LibroDAO();
    LibroService ls = new LibroService();
    ClienteService cs = new ClienteService();

    public Prestamo registrarPrestamo() {
        Prestamo prestamo = new Prestamo();
        try {
            System.out.println("Ingrese su documento para continuar:");
            Long dni = leer.nextLong();
            Cliente cliente = cs.buscarClientePorDNI(dni);
            System.out.println(cliente);
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
            if (libro == null) {
                System.out.println("No hay ejemplares con ese nombre.");

            } else if (libro.getEjemplaresRestantes() > 0) {
                libro.setEjemplarePrestados(libro.getEjemplarePrestados() + 1);
                libro.setEjemplaresRestantes(libro.getEjemplaresRestantes() - 1);
                libDAO.editarAlta(libro);
                //completo todos los atributos del Prestamo
                prestamo.setCliente(cliente);
                prestamo.setLibro(libro);
                LocalDate fechaInicial = LocalDate.now();
                prestamo.setFechaPrestamo(fechaInicial);
                LocalDate fechaDevolucion = fechaInicial.plusDays(7);
                prestamo.setFechaDevolucion(fechaDevolucion);
                //persisto todos los atributos de prestamo
                prestDAO.crearPrestamo(prestamo);
                System.out.println("Deberá devolverlo en la siguiente fecha: " + fechaDevolucion);
                System.out.println("Libro prestado con exito.");
            } else {
                System.out.println("Estan todos prestados");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return prestamo;
    }

    public List<Prestamo> buscarPrestamoPorDocumento(Integer documento) {
        try {
            List<Prestamo> prestamos = prestDAO.buscarPrestamo(documento);
            return prestamos;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Error al buscar prestamo por documento en el service");
            return null;
        }
    }

    public void darDeBaja(String nombre) {
        Prestamo prestamo = buscarPrestamoPorNombre(nombre);
        prestamo.setAlta(false);
        prestDAO.editarAlta(prestamo);
    }

    public void darDeAlta(String nombre) {
        Prestamo prestamo = buscarPrestamoPorNombre(nombre);
        prestamo.setAlta(true);
        prestDAO.editarAlta(prestamo);
    }

    public void devolverLibro() {
        Prestamo prestamoDevuelto = new Prestamo();
        System.out.println("Ingrese el dni del cliente que quiere devolver el libro");
        Integer doc = leer.nextInt();
        List<Prestamo> prestamosCliente = buscarPrestamoPorDocumento(doc);
        //muestro prestamos adeudados
        System.out.println("Libros que tiene prestado: ");
        for (Prestamo prestamo : prestamosCliente) {
            if (prestamo.getAlta()) {
                System.out.println(prestamo);
            }
        }
        //pregunto cual quiere devolver
        System.out.println("Indique el id del libro que quiere devolver");
        Long idLibroPrestamo = leer.nextLong();

        for (Prestamo prestamo : prestamosCliente) {
            if (prestamo.getAlta()!= false && prestamo.getLibro().getId() == idLibroPrestamo) {
                prestamoDevuelto = prestamo;
            }
            }
        prestamoDevuelto.setAlta(false);
        prestamoDevuelto.setFechaDevolucion(LocalDate.now());
        prestDAO.editarAlta(prestamoDevuelto);
        System.out.println("Se ha devuelto el libro " + prestamoDevuelto.getLibro().getTitulo() + " exitosamente" );

    }

    private Prestamo buscarPrestamoPorNombre(String nombre) {
        try {
            Prestamo prestamo = prestDAO.buscarPrestamoPorNombre(nombre);
            return prestamo;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }}

}
