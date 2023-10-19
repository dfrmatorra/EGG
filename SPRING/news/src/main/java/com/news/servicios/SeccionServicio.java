package com.news.servicios;

import com.news.entidades.Seccion;
import excepciones.MiException;
import com.news.repositorios.SeccionRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeccionServicio {

    @Autowired
    private SeccionRepositorio seccionRepositorio;

    @Transactional
    public void crearSeccion(String nombre) throws MiException {

        validar(nombre);

        Seccion seccion = new Seccion();

        seccion.setNombre(nombre);

        seccionRepositorio.save(seccion);
    }

    public List<Seccion> listarSecciones() {
        List<Seccion> secciones = new ArrayList<>();
        secciones = seccionRepositorio.findAll();
        return secciones;
    }

    @Transactional
    public void modificarSeccion(String id, String nombre) throws MiException {

        validar(nombre);

        Optional<Seccion> respuesta = seccionRepositorio.findById(id);

        if (respuesta.isPresent()) {
            Seccion seccion = respuesta.get();

            seccion.setNombre(nombre);

            seccionRepositorio.save(seccion);
        }
    }

    private void validar(String nombre) throws MiException {

        if (nombre.isEmpty() || (nombre == null)) {
            throw new MiException("el nombre de la seccion no puede ser nulo o estar vacio");
        }
    }

}
