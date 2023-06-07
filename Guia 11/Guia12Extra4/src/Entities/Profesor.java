package Entities;

/**
 *
 * @author CASA
 */
public class Profesor extends Persona{
    
    protected String departamento;

    public Profesor() {
    }

    public Profesor(String departamento, String nombre, String apellido, int dni, String estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Profesor{" + "departamento=" + departamento + '}';
    }

    @Override
    public void cambioEstadoCivil() {
        super.cambioEstadoCivil(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    public void cambioDeDepartamento (){
        
    }
    
}
