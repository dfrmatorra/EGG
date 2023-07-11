/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistance;

import Entities.Editorial;

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

}
