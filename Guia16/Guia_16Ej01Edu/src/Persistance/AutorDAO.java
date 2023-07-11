/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistance;

import Entities.Autor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dudum
 */
public class AutorDAO extends DAO<Autor> {

    @Override
    public void eliminar(Autor objeto) {
        super.eliminar(objeto);
    }

    @Override
    public void editar(Autor objeto) {
        super.editar(objeto);
    }

    public void buscarXNombre(String nombre) {

        conectar();


        List <Autor> au = em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre").setParameter("nombre", "%" + nombre + "%").getResultList();
                   

        if (au != null) {
            for (Autor autor : au) {
                System.out.println(autor.toString());
            }
        } else {
            System.out.println("No se encontro autor con ese nombre");
        }
        desconectar();
        

    }

    @Override
    public void guardar(Autor objeto) {
        super.guardar(objeto);
    }

    public Autor buscarPorId(Integer id) {
        conectar();

        Autor edit = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.id= :id")
                .setParameter("id", id).getSingleResult();
        desconectar();
        return edit;
    }

}
