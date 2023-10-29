package com.gaucho.estancias.servicios;

import com.gaucho.estancias.entidades.Familia;
import com.gaucho.estancias.entidades.Usuario;
import com.gaucho.estancias.excepciones.MiException;
import com.gaucho.estancias.repositorios.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class UsuarioServicio {

    @Autowired
    UsuarioRepositorio usuarioRepositorio;
    @Transactional
    public Usuario crearUsuario(String alias, String email, String clave, String tipoUsuario,
                                Date fechaAlta, Date fechaBaja) throws MiException {

        validar(alias, email, clave, tipoUsuario, fechaAlta, fechaBaja);

        Usuario usuario = new Usuario();

        usuario.setAlias(alias);
        usuario.setEmail(email);
        usuario.setClave(clave);
        usuario.setTipoUsuario(tipoUsuario);
        usuario.setFechaAlta(fechaAlta);
        usuario.setFechaBaja(fechaBaja);

        usuarioRepositorio.save(usuario);
        return usuario;
    }

    public List<Usuario> listarUsuarios(){
        List<Usuario> usuarios = new ArrayList();
        usuarios = usuarioRepositorio.findAll();
        return usuarios;
    }

    @Transactional
    public void modificarUsuario(String id, String alias, String email, String clave, String tipoUsuario,
                                 Date fechaAlta, Date fechaBaja) throws MiException {

        validar(alias, email, clave, tipoUsuario, fechaAlta, fechaBaja);

        Optional<Usuario> respuesta = usuarioRepositorio.findById(id);

        if (respuesta.isPresent()) {
            Usuario usuario = respuesta.get();
            usuario.setAlias(alias);
            usuario.setEmail(email);
            usuario.setClave(clave);
            usuario.setTipoUsuario(tipoUsuario);

            usuarioRepositorio.save(usuario);
        }
    }
    public void validar  (String alias, String email, String clave, String tipoUsuario,
                          Date fechaAlta, Date fechaBaja) throws MiException {
        if (alias == null || alias.isEmpty()) {
            throw new MiException("El alias es obligatorio");
        }
        if (email == null || email.isEmpty()) {
            throw new MiException("El email es obligatorio");
        }
        if (clave == null || clave.isEmpty()) {
            throw new MiException("La clave es obligatoria");
        }
        if (tipoUsuario == null || tipoUsuario.isEmpty()) {
            throw new MiException("El tipo de usuario es obligatorio");
        }
        if (fechaAlta == null) {
            throw new MiException("La fecha de alta es obligatoria");
        }
    }
}
