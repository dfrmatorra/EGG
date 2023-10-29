package com.gaucho.estancias.servicios;

import com.gaucho.estancias.entidades.Casa;
import com.gaucho.estancias.entidades.Cliente;
import com.gaucho.estancias.entidades.Familia;
import com.gaucho.estancias.entidades.Reserva;
import com.gaucho.estancias.excepciones.MiException;
import com.gaucho.estancias.repositorios.CasaRepositorio;
import com.gaucho.estancias.repositorios.ClienteRepositorio;
import com.gaucho.estancias.repositorios.ReservaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class ReservaServicio {

    @Autowired
    private ReservaRepositorio reservaRepositorio;
    @Autowired
    private ClienteRepositorio clienteRepositorio;
    @Autowired
    private CasaRepositorio casaRepositorio;
    @Transactional
    public void crearReserva(String id, String huesped, Date fechaDesde, Date fechaHasta, String idCliente,
                             String idCasa) throws MiException {

        validar(huesped, fechaDesde, fechaHasta, idCliente, idCasa);

        Cliente cliente = clienteRepositorio.findById(idCliente).get();
        Casa casa = casaRepositorio.findById(idCasa).get();

        Reserva reserva = new Reserva();
        reserva.setId(id);
        reserva.setHuesped(huesped);
        reserva.setFechaDesde(fechaDesde);
        reserva.setFechaHasta(fechaHasta);
        reserva.setCliente(cliente);
        reserva.setCasa(casa);

        reservaRepositorio.save(reserva);


    }

    public List<Reserva> listarReservas(){
        List<Reserva> reservas = new ArrayList();
        reservas = reservaRepositorio.findAll();
        return reservas;
    }

    @Transactional
    public void modificarReserva(String id, String huesped, Date fechaDesde, Date fechaHasta,
                                 String idCliente, String idCasa) throws MiException {

        validar(huesped, fechaDesde, fechaHasta, idCliente, idCasa);

        Optional<Cliente> respuestaCliente = clienteRepositorio.findById(idCliente);
        Optional <Casa> respuestaCasa = casaRepositorio.findById(idCasa);
        Optional <Reserva> respuesta = reservaRepositorio.findById(id);

        Cliente cliente = new Cliente();
        Casa casa = new Casa();

        if(respuestaCliente.isPresent()){
            cliente = respuestaCliente.get();
        }

        if(respuestaCasa.isPresent()){
            casa = respuestaCasa.get();
        }


        if(respuesta.isPresent()){
            Reserva reserva = respuesta.get();
            reserva.setHuesped(huesped);
            reserva.setFechaDesde(fechaDesde);
            reserva.setFechaHasta(fechaHasta);
            reserva.setCliente(cliente);
            reserva.setCasa(casa);

            reservaRepositorio.save(reserva);
        }
    }
    public void validar (String huesped, Date fechaDesde, Date fechaHasta, String idCliente,
                         String idCasa) throws MiException {
        if (huesped == null || huesped.isEmpty()) {
            throw new MiException("El nombre del huesped es obligatorio");
        }
        if (fechaDesde == null) {
            throw new MiException("La fecha desde es obligatoria");
        }
        if (fechaHasta == null) {
            throw new MiException("La fecha hasta es obligatoria");
        }
        if (idCliente == null || idCliente.isEmpty()) {
            throw new MiException("El id del cliente es obligatorio");
        }
        if (idCasa == null || idCasa.isEmpty()) {
            throw new MiException("El id de la casa es obligatorio");
        }
    }

}
