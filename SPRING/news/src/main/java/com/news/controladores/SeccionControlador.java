package com.news.controladores;

import com.news.entidades.Seccion;
import excepciones.MiException;
import com.news.servicios.SeccionServicio;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import excepciones.MiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/seccion")
public class SeccionControlador {

    @Autowired
    private SeccionServicio seccionServicio;

    @GetMapping("/registrar") //localhost:8080/autor/registrar
    public String registrar() {
        return "seccion_form.html";
    }

    @PostMapping("/registro")
    public String registro(@RequestParam String nombre, ModelMap modelo) throws MiException {

        try {
            seccionServicio.crearSeccion(nombre);

            modelo.put("exito", "La Seccion fue registrada correctamente!");
        } catch (MiException ex) {

            modelo.put("error", ex.getMessage());
            return "seccion_form.html";
        }

        return "index.html";
    }

    @GetMapping("/lista")
    public String listar(ModelMap modelo) {

        List<Seccion> secciones = seccionServicio.listarSecciones();

        modelo.addAttribute("secciones", secciones);

        return "seccionl_list.html";
    }
}
