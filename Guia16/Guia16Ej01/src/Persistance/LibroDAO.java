/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistance;

import Entities.Libro;
import java.util.ArrayList;
import java.util.List;

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

        if (libro != null) {
            System.out.println(libro);
        } else {
            System.out.println("No se encontro el ISBN");
        }
        desconectar();

    }

    public void buscarPorTitulo(String titulo) {
        conectar();

        List<Libro> lib = em.createQuery("SELECT lib FROM Libro lib WHERE lib.titulo LIKE :titulo")
                .setParameter("titulo", "%" + titulo + "%")
                .getResultList();

        if (lib != null) {
            for (Libro libro : lib) {
                System.out.println(libro);
            }
        } else {
            System.out.println("No se encontró ningún libro con ese título");
        }

        desconectar();
    }

    public void buscarPorAutor(String nombre) {
        conectar();

        List<Libro> lib = em.createQuery("SELECT l FROM Libro l WHERE l.autor.nombre LIKE :nombreAutor")
                .setParameter("nombreAutor", "%" + nombre + "%")
                .getResultList();

        if (lib != null) {
            for (Libro libro : lib) {
                System.out.println(libro.toString());
            }
        } else {
            System.out.println("No se encontró ningún libro con ese título");
        }

        desconectar();
    }

    public void buscarPorEditorial(String nombre) {
        conectar();

        List<Libro> lib = em.createQuery("SELECT l FROM Libro l WHERE l.editorial.nombre LIKE :nombreEditorial")
                .setParameter("nombreEditorial", "%" + nombre + "%")
                .getResultList();

        if (lib != null) {
            for (Libro libro : lib) {
                System.out.println(libro.toString());
            }
        } else {
            System.out.println("No se encontró ningún libro con ese título");
        }

        desconectar();
    }

    public boolean verificarPorISBN(long isbn) {
        conectar();
        boolean verificar = false;
        try {
            Libro libro = (Libro) em.createQuery("SELECT lib FROM Libro lib WHERE lib.isbn = :isbn")
                    .setParameter("isbn", isbn).getSingleResult();
        } catch (Exception e) {
            verificar = true;
        }
        if (verificar == false) {
            System.out.println("El libro ya existe");
        }
        desconectar();
        return verificar;
    }

}
