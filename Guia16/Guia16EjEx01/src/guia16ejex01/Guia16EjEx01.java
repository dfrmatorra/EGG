package guia16ejex01;

import Entidades.Autor;
import Entidades.Cliente;
import Entidades.Editorial;
import Persistencia.ClienteDAO;
import Servicios.AutorService;
import Servicios.ClienteService;
import Servicios.EditorialService;
import Servicios.LibroService;
import Servicios.PrestamoService;

/**
 *
 * @author CASA
 */
public class Guia16EjEx01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        AutorService as = new AutorService();
        EditorialService es = new EditorialService();
        LibroService ls = new LibroService();
        ClienteService cs = new ClienteService();
        PrestamoService ps = new PrestamoService();

        ClienteDAO cDao = new ClienteDAO();
        Autor autor1 = as.crearAutor("J.R.R. Tolkien");
        Autor autor2 = as.crearAutor("J.K. Rowling");
        Autor autor3 = as.crearAutor("George R.R. Martin");
        Autor autor4 = as.crearAutor("Patrick Rothfuss");
        Autor autor5 = as.crearAutor("C.S. Lewis");
        Autor autor6 = as.crearAutor("Brandon Sanderson");
        Autor autor7 = as.crearAutor("Neil Gaiman");
        Autor autor8 = as.crearAutor("Margaret Weis y Tracy Hickman");
        

        Editorial editorial1 = es.crearEditorial("Minotauro");
        Editorial editorial2 = es.crearEditorial("Salamandra");
        Editorial editorial3 = es.crearEditorial("Gigamesh");
        Editorial editorial4 = es.crearEditorial("Plaza & Janes");
        Editorial editorial5 = es.crearEditorial("Destino");
        Editorial editorial6 = es.crearEditorial("Ediciones B");
        Editorial editorial7 = es.crearEditorial("Roca Editorial");
        Editorial editorial8 = es.crearEditorial("Timun Mas");

         ls.crearLibro(9788499082475L, "El Señor de los Anillos", 1954, 500, 100, 400, autor1, editorial1);
         ls.crearLibro(9788478884957L, "Harry Potter y la Piedra Filosofal", 1997, 1000, 200, 800, autor2, editorial2);
         ls.crearLibro(9788496208690L, "Canción de Hielo y Fuego", 1996, 800, 150, 650, autor3, editorial3);
         ls.crearLibro(9788401352836L, "El nombre del viento", 2007, 600, 50, 550, autor4, editorial4);
         ls.crearLibro(9788408062783L, "Las Crónicas de Narnia", 1950, 700, 100, 600, autor5, editorial5);
         ls.crearLibro(9788466657500L, "Elantris", 2005, 400, 80, 320, autor6, editorial6);
         ls.crearLibro(9788496208691L, "Tormenta de Espadas", 2000, 900, 200, 700, autor3, editorial3);
         ls.crearLibro(9788499895566L, "American Gods", 2001, 500, 70, 430, autor7, editorial7);
         ls.crearLibro(9788448034643L, "El Ciclo de la Puerta de la Muerte", 1984, 400, 80, 320, autor8, editorial8);
         ls.crearLibro(9788498387087L, "Animales Fantásticos y Dónde Encontrarlos", 2001, 400, 80, 320, autor2, editorial2);
//
//
//        System.out.println(as.buscarAutorPorNombre("C.S. Lewis").toString());
//       
//        for (Libro aux : ls.buscarLibrosPorNombreAutor("George R.R. Martin")) {
//            System.out.println(aux.toString());
//        }
//        System.out.println(ls.buscarLibrosPorNombreAutor("George R.R. Martin"));
//               
//        Cliente cliente = cs.crearCliente(5184168415L, "Juan", "Aguirre", "342-15644111");
//        ps.RegistrarPrestamo();

    }
}
