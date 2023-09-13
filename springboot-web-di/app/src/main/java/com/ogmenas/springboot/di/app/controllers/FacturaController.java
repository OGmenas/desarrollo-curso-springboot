package com.ogmenas.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ogmenas.springboot.di.app.models.domains.Factura;

@Controller
@RequestMapping("/v1/facturas")
public class FacturaController {

    @Autowired
    private Factura factura;

    @GetMapping({"/ver","/", "/Ver"})
    public String ver(Model model){
        model.addAttribute("factura", factura);
        model.addAttribute("titulo", "Ejemplo Factura con inyección de dependencias");
        return "factura/ver";
    }
}
