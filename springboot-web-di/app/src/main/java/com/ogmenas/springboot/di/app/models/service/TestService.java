package com.ogmenas.springboot.di.app.models.service;

//import org.springframework.stereotype.Component;

//@Component("TestService")
public class TestService implements ITestService {
    
    @Override
    public String operacion() {
        return "Ejecutando algún proceso importante...";
    }
}
