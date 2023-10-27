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
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/noticia")//localhost:8080/noticia
public class NoticiaControlador {

    @Autowired
    private NoticiaServicio noticiaServicio;
    @Autowired
    private AutorServicio autorServicio;
    @Autowired
    private SeccionServicio seccionServicio;

    @GetMapping("/registrar")//localhost:8080/Noticia/registrar
    public String registrar(ModelMap modelo) {
        List<Autor> autores = autorServicio.listarAutores();
        List<Seccion> secciones = seccionServicio.listarSecciones();

        modelo.addAttribute("autores", autores);
        modelo.addAttribute("secciones", secciones);

        return "noticia_form.html";
    }

    @PostMapping("/registro")
    public String registro(@RequestParam(required = false) Long id, @RequestParam String titulo,
                           @RequestParam String descripcion, @RequestParam String idAutor,
                           @RequestParam String idSeccion, ModelMap modelo) {

        try {
            noticiaServicio.crearNoticia(id, titulo, descripcion, idAutor, idSeccion);

            modelo.put("exito", "La Noticia fue cargada correctamente!");

        } catch (MiException ex) {
            //            Logger.getLogger(AutorControlador.class.getName()).log(Level.SEVERE, null, ex);
            List<Autor> autores = autorServicio.listarAutores();
            List<Seccion> secciones = seccionServicio.listarSecciones();

            modelo.addAttribute("autores", autores);
            modelo.addAttribute("secciones", secciones);
            modelo.put("error", ex.getMessage());
            return "noticia_form.html";
        }

        return "index.html";

    }

    @GetMapping("/lista")
    public String listar(ModelMap modelo){
        List<Noticia> noticias = noticiaServicio.listarNoticias();
        modelo.addAttribute("noticias", noticias);

        return "noticia_list";
    }

    @GetMapping("/modificar/{id}")
    public String modificar(@PathVariable Long id, ModelMap modelo) {
        modelo.put("noticia", noticiaServicio.getOne(id));

        return "noticia_modificar.html";
    }

    @PostMapping("/modificar/{id}")
    public String modificar(@PathVariable Long id, String titulo, String descripcion, String idAutor, String idSeccion, ModelMap modelo) {
        try {
            noticiaServicio.modificarNoticia(id, titulo, descripcion, idAutor, idSeccion);

            return "redirect:../lista";
        } catch (MiException ex) {
            modelo.put("error", ex.getMessage());
            return "noticia_modificar.html";
        }

    }


   }