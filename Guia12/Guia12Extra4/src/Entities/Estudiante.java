package Entities;

/**
 *
 * @author CASA
 */
public class Estudiante extends Persona{
    
    protected String cursoMat;

    public Estudiante() {
    }

    public Estudiante(String cursoMat, String nombre, String apellido, int dni, String estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        this.cursoMat = cursoMat;
    }

    public String getCursoMat() {
        return cursoMat;
    }

    public void setCursoMat(String cursoMat) {
        this.cursoMat = cursoMat;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "cursoMat=" + cursoMat + '}';
    }

    @Override
    public void cambioEstadoCivil() {
        super.cambioEstadoCivil(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    public void nuevaMat (){
        
    }
    
}
