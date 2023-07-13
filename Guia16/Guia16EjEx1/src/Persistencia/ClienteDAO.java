/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;


import Entidades.Cliente;

/**
 *
 * @author meluf
 */
public class ClienteDAO extends DAO <Cliente> {

    public ClienteDAO() {
        conectar(); 
    }
    
    
    
    
    public void crearCliente(Cliente cliente){
    conectar();    
    guardar(cliente);
    desconectar();
    }
    
    
    
    public Cliente buscarCliente(String nombre){
        conectar();
        Cliente cliente  = (Cliente) em.createQuery("SELECT e FROM Cliente e WHERE e.nombre LIKE :nombre ").setParameter("nombre", nombre).getSingleResult();
        desconectar();
       return cliente;
    }
    
    public Cliente buscarClientePorDNI(Long documento){        
     
            conectar();
            Cliente cliente  = (Cliente) em.createQuery("SELECT e FROM Cliente e WHERE e.documento = :documento ")
                .setParameter("documento", documento).getSingleResult();
        desconectar();        
       return cliente;
   
        }
    
     public void editarAlta(Cliente cliente){       
        editar(cliente);       
    }

    @Override
    protected void eliminar(Cliente objeto) {
        super.eliminar(objeto); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected void editar(Cliente objeto) {
        super.editar(objeto); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected void guardar(Cliente objeto) {
        super.guardar(objeto); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected void desconectar() {
        super.desconectar(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void conectar() {
        super.conectar(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
     
     
     
}
