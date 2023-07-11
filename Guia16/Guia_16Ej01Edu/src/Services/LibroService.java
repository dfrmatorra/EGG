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

    public void crearLibro() {

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
        Autor au = aus.crearAutor();
        Editorial edit = eds.crearEditorial();
        boolean alta = true;

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("libroPU");
        EntityManager em = emf.createEntityManager();

        Libro lib = new Libro(isbn, titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes, alta, au, edit);

        em.getTransaction().begin();
        em.persist(lib);
        em.getTransaction().commit();
        em.close();

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

}
