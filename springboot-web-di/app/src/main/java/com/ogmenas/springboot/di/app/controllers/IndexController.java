package com.ogmenas.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import com.ogmenas.springboot.di.app.models.service.ITestService;

@Controller
@RequestMapping("/v1")
public class IndexController {

    private ITestService testService;

    @Autowired
    public IndexController(ITestService testService) {
        this.testService = testService;
    }

    @GetMapping({"/index", "/"})
    String index(Model model) {
        model.addAttribute("objeto", testService.operacion());            
        return "index";
    }

    public void setService(ITestService testService) {
        
        this.testService = testService;
    }

}
