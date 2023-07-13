/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistance;

import Entities.Autor;
import Entities.Editorial;
import java.util.List;
import javax.persistence.NoResultException;

/**
 *
 * @author dudum
 */
public class EditorialDAO extends DAO<Editorial> {

    @Override
    public void eliminar(Editorial objeto) {
        super.eliminar(objeto);
    }

    @Override
    public void editar(Editorial objeto) {
        super.editar(objeto);
    }

    @Override
    public void guardar(Editorial objeto) {
        super.guardar(objeto);
    }

    public Editorial buscarPorId(Integer id) {
        conectar();

        Editorial edit = (Editorial) em.createQuery("SELECT a FROM Editorial a WHERE a.id= :id")
                .setParameter("id", id).getSingleResult();
        desconectar();
        return edit;
    }

    public Editorial existeEditorial(String nombre) {
    conectar();
    Editorial edi = null;
    try {
        List<Editorial> resultados = em.createQuery("SELECT edi FROM Editorial edi WHERE edi.nombre LIKE :nombre", Editorial.class)
                .setParameter("nombre", "%" + nombre + "%")
                .getResultList();

        if (!resultados.isEmpty()) {
            edi = resultados.get(0);
        }
    } catch (NoResultException e) {
        System.out.println("No se encuentra esta editorial en la libreria");
        return null;
    }

    desconectar();
    return edi;
}
//        conectar();
//        Editorial edi = new Editorial();
//        try {
//        edi = em.createQuery("SELECT edi FROM Editorial edi WHERE edi.nombre LIKE :nombre", Editorial.class)
//                .setParameter("nombre", "%" + nombre + "%")
//                .getSingleResult();
//        } catch (NoResultException e) {
//            System.out.println("No se encuentra este autor en la libreria");
//        }
//
//        boolean existe = false;
//        if (edi != null) {
//            existe = true;
//        } else {
//            existe = false;
//        }
//        desconectar();
//        return existe;
//    }

}
