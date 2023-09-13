package com.ogmenas.springboot.app.web.controllers;

import java.util.List;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Value;



import com.ogmenas.springboot.app.web.models.Usuario;



import org.springframework.ui.Model;
@Controller
@RequestMapping("/v1")

public class IndexController {

    @Value("${texto.indexcontroller.index.titulo}")    
    private String textoIndex;

    @Value("${texto.indexcontroller.perfil.titulo}")
    private String textoPerfil;

    @Value("${texto.indexcontroller.listar.titulo}")
    private String textoListar;
    

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("titulo", textoIndex);
        model.addAttribute("mensaje", "Bienvenido a mi aplicación con Spring Boot");
        return "index";
    }

    @GetMapping("/perfil")
    public String perfil(Model model) {
        Usuario usuario = new Usuario( "Oscar", "Gonzalez", "oscar.gonzalez@meme.cl");
        model.addAttribute("usuario", usuario);
        model.addAttribute("titulo", textoPerfil.concat(" "+usuario.getNombre()) + " " + usuario.getApellido() + "");
        return "perfil";
    }

    @GetMapping("/listar")
    public String listar(Model model) {

        model.addAttribute("titulo", textoListar);
        return "listar";
    }

    @ModelAttribute("usuarios")
    public List<Usuario> getUsuarios() {
        return Arrays.asList(new Usuario("Oscar", "Gonzalez", "oscar.gonzalez@gmail.com"),
                             new Usuario("Ignacio", "Mendez", "ignacio.mendez@gmail.com\""),
                             new Usuario("Ooga", "Booga", "ooga.booga@gmail.com\""));
    }


}