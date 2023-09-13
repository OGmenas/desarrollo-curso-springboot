package com.ogmenas.springboot.di.app.models.domains;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Factura {

    @Value("${factura.descripcion}")
    private String descripcion;

    @Autowired
    private Cliente cliente;

    @Autowired
    private List<ItemFactura> items;

    public Factura() {
    }

    public Factura(String descripcion, Cliente cliente, List<ItemFactura> items) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = items;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    public Cliente getCliente(){
        return this.cliente;
    }

    public List<ItemFactura> getItems(){
        return this.items;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public void setItems(List<ItemFactura> items){
        this.items = items;
    }

}
