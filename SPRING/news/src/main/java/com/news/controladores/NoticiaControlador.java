package com.news.controladores;

import com.news.entidades.Autor;
import com.news.entidades.Seccion;
import com.news.entidades.Noticia;
import excepciones.MiException;
import com.news.servicios.AutorServicio;
import com.news.servicios.SeccionServicio;
import com.news.servicios.NoticiaServicio;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/noticia")//localhost:8080/noticia
public class NoticiaControlador {

    @Autowired
    private NoticiaServicio NoticiaServicio;
    @Autowired
    private AutorServicio autorServicio;
    @Autowired
    private SeccionServicio SeccionServicio;

    @GetMapping("/registrar")//localhost:8080/Noticia/registrar
    public String registrar(ModelMap modelo) {
        List<Autor> autores = autorServicio.listarAutores();
        List<Seccion> Secciones = SeccionServicio.listarSecciones();

        modelo.addAttribute("autores", autores);
        modelo.addAttribute("Secciones", Secciones);

        return "Noticia_form.html";
    }

    @PostMapping("/registro")
    public String registro(@RequestParam(required = false) Long id, @RequestParam String titulo,
                           @RequestParam(required = false) String descripcion, @RequestParam String idAutor,
                           @RequestParam String idSeccion, ModelMap modelo) {

        try {
            NoticiaServicio.crearNoticia(id, titulo, descripcion, idAutor, idSeccion);

            modelo.put("exito", "El Noticia fue cargado correctamente!");

        } catch (MiException ex) {
            //            Logger.getLogger(AutorControlador.class.getName()).log(Level.SEVERE, null, ex);
            List<Autor> autores = autorServicio.listarAutores();
            List<Seccion> Secciones = SeccionServicio.listarSecciones();

            modelo.addAttribute("autores", autores);
            modelo.addAttribute("Secciones", Secciones);
            modelo.put("error", ex.getMessage());
            return "Noticia_form.html";
        }

        return "index.html";

    }

    @GetMapping("/lista")
    public String listar(ModelMap modelo){
        List<Noticia> Noticias = NoticiaServicio.listarNoticias();
        modelo.addAttribute("Noticias", Noticias);

        return "Noticia_list";
    }
}