/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.Autor;
import Entities.Editorial;
import Entities.Libro;
import HacksDPackage.Servicios;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author dudum
 */
public class LibreriaService {
    
    Servicios serv = new Servicios();
    AutorService aus = new AutorService();
    EditorialService eds = new EditorialService();
    
    
    public void crearLibro() {
        
        System.out.println("");
        System.out.println("INGRESO DE LIBRO");
        System.out.println("----------------");
        System.out.print("isbn: ");
        long isbn = (long)serv.generarDni();
        System.out.println(isbn);
        serv.wait(300);
        System.out.print("Titulo: ");
        String titulo = serv.titulos();
        System.out.println(titulo);
        serv.wait(300);
        System.out.print("Año: ");
        int anio = serv.anio(1600, 2020);
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
        int ejemplaresRestantes = ejemplares-ejemplaresPrestados;
        System.out.println(ejemplaresRestantes);
        serv.wait(300);
        Autor au= aus.crearAutor();
        Editorial edit = eds.crearEditorial();
        boolean alta= true;
        
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("libroPU");
        EntityManager em = emf.createEntityManager();
        
        Libro lib = new Libro(isbn, titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes, alta, au, edit);
        
        
        em.getTransaction().begin();
        em.persist(lib);
        em.getTransaction().commit();
        em.close();
        
        
       
    }

   
    
    
    
}
