package Persistencia;

import Entidades.Editorial;

public class EditorialDAO extends DAO <Editorial> {
    
   public void crearEditorial(Editorial editorial){
    guardar(editorial); 
    }
    
    public Editorial buscarEditorial(String nombre){
        conectar();
        Editorial editorial  = (Editorial) em.createQuery("SELECT e FROM Editorial e WHERE e.nombre LIKE :nombre ").setParameter("nombre", nombre).getSingleResult();
        desconectar();
       return editorial;
    }
    
     public void editarAlta(Editorial editorial){       
        editar(editorial);       
    }

    @Override
    protected void eliminar(Editorial objeto) {
        super.eliminar(objeto); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected void editar(Editorial objeto) {
        super.editar(objeto); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected void guardar(Editorial objeto) {
        super.guardar(objeto); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected void desconectar() {
        super.desconectar(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected void conectar() {
        super.conectar(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
               
}