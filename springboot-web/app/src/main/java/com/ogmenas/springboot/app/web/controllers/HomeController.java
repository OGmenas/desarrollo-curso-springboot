package com.ogmenas.springboot.app.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "forward:/v1/index";
    }
    
    @GetMapping("/google")
    public String google() {
        return "redirect:https://www.google.com";
    }  
}
