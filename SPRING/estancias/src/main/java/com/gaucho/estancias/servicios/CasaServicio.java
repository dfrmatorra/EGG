package com.gaucho.estancias.servicios;
import com.gaucho.estancias.entidades.*;
import com.gaucho.estancias.excepciones.MiException;
import com.gaucho.estancias.repositorios.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class CasaServicio {

    @Autowired
    private CasaRepositorio casaRepositorio;

    @Transactional
    public void crearCasa(String calle, int numero, String codPostal, String ciudad, String pais,
                          String fechaDesde, String fechaHasta, int minDias, int maxDias, double precio,
                          String tipoVivienda) throws MiException {

        validar(calle, numero, codPostal, ciudad, pais, fechaDesde, fechaHasta, minDias, maxDias, precio, tipoVivienda);
        Casa casa = new Casa();

        casa.setCalle(calle);
        casa.setNumero(numero);
        casa.setCodPostal(codPostal);
        casa.setCiudad(ciudad);
        casa.setPais(pais);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

        try {
            casa.setFechaDesde(dateFormat.parse(fechaDesde));
            casa.setFechaHasta(dateFormat.parse(fechaHasta));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        casa.setMinDias(3); //por default minimo de 3 dias
        casa.setMaxDias(15);// por default maximo de 15 dias
        casa.setPrecio(precio);
        casa.setTipoVivienda(tipoVivienda);

        casaRepositorio.save(casa);

    }

    public List<Casa> listarCasas(){
        List<Casa> casas = new ArrayList();
        casas = casaRepositorio.findAll();
        return casas;
    }

    public void validar(String calle, int numero, String codPostal, String ciudad, String pais,
                        String fechaDesde, String fechaHasta, int minDias, int maxDias, double precio,
                         String tipoVivienda) throws MiException {


        if(calle == null || calle.isEmpty()){
            throw new MiException("La calle es obligatoria");
        }
        if(numero == 0 ){
            throw new MiException("El numero no puede ser 0");
        }
        if(codPostal == null || codPostal.isEmpty()){
            throw new MiException("El codigo postal es obligatorio");
        }
        if(ciudad == null || ciudad.isEmpty()){
            throw new MiException("La ciudad es obligatoria");
        }
        if(pais == null || pais.isEmpty()){
            throw new MiException("El pais es obligatorio");
        }
        if(fechaDesde == null || fechaDesde.isEmpty()){
            throw new MiException("La fecha desde es obligatoria");
        }
        if(fechaHasta == null || fechaHasta.isEmpty()){
            throw new MiException("La fecha hasta es obligatoria");
        }
        if(minDias == 0){
            throw new MiException("El minimo de dias es obligatorio");
        }
        if(maxDias == 0 || maxDias <= minDias){
            throw new MiException("El maximo de dias es obligatorio y debe ser mayor al minimo");
        }
        if(precio == 0){
            throw new MiException("El precio es obligatorio");
        }
        if(tipoVivienda == null || tipoVivienda.isEmpty()){
            throw new MiException("El tipo de vivienda es obligatorio");
        }
    }
    }