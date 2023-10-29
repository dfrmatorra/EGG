package com.gaucho.estancias.servicios;
import com.gaucho.estancias.entidades.Casa;
import com.gaucho.estancias.entidades.Familia;
import com.gaucho.estancias.entidades.Usuario;
import com.gaucho.estancias.excepciones.MiException;
import com.gaucho.estancias.repositorios.CasaRepositorio;
import com.gaucho.estancias.repositorios.FamiliaRepositorio;
import com.gaucho.estancias.repositorios.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FamiliaServicio {

    @Autowired
    private FamiliaRepositorio familiaRepositorio;
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;
    @Autowired
    private CasaRepositorio casaRepositorio;
    @Transactional
    public void  crearFamilia(String id, String nombre, int edadMin, int edadMax,
                              int numHijos, String email, String idUsuario, String idCasa) throws MiException {

        validar(nombre, edadMin, edadMax, numHijos, email, idUsuario, idCasa);

        Usuario usuario = usuarioRepositorio.findById(idUsuario).get();
        Casa casa = casaRepositorio.findById(idCasa).get();

        Familia familia = new Familia();

        familia.setNombre(nombre);
        familia.setEdadMin(edadMin);
        familia.setEdadMax(edadMax);
        familia.setNumHijos(numHijos);
        familia.setEmail(email);

        familia.setUsuario(usuario);
        familia.setCasa(casa);

        familiaRepositorio.save(familia);

    }

    public List<Familia> listarFamilias(){
        List<Familia> familias = new ArrayList<>();
        familias = familiaRepositorio.findAll();
        return familias;
    }

    @Transactional
    public void modificarFamilia(String id, String nombre, int edadMin, int edadMax,
                                 int numHijos, String email, String idUsuario, String idCasa) throws MiException {

            validar(nombre, edadMin, edadMax, numHijos, email, idUsuario, idCasa);

        Optional <Usuario> respuestaUsuario = usuarioRepositorio.findById(idUsuario);
        Optional <Casa> respuestaCasa = casaRepositorio.findById(idCasa);
        Optional <Familia> respuesta = familiaRepositorio.findById(id);

        Usuario usuario = new Usuario();
        Casa casa = new Casa();

        if(respuestaCasa.isPresent()){
            casa = respuestaCasa.get();
        }
        if(respuestaUsuario.isPresent()){
            usuario = respuestaUsuario.get();
        }

        if(respuesta.isPresent()){
            Familia familia = respuesta.get();
            familia.setNombre(nombre);
            familia.setEdadMin(edadMin);
            familia.setEdadMax(edadMax);
            familia.setNumHijos(numHijos);
            familia.setEmail(email);
            familia.setUsuario(usuario);
            familia.setCasa(casa);

            familiaRepositorio.save(familia);
        }
        }

        public void validar (String nombre, int edadMin, int edadMax,
                             int numHijos, String email, String idUsuario, String idCasa) throws MiException {

            if (nombre == null || nombre.isEmpty()) {
                throw new MiException("El nombre es obligatorio");
            }
            if (edadMin == 0) {
                throw new MiException("La edad minima no puede ser 0");
            }
            if (edadMax == 0) {
                throw new MiException("La edad maxima no puede ser 0");
            }
            if (numHijos == 0) {
                throw new MiException("El numero de hijos no puede ser 0");
            }
            if (email == null || email.isEmpty()) {
                throw new MiException("El email es obligatorio");
            }
            if (idUsuario == null || idUsuario.isEmpty()) {
                throw new MiException("El id del usuario es obligatorio");
            }
            if (idCasa == null || idCasa.isEmpty()) {
                throw new MiException("El id de la casa es obligatorio");
            }
        }
}
