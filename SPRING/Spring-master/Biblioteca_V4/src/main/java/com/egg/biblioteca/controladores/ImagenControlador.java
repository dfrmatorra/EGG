
package com.egg.biblioteca.controladores;

import com.egg.biblioteca.entidades.Usuario;
import com.egg.biblioteca.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/imagen")
public class ImagenControlador {
    
    @Autowired
    UsuarioServicio usuarioServicio;
    
    @GetMapping("/perfil/{id}")
    public ResponseEntity<byte[]> imagenUsuario (@PathVariable String id){
        Usuario usuario = usuarioServicio.getOne(id);
        
       byte[] imagen= usuario.getImagen().getContenido();

       
       HttpHeaders headers = new HttpHeaders();

//       headers.setContentType(MediaType.IMAGE_JPEG);

        //DE ESTA FORMA ACEPTA TODOS LOS TIPOS DE ARCHIVOS DE IMAGENES
        String mime = usuario.getImagen().getMime().toLowerCase(); // Asegúrate de que el MIME esté en minúsculas

        MediaType tipo = MediaType.parseMediaType("image/" + mime.replace("/", "_"));

        headers.setContentType(tipo);
        
       return new ResponseEntity<>(imagen,headers, HttpStatus.OK); 
    }
}
