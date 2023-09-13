package com.ogmenas.springboot.di.app.models.service;

//import org.springframework.stereotype.Component;

//@Component("SecondService")
public class SecondService implements ITestService{
        
        @Override
        public String operacion() {
            return "Ejecutando algún proceso importante... desde SecondService";
        }
    
}
