package com.gaucho.estancias.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/casa")
public class AutorControlador {

    @GetMapping("/regustrar")
    public String registrar() {
        return "autor_form";
    }

    @PostMapping("/registro")
    public String registro(@RequestParam String nombre) {
        System.out.println("Nombre: " + nombre);
        return "casa_form";
    }
}


