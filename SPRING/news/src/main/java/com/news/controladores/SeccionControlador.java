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
import org.springframework.web.bind.annotation.PathVariable;
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

        return "seccion_list.html";
    }
    
     @GetMapping("/modificar/{id}")
    public String modificar(@PathVariable String id, ModelMap modelo) {
        modelo.put("seccion", seccionServicio.getOne(id));

        return "seccion_modificar.html";
    }

    @PostMapping("/modificar/{id}")
    public String modificar(@PathVariable String id, String nombre, ModelMap modelo) {
        try {
            seccionServicio.modificarSeccion(nombre, id);

            return "redirect:../lista";
        } catch (MiException ex) {
            modelo.put("error", ex.getMessage());
            return "seccion_modificar.html";
        }

    }
}
