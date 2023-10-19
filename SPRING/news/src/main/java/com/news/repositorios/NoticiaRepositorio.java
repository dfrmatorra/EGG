package com.news.repositorios;

import com.news.entidades.Noticia;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticiaRepositorio extends JpaRepository<Noticia, Long>{
    
    @Query("SELECT n FROM Noticia n WHERE n.titulo = :titulo")
    public Noticia buscarPorTitulo(@Param("titulo") String titulo);


    @Query("SELECT n FROM Noticia n WHERE n.titulo LIKE %:titulo%")
    public List<Noticia> buscarPorTituloLike(@Param("titulo") String titulo);


     @Query("SELECT n FROM Noticia n WHERE n.autor.nombre = :nombre")
    public List<Noticia> buscarPorAutor(@Param ("nombre") String nombre);


    @Query("SELECT n FROM Noticia n WHERE n.seccion.nombre = :nombre")
    public List<Noticia> buscarPorSeccion(@Param ("nombre") String nombre);
    
}
