package com.gaucho.estancias.controladores;
import com.gaucho.estancias.excepciones.MiException;
import com.gaucho.estancias.servicios.CasaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
@RequestMapping("/casa")
public class CasaControlador {

    @Autowired
    private CasaServicio casaServicio;

    @GetMapping("/registrar")
    public String registrar() {
        return "casa_form.html";
    }

    @PostMapping("/registro")
    public String registro(@RequestParam String calle, @RequestParam(required=false) int numero, @RequestParam String codPostal,
                           @RequestParam String ciudad, @RequestParam String pais, @RequestParam(required=false) Date fechaDesde,
                           @RequestParam(required=false) Date fechaHasta, @RequestParam(required=false) int minDias, @RequestParam(required=false) int maxDias,
                           @RequestParam(required=false) double precio, @RequestParam String tipoVivienda, ModelMap modelo) {

        try {
            casaServicio.crearCasa(calle, numero, codPostal, ciudad, pais, fechaDesde, fechaHasta, minDias, maxDias, precio, tipoVivienda);
            modelo.put("exito", "La casa fue registrada exitosamente");
        } catch (MiException ex) {
//            Logger.getLogger(CasaControlador.class.getName()).log(Level.SEVERE, null, ex);
            modelo.put("error", ex.getMessage());
            return "casa_form.html";
        }

        return "index.html";

    }
}


