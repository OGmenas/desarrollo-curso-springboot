package com.ogmenas.springboot.di.app.models.domains;

public class ItemFactura {
    
    private Producto producto;  
    private Integer cantidad;

    public ItemFactura() {
    }

    public ItemFactura(Producto producto, Integer cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto(){
        return this.producto;
    }

    public Integer getCantidad(){
        return this.cantidad;
    }

    public void setProducto(Producto producto){
        this.producto = producto;
    }

    public void setCantidad(Integer cantidad){
        this.cantidad = cantidad;
    }

    public String calcularImporte(){
        Integer importe = this.cantidad * this.producto.getPrecio();
        return "CLP$ "+importe.toString();
    }

}
