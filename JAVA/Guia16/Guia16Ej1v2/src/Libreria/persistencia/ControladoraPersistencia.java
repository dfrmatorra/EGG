package Libreria.persistencia;

import Libreria.entidades.Autor;
import Libreria.entidades.Editorial;
import Libreria.entidades.Libro;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CASA
 */
public class ControladoraPersistencia {
    
    LibroJpaController ljpa = new LibroJpaController ();
    
    EditorialJpaController ejpa = new EditorialJpaController ();
    
    AutorJpaController ajpa = new AutorJpaController ();
    
    
    public void crearLibro(Libro lib){
        
        try {
            ljpa.create(lib);

        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
        public void crearAutor(Autor autor){
        try{
            ajpa.create(autor);
        }catch (Exception ex){
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
        
            public void crearEditorial(Editorial edi){
        try{
            ejpa.create(edi);
        }catch (Exception ex){
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
