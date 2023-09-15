package com.ogmenas.springboot.di.app.models.domains;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@RequestScope
public class Factura implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = -4291335753874087051L;

    @Value("${factura.descripcion}")
    private String descripcion;

    @Autowired
    private Cliente cliente;

    @Autowired
    private List<ItemFactura> items;

    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
    }

    @PostConstruct
    public void inicializar() {
        this.cliente.setNombre(cliente.getNombre().concat(" ").concat("Jose"));
        this.descripcion = descripcion.concat(" del cliente: ").concat(cliente.getNombre());
    }

    @PreDestroy
    public void destruir() {
        System.out.println("Factura destruida: ".concat(descripcion));
    }

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
