package com.gaucho.estancias.controladores;
import com.gaucho.estancias.excepciones.MiException;
import com.gaucho.estancias.servicios.CasaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
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

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

    @PostMapping("/registro")
    public String registro(@RequestParam(required=false) String calle, @RequestParam(value = "numero", defaultValue = "0") int numero,
                           @RequestParam(value = "codPostal", defaultValue = "0") String codPostal, @RequestParam String ciudad, @RequestParam String pais,
                           @RequestParam(required=false) Date fechaDesde, @RequestParam(required=false) Date fechaHasta, @RequestParam(value = "minDias", defaultValue = "0") int minDias,
                           @RequestParam(value = "maxDias", defaultValue = "0") int maxDias, @RequestParam(value = "precio", defaultValue = "0") double precio,
                           @RequestParam String tipoVivienda, ModelMap modelo) {

        try {
            casaServicio.crearCasa(calle, numero, codPostal, ciudad, pais, fechaDesde, fechaHasta, minDias, maxDias, precio, tipoVivienda);
            modelo.put("exito", "La casa fue registrada exitosamente");
        } catch (MiException ex) {
//            Logger.getLogger(CasaControlador.class.getName()).log(Level.SEVERE, null, ex);
            modelo.put("error", ex.getMessage());
            return "casa_form.html";
        }

        return "casa_form.html";

    }
}


