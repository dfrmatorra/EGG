package Libreria.persistencia;

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
    
    
    public void crearLibro(Libro lib, Object ex){
        try{
            ljpa.create(lib);
        }catch (Exception es){
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
