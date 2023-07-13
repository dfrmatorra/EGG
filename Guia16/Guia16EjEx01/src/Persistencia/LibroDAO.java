package Persistencia;

import Entidades.Libro;
import java.util.List;

public class LibroDAO extends DAO<Libro> {

    public void crearLibro(Libro libro) {
        guardar(libro);
    }

    public Libro buscarLibroPorNombre(String nombre) {
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.nombre LIKE :nombre and l.alta=1").setParameter("nombre", nombre).getSingleResult();
        desconectar();
        return libro;
    }

    public void editarAlta(Libro libro) {
        editar(libro);
    }

    public Libro buscarLibroPorISBN(Long isbn) {
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.isbn LIKE :isbn and l.alta=1").setParameter("isbn", isbn).getSingleResult();
        desconectar();
        return libro;
    }

    public List<Libro> buscarLibroPorNombreAutor(String nombre) {
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l where l.autor.nombre LIKE :nombre and l.autor.alta=1").setParameter("nombre", nombre).getResultList();
        desconectar();
        return libros;
    }

    @Override
    protected void eliminar(Libro objeto) {
        super.eliminar(objeto); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected void editar(Libro objeto) {
        super.editar(objeto); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected void guardar(Libro objeto) {
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