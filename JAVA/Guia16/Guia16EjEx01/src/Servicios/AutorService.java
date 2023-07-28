package Servicios;

import Entidades.Autor;
import Persistencia.AutorDAO;
import java.util.Scanner;

public class AutorService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    AutorDAO dao = new AutorDAO();

    public Autor crearAutor(String nombre) {
        Autor autor = new Autor();
        try {
            autor.setNombre(nombre);
            dao.crearAutor(autor);
            System.out.println("Guardado con exito.");
            return autor;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Autor buscarAutorPorNombre(String nombre) {
        try {
            return dao.buscarAutor(nombre);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public void darDeBaja(String nombre){
        Autor autor = buscarAutorPorNombre(nombre);
        autor.setAlta(false);
        dao.editarAlta(autor);
    }    
    
    public void darDeAlta(String nombre){
        Autor autor = buscarAutorPorNombre(nombre);
        autor.setAlta(true);
        dao.editarAlta(autor);
    } 
    
    
    
}