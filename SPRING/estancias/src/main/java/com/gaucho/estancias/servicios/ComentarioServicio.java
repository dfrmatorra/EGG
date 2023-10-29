package com.gaucho.estancias.servicios;

import com.gaucho.estancias.entidades.Casa;
import com.gaucho.estancias.entidades.Comentario;
import com.gaucho.estancias.repositorios.CasaRepositorio;
import com.gaucho.estancias.repositorios.ComentarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public class ComentarioServicio {

    @Autowired
    private ComentarioRepositorio comentarioRepositorio;
    @Autowired
    private CasaRepositorio casaRepositorio;
    @Transactional
    public void crearComentario (String descripcion, String idCasa) throws Exception {

        validar(descripcion, idCasa);

        Casa casa = casaRepositorio.findById(idCasa).get();

        Comentario comentario = new Comentario();

        comentario.setDescripcion(descripcion);
        comentario.setCasa(casa);

        comentarioRepositorio.save(comentario);

    }

    @Transactional
    public void modificarComentario(String id, String descripcion, String idCasa) throws Exception {

        validar(descripcion, idCasa);

        Optional<Casa> respuestaCasa = casaRepositorio.findById(idCasa);
        Optional<Comentario> respuesta = comentarioRepositorio.findById(id);

        Casa casa = new Casa();

        if (respuestaCasa.isPresent()) {
            casa = respuestaCasa.get();
        }

        if (respuesta.isPresent()) {
            Comentario comentario = respuesta.get();
            comentario.setDescripcion(descripcion);
            comentario.setCasa(casa);
            comentarioRepositorio.save(comentario);
        }
    }
    public void validar (String descripcion, String idCasa) throws Exception {

        if (descripcion == null || descripcion.isEmpty()) {
            throw new Exception("La descripcion no puede ser nula");
        }
        if (idCasa == null || idCasa.isEmpty()) {
            throw new Exception("El idCasa no puede ser nulo");
        }
    }
}
