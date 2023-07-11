/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistance;

import Entities.Libro;

/**
 *
 * @author dudum
 */
public class LibroDAO extends DAO<Libro> {

    @Override
    public void eliminar(Libro objeto) {
        super.eliminar(objeto);
    }

    @Override
    public void editar(Libro objeto) {
        super.editar(objeto);
    }

    @Override
    public void guardar(Libro objeto) {
        super.guardar(objeto);
    }

    public Libro buscarPorId(long id) {
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT lib FROM Libro lib WHERE lib.id = :id")
                .setParameter("id", id).getSingleResult();
        desconectar();
        return libro;
    }

    public void buscarPorISBN(long isbn) {
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT lib FROM Libro lib WHERE lib.isbn = :isbn")
                .setParameter("isbn", isbn).getSingleResult();
        
        if(libro!=null){
            System.out.println(libro);
        }else{
            System.out.println("No se encontro el ISBN");
        }
        desconectar();
        
        
    }

}
