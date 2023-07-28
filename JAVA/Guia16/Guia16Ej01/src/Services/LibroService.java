/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.Autor;
import Entities.Editorial;
import Entities.Libro;
import HacksDPackage.Servicios;
import Persistance.AutorDAO;
import Persistance.EditorialDAO;
import Persistance.LibroDAO;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author dudum
 */
public class LibroService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Servicios serv = new Servicios();
    AutorService aus = new AutorService();
    EditorialService eds = new EditorialService();
    LibroDAO libDAO = new LibroDAO();
    EditorialDAO editDAO = new EditorialDAO();
    AutorDAO autDAO = new AutorDAO();

    public void menu() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opc;
        do {
            System.out.println("MENU");
            System.out.println("--------");
            System.out.println("1.- Cargar 3 libros en forma automatica ");
            System.out.println("2.- Cargar un libro en forma automatica");
            System.out.println("3.- Cargar un libro en forma manual");
            System.out.println("4.- Editar un libro");
            System.out.println("5.- Búsqueda de un Autor por nombre");
            System.out.println("6.- Búsqueda de un libro por ISBN.");
            System.out.println("7.- Búsqueda de un libro por Título.");
            System.out.println("8.- Búsqueda de un libro/s por nombre de Autor.");
            System.out.println("9.- Búsqueda de un libro/s por nombre de Editorial.");
            System.out.println("10.- Salir.");

            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        crearLibroAutomatico();
                    }
                    break;
                case 2:
                    crearLibroAutomatico();
                    break;
                case 3:
                    crearLibro();
                    break;
                case 4:
                    System.out.println("Indique el ID del libro que desea editar");
                    int id = leer.nextInt();
                    altaBajaLibroPorId(id);
                    break;
                case 5:
                    aus.buscarAutor();
                    break;
                case 6:
                    buscarPorISBN();
                    break;
                case 7:
                    buscarPorTitulo();
                    break;
                case 8:
                    buscarLibroPorAutor();
                    break;
                    case 9:
                    buscarLibroPorEditorial();
                    break;
                case 10:
                    opc = 10;
                    break;
            }
        } while (opc != 9);

    }

    public void crearLibro() {
        Libro libro = new Libro();
        System.out.println("");
        System.out.println("INGRESO DE LIBRO");
        System.out.println("----------------");
        //controlo si existe con isbn
        boolean condicion = true;
        do {
            System.out.print("Ingrese isbn: ");
            Long isbn = serv.validarLong();
            condicion = libDAO.verificarPorISBN(isbn);
            libro.setIsbn(isbn);
        } while (condicion != true);
        //si no existe sigo cargando datos
        System.out.print("Ingrese Titulo: ");
        String titulo = serv.validarString();
        libro.setTitulo(titulo);
        System.out.print("Ingrese Año: ");
        Integer anio = (Integer)serv.validarEEntero();
        libro.setAnio(anio);
        System.out.print("Ingrese Ejemplares: ");
        Integer ejemp = serv.validarEntero();
        libro.setEjemplares(ejemp);
        System.out.print("Ingrese Ejemplares Prestados: ");
        Integer ejemPres = serv.validarEntero();
        libro.setEjemplaresPrestados(ejemPres);
        int ejemplaresRestantes = libro.getEjemplares() - libro.getEjemplaresPrestados();
        libro.setEjemplaresRestantes(ejemplaresRestantes);
        System.out.println("Ejemplares restantes:" + ejemplaresRestantes);
        serv.wait(300);
        Autor au = aus.crearAutor();
        Editorial edit = eds.crearEditorial();

        System.out.println("Desea guardar el libro en la base de datos? (1-si / 2-no)");
        int opcion = serv.validarEntero();
        switch (opcion) {
            case 1:
                boolean alta = true;
                libro.setAlta(alta);
                libro.setAutor(au);
                libro.setEditorial(edit);
                autDAO.guardar(au);
                editDAO.guardar(edit);
                libDAO.guardar(libro);
                break;
            case 2:
                System.out.println("El libro no se guardo");

                break;
            default:
                throw new AssertionError();
        }

//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("libroPU");
//        EntityManager em = emf.createEntityManager();
//        
//               
//        em.getTransaction().begin();
//        em.persist(libro);
//        em.getTransaction().commit();
//        em.close();
    }

    public void crearLibroAutomatico() {

        System.out.println("");
        System.out.println("INGRESO DE LIBRO");
        System.out.println("----------------");
        System.out.print("isbn: ");
        long isbn = (long) serv.generarDni();
        System.out.println(isbn);
        serv.wait(300);
        System.out.print("Titulo: ");
        String titulo = serv.NombreLibros();
        System.out.println(titulo);
        serv.wait(300);
        System.out.print("Año: ");
        int anio = serv.ano();
        System.out.println(anio);
        serv.wait(300);
        System.out.print("Ejemplares: ");
        int ejemplares = serv.numero(10);
        System.out.println(ejemplares);
        serv.wait(300);
        System.out.print("Ejemplares Prestados: ");
        int ejemplaresPrestados = 0;
        System.out.println(ejemplaresPrestados);
        serv.wait(300);
        System.out.print("Ejemplares restantes: ");
        int ejemplaresRestantes = ejemplares - ejemplaresPrestados;
        System.out.println(ejemplaresRestantes);
        serv.wait(300);
        Autor au = aus.crearAutorAutomat();
        Editorial edit = eds.crearEditorialAutomat();
        boolean alta = true;
        Libro lib = new Libro(isbn, titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes, alta, au, edit);

        libDAO.guardar(lib);

//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("libroPU");
//        EntityManager em = emf.createEntityManager();
//        
//        Libro lib = new Libro(isbn, titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes, alta, au, edit);
//        
//        em.getTransaction().begin();
//        em.persist(lib);
//        em.getTransaction().commit();
//        em.close();
    }

    public Libro buscarPorId(int id) {

        Libro libBuscado = new Libro();
        libBuscado = libDAO.buscarPorId(id);
        return libBuscado;
    }

    public void buscarPorISBN() {
        System.out.println("Ingrese el ISBN del libro a buscar");
        Long isbn = leer.nextLong();
        libDAO.buscarPorISBN(isbn);

    }

    public void altaBajaLibroPorId(int id) {
        try {
            Libro libModificado = new Libro();
            libModificado = libDAO.buscarPorId(id);
            System.out.println("1-Alta");
            System.out.println("2-Baja");
            int opcion = leer.nextInt();
            boolean altaBaja = true;

            switch (opcion) {
                case 1:
                    altaBaja = true;

                    break;
                case 2:
                    altaBaja = false;

                    break;
                default:
                    throw new AssertionError();
            }
            libModificado.setAlta(altaBaja);

            Editorial editMod = new Editorial();
            editMod = libModificado.getEditorial();
            Integer idEdit = editMod.getId();
            editMod = editDAO.buscarPorId(idEdit);
            editMod.setAlta(altaBaja);

            Autor autMod = new Autor();
            autMod = libModificado.getAutor();
            Integer idAut = autMod.getId();
            autMod = autDAO.buscarPorId(idAut);
            autMod.setAlta(altaBaja);

            libDAO.editar(libModificado);
            editDAO.editar(editMod);
            autDAO.editar(autMod);
            System.out.println("Se ha editado el libro con Id " + id);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public void buscarPorTitulo() {
        System.out.println("Ingrese el titulo del libro a buscar");
        String titulo = leer.next();
        libDAO.buscarPorTitulo(titulo);
    }

    public void buscarLibroPorAutor() {
        System.out.println("Ingrese el nombre del autor de libro/s a buscar");
        String nombre = leer.next();

        libDAO.buscarPorAutor(nombre);
    }

    public void buscarLibroPorEditorial() {
        System.out.println("Ingrese el nombre de la editorial de libro/s a buscar");
        String nombre = leer.next();

        libDAO.buscarPorEditorial(nombre);
    }

}
