package Persistencia;

import Entidades.Autor;

public class AutorDAO extends DAO <Autor>{
    
   
    
    public void crearAutor(Autor autor){
    guardar(autor); 
    }
    
    public Autor buscarAutor(String nombre){
        conectar();
        Autor autor  = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre ").setParameter("nombre", "%" +nombre + "%").getSingleResult();
        desconectar();
       return autor;
    }
    
    public void editarAlta(Autor autor){       
        editar(autor);       
    }

    @Override
    protected void eliminar(Autor objeto) {
        super.eliminar(objeto); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected void editar(Autor objeto) {
        super.editar(objeto); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected void guardar(Autor objeto) {
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
