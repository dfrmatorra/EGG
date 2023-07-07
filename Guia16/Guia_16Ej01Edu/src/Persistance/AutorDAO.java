/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistance;

import Entities.Autor;

/**
 *
 * @author dudum
 */
public class AutorDAO extends DAO<Autor>{

    @Override
    public void eliminar(Autor objeto) {
        super.eliminar(objeto); 
    }

    @Override
    public void editar(Autor objeto) {
        super.editar(objeto); 
    }

    public Autor buscarXNombre(String nombre){
        
        
        conectar();
        
        
        
        
        
        Autor au = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.nombre like :nombre").setParameter("nombre", nombre).getSingleResult();
        
        desconectar();
        return au;
    }
    
    
    
    @Override
    public void guardar(Autor objeto) {
        super.guardar(objeto); 
    }
    
    
}
