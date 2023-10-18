package com.news.repositorios;

import com.news.entidades.Noticia;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticiaRepositorio extends JpaRepository<Noticia, Long>{
    
    @Query("SELECT l FROM Libro l WHERE l.titulo = :titulo")
    public Noticia buscraPorTitulo(@Param("titulo") String titulo);
            
    @Query("SELECT l FROM Libro l WHERE l.autor.nombre = :nombre")
    public List<Noticia> buscarPorNoticia(@Param ("nombre") String nombre);
    
}
