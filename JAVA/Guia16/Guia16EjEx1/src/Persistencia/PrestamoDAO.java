/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;


import Entidades.Prestamo;

/**
 *
 * @author meluf
 */
public class PrestamoDAO extends DAO <Prestamo>{
   
    
    
     public void crearPrestamo(Prestamo prestamo){
    guardar(prestamo); 
    }
    
    public Prestamo buscarPrestamo(String nombre){
        conectar();
        Prestamo prestamo  = (Prestamo) em.createQuery("SELECT e FROM Prestamo e WHERE e.nombre LIKE :nombre ").setParameter("nombre", nombre).getSingleResult();
        desconectar();
       return prestamo;
    }
    
     public void editarAlta(Prestamo prestamo){       
        editar(prestamo);       
    }

    @Override
    protected void eliminar(Prestamo objeto) {
        super.eliminar(objeto); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected void editar(Prestamo objeto) {
        super.editar(objeto); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected void guardar(Prestamo objeto) {
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
