package com.gaucho.estancias.servicios;

import com.gaucho.estancias.entidades.Casa;
import com.gaucho.estancias.entidades.Cliente;
import com.gaucho.estancias.entidades.Usuario;
import com.gaucho.estancias.excepciones.MiException;
import com.gaucho.estancias.repositorios.ClienteRepositorio;
import com.gaucho.estancias.repositorios.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ClienteServicio {

    @Autowired
    private ClienteRepositorio clienteRepositorio;
    @Autowired
    UsuarioRepositorio usuarioRepositorio;

    @Transactional
    public void crearCliente(String id, String nombre, String calle, int numero,
                             String codPostal, String ciudad, String pais, String email, String idUsuario) throws MiException {

        validar(nombre, calle, numero, codPostal, ciudad, pais, email, idUsuario);

        Usuario usuario = usuarioRepositorio.findById(idUsuario).get();

        Cliente cliente = new Cliente();

        cliente.setNombre(nombre);
        cliente.setCalle(calle);
        cliente.setNumero(numero);
        cliente.setCodPostal(codPostal);
        cliente.setCiudad(ciudad);
        cliente.setPais(pais);
        cliente.setEmail(email);
        cliente.setUsuario(usuario);

        clienteRepositorio.save(cliente);

    }

    public List<Cliente> listarClientes(){
        List<Cliente> clientes = new ArrayList();
        clientes = clienteRepositorio.findAll();
        return clientes;
    }

    @Transactional
    public void modificarCliente(String id, String nombre, String calle, int numero,
                                 String codPostal, String ciudad, String pais, String email,
                                 String idUsuario) throws MiException {

        validar(nombre, calle, numero, codPostal, ciudad, pais, email, idUsuario);

        Optional <Usuario> respuestaUsuario = usuarioRepositorio.findById(idUsuario);
        Optional<Cliente> respuesta = clienteRepositorio.findById(id);

        Usuario usuario = new Usuario();


        if(respuestaUsuario.isPresent()){
            usuario = respuestaUsuario.get();

        }
        if (respuesta.isPresent()) {
            Cliente cliente = respuesta.get();
            cliente.setNombre(nombre);
            cliente.setCalle(calle);
            cliente.setNumero(numero);
            cliente.setCodPostal(codPostal);
            cliente.setCiudad(ciudad);
            cliente.setPais(pais);
            cliente.setEmail(email);
            cliente.setUsuario(usuario);

            clienteRepositorio.save(cliente);
        }
    }

    public void validar (String nombre, String calle, int numero,
                         String codPostal, String ciudad, String pais, String email,
                         String idUsuario) throws MiException {

        if (nombre == null || nombre.isEmpty()) {
            throw new MiException("El nombre es obligatorio");
        }
        if (calle == null || calle.isEmpty()) {
            throw new MiException("La calle es obligatoria");
        }
        if (numero == 0) {
            throw new MiException("El numero no puede ser 0");
        }
        if (codPostal == null || codPostal.isEmpty()) {
            throw new MiException("El codigo postal es obligatorio");
        }
        if (ciudad == null || ciudad.isEmpty()) {
            throw new MiException("La ciudad es obligatoria");
        }
        if (pais == null || pais.isEmpty()) {
            throw new MiException("El pais es obligatorio");
        }
        if (email == null || email.isEmpty()) {
            throw new MiException("El email es obligatorio");
        }
        if (idUsuario == null || idUsuario.isEmpty()) {
            throw new MiException("El idUsuario es obligatorio");
        }
    }
}
