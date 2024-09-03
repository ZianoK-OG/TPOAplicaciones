package com.uade.tpo.ecommerce.ecommerce;

import lombok.*;


public class Producto {
    private String nombre;
    private String categoria;
    private boolean esDestacado;
    private Long id;

    public Producto(String nombre, String categoria, boolean esDestacado, Long id){
        this.nombre = nombre;
        this.categoria = categoria;
        this.esDestacado = esDestacado;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public boolean isEsDestacado() {
        return esDestacado;
    }

    public Long getId() {
        return id;
    }
}
