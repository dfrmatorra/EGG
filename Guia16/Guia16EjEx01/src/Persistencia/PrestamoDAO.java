package Persistencia;

import static Entidades.Autor_.nombre;
import Entidades.Prestamo;
import java.util.List;

public class PrestamoDAO extends DAO<Prestamo> {

    public void crearPrestamo(Prestamo prestamo) {
        guardar(prestamo);
    }

//    public List<Prestamo> buscarPrestamo(Integer documento) {
//        conectar();
//        try{
//           List<Prestamo> prestamos = em.createQuery("SELECT e FROM Prestamo e WHERE e.cliente_id.documento LIKE :documento ")
//             .setParameter("documento", documento)
//             .getResultList();
//        desconectar();
//        return prestamos; 
//        }catch(Exception e){
//            e.getMessage();
//            System.out.println("Error al buscar prestamo en el PrestamoDAO");
//            return null;
//        }
//        
//    }
    
    public List<Prestamo> buscarPrestamo(Integer documento) {
    conectar();
    try {
        List<Prestamo> prestamos = em.createQuery("SELECT e FROM Prestamo e WHERE e.cliente.documento = :documento ")
                .setParameter("documento", documento)
                .getResultList();
        desconectar();
        return prestamos; 
    } catch(Exception e) {
        e.printStackTrace(); // Imprimir traza de excepción para facilitar la depuración
        throw new RuntimeException("Error al buscar préstamo en el PrestamoDAO", e); // Lanzar excepción personalizada
    }
}

    public Prestamo buscarPrestamoPorNombre(String nombre) {
        conectar();
        Prestamo prestamo = (Prestamo)em.createQuery("SELECT e FROM Prestamo e WHERE e.cliente.nombre LIKE :nombre ").setParameter("nombre", nombre).getSingleResult();
        desconectar();
        return prestamo;
    }

    public void editarAlta(Prestamo prestamo) {
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
