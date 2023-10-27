package com.news.servicios;

import com.news.entidades.Autor;
import com.news.entidades.Seccion;
import com.news.entidades.Noticia;
import com.news.repositorios.AutorRepositorio;
import com.news.repositorios.SeccionRepositorio;
import com.news.repositorios.NoticiaRepositorio;
import excepciones.MiException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticiaServicio {

    @Autowired
    private NoticiaRepositorio noticiaRepositorio;
    @Autowired
    private AutorRepositorio autorRepositorio;
    @Autowired
    private SeccionRepositorio seccionRepositorio;

   @Transactional
    public void crearNoticia(Long id, String titulo, String descripcion, String idAutor, String idSeccion) throws MiException{
        
        validar(id, titulo, descripcion, idAutor, idSeccion);
        
        
        Optional<Autor> respuestaAutor = autorRepositorio.findById(idAutor);
        Optional<Seccion> respuestaSeccion = seccionRepositorio.findById(idSeccion);
        
        Autor autor = new Autor();
        Seccion seccion= new Seccion();
        
        if(respuestaAutor.isPresent()){
            
            autor = respuestaAutor.get();
        }
        
        if(respuestaSeccion.isPresent()){
            
            seccion = respuestaSeccion.get();
        }
      
        Noticia noticia = new Noticia();
        
        noticia.setId(id);
        noticia.setTitulo(titulo);
        noticia.setDescripcion(descripcion);
        noticia.setPublicacion(new Date());
        noticia.setAutor(autor);
        noticia.setSeccion(seccion);
//
//        Imagen imagen = imagenServicio.guardar(archivo);
//
//        noticia.setImagen(imagen);
        
        noticiaRepositorio.save(noticia);
    }

    public List<Noticia> listarNoticias() {
        List<Noticia> noticias = new ArrayList<>();
        noticias = noticiaRepositorio.findAll();
        return noticias;
    }
    @Transactional
    public void modificarNoticia(Long id, String titulo, String descripcion, String idAutor, String idSeccion) throws MiException {

        validar(id, titulo, descripcion, idAutor, idSeccion);

        Optional<Noticia> respuestaNoticia = noticiaRepositorio.findById(id);
        Optional<Autor> respuestaAutor = autorRepositorio.findById(idAutor);
        Optional<Seccion> respuestaSeccion = seccionRepositorio.findById(idSeccion);

        Autor autor = new Autor();
        Seccion seccion = new Seccion();

        if (respuestaAutor.isPresent()) {
            autor = respuestaAutor.get();
        }

        if (respuestaSeccion.isPresent()) {
            seccion = respuestaSeccion.get();
        }

        if (respuestaNoticia.isPresent()) {
            Noticia noticia = respuestaNoticia.get();
            noticia.setTitulo(titulo);
            noticia.setAutor(autor);
            noticia.setSeccion(seccion);

            noticiaRepositorio.save(noticia);
        }

    }
    @Transactional
    public Noticia getOne(Long id) {///TODO averigua que hace este metodo
        return noticiaRepositorio.getOne(id);
    }

    private void validar(Long id, String titulo, String descripcion, String idAutor, String idSeccion) throws MiException {

        if (id == null) {
            throw new MiException("id no puede estar vacio");
        }
        if (titulo.isEmpty() || titulo == null) {
            throw new MiException("titulo no puede ser nulo ni estar vacio");
        }
        if (descripcion == null) {
            throw new MiException("descripcion no puede ser nulo");
        }
        if (idAutor.isEmpty() || idAutor == null) {
            throw new MiException("Autor no puede ser nulo ni estar vacio");
        }
        if (idSeccion.isEmpty() || idSeccion == null) {
            throw new MiException("Seccion no puede ser nulo ni estar vacia");
        }

    }



    private void validar(Long idNoticia) throws MiException {

        if (idNoticia == null) {
            throw new MiException("id no puede estar vacio");
        }
    }
}
