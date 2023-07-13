/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistance;

import Entities.Autor;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.NoResultException;

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

        List<Autor> au = em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre").setParameter("nombre", "%" + nombre + "%").getResultList();

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

    public Autor existeAutor(String nombre) {
        conectar();

        Autor au = null;
        try {
            List<Autor> resultados = em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre", Autor.class)
                    .setParameter("nombre", "%" + nombre + "%")
                    .getResultList();

            if (!resultados.isEmpty()) {
                au = resultados.get(0);
            }
        } catch (NoResultException e) {
            System.out.println("No se encuentra este autor en la libreria");
            return null;
        }
        desconectar();
        return au;
    }
//    try {
//        au = em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre", Autor.class)
//                .setParameter("nombre", "%" + nombre + "%")
//                .getSingleResult();
//    } catch (NoResultException e) {
//        System.out.println("No se encuentra este autor en la libreria");
//    }
//    
//    boolean existe = (au != null);
//    
//    desconectar();
//    return existe;
//        conectar();
//        
//        Autor au = new Autor ();
//        try{
//            
//        au = (Autor)em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre", Autor.class).setParameter("nombre", "%" + nombre + "%");
//
//        }catch(Exception e){
//            System.out.println("No se encuentra autor por algun problema");
//        }
//        
//        boolean existe = false;
//        if (au != null) {
//            existe = true;
//        }else {
//            existe = false;
//    }
//    desconectar();
//    return existe ;
//}

}
