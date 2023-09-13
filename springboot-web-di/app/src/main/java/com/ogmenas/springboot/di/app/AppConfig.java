package com.ogmenas.springboot.di.app;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.ogmenas.springboot.di.app.models.service.TestService;
import com.ogmenas.springboot.di.app.models.service.SecondService;
import com.ogmenas.springboot.di.app.models.service.ITestService;

import com.ogmenas.springboot.di.app.models.domains.ItemFactura;
import com.ogmenas.springboot.di.app.models.domains.Producto;



@Configuration
public class AppConfig {
        
        @Bean("TestService")
        @Primary
        public ITestService registrarTestService() {
            return new TestService();
        }
        
        @Bean("SecondService")
        
        public ITestService registrarSecondService() {
            return new SecondService();
        }

        @Bean("itemsFactura")
        public List<ItemFactura> registrarItems() {
            Producto producto1 = new Producto("Camara Sony", 100);
            Producto producto2 = new Producto("Bicicleta Bianchi aro 26", 200);
            
            ItemFactura linea1 = new ItemFactura(producto1, 2);
            ItemFactura linea2 = new ItemFactura(producto2, 4);
            
            return List.of(linea1, linea2);
        }
        
        @Bean("itemsFacturaOficina")
        @Primary
        public List<ItemFactura> registrarItemsOficina() {
            Producto producto1 = new Producto("Monitor LG QLED 50''", 399990);
            Producto producto2 = new Producto("Notebook Asus",  500000);
            Producto producto3 = new Producto("Impresora HP Multifuncional",  80000);
            Producto producto4 = new Producto("Escritorio Oficina",  200000);
            
            ItemFactura linea1 = new ItemFactura(producto1, 2);
            ItemFactura linea2 = new ItemFactura(producto2, 2);
            ItemFactura linea3 = new ItemFactura(producto3, 1);
            ItemFactura linea4 = new ItemFactura(producto4, 1);

            
            return List.of(linea1, linea2, linea3, linea4);
        }
}
