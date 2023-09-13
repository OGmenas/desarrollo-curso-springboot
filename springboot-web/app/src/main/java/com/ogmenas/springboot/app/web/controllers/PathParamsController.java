package com.ogmenas.springboot.app.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/v1/path-params")
public class PathParamsController {

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("titulo", "Enviar parámetros del Path en la ruta (@PathVariable)");
        return "pathparams/index";
    }

    @GetMapping("/params1/{texto}")
    public String params1(@PathVariable String texto, Model model) {
        model.addAttribute("titulo", "Recibir parámetros del Path en la ruta (@PathVariable)");
        model.addAttribute("resultado", "El texto enviado en el Path param es: " + texto);
        return "pathparams/ver-params1";
    }

     @GetMapping("/params1/{texto}/{numero}")
    public String params1(@PathVariable String texto, @PathVariable Integer numero, Model model) {
        model.addAttribute("titulo", "Recibir parámetros del Path en la ruta (@PathVariable)");
        model.addAttribute("resultado", "El texto enviado en el Path param es: " + texto
                + " y el número enviado en el Path param es: " + numero);
        return "pathparams/ver-params1";
    }
}
