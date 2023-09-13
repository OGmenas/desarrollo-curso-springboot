package com.ogmenas.springboot.app.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.ui.Model;

@Controller
@RequestMapping("/v1/query-params")
public class QueryParamController {

    @GetMapping("/index")
    public String index() {
        return "queryparams/index";
    }
    
    @GetMapping("/params1")
    public String params1(@RequestParam( required = false, defaultValue = "default") String texto, Model model ) {
        model.addAttribute("resultado", "El texto enviado en el query param es: " + texto);
        return "queryparams/ver-params1";
    }
    @GetMapping("/mix-params")
    public String mixParams(@RequestParam( required = false, defaultValue = "default") String saludo,
                            @RequestParam( required = false ) Integer numero,
                            Model model ) {
        model.addAttribute("resultado", "El saludo enviado en el query param es: '" + saludo + "' y el número es: '" + numero + "'");
        return "queryparams/ver-mixparams1";
    }
}
