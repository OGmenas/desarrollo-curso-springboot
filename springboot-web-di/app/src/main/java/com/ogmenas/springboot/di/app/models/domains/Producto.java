package com.ogmenas.springboot.di.app.models.domains;

public class Producto {
    
    private String nombre;
    private Integer precio;

    public Producto() {
    }

    public Producto(String nombre, Integer precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre(){
        return this.nombre;
    }

    public Integer getPrecio(){
        return this.precio;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setPrecio(Integer precio){
        this.precio = precio;
    }
    
}
