package Servicios;

import Entidades.Editorial;
import Persistencia.EditorialDAO;
import java.util.Scanner;

public class EditorialService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    EditorialDAO dao = new EditorialDAO();

    public Editorial crearEditorial(String nombre) {
        Editorial editorial = new Editorial();
        try {
            editorial.setNombre(nombre);
            dao.crearEditorial(editorial);
            System.out.println("Guardado con exito.");
            return editorial;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Editorial buscarEditorialPorNombre(String nombre) {
        try {
            return dao.buscarEditorial(nombre);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
     public void darDeBaja(String nombre){
        Editorial editorial = buscarEditorialPorNombre(nombre);
        editorial.setAlta(false);
        
    }    
    
    public void darDeAlta(String nombre){
        Editorial editorial = dao.buscarEditorial(nombre);
        editorial.setAlta(true);
        dao.editarAlta(editorial);
    } 
}