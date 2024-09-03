package com.uade.tpo.ecommerce.ecommerce;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class CatalogoProdRepositorio {
    private List<Producto> productos = new ArrayList<>();

    public CatalogoProdRepositorio(){
        productos.add(new Producto("Arroz","cereal",true,1L));
    }


    public List<Producto> buscarProductoDestacado(){
        return productos.stream().filter(producto -> producto.isEsDestacado()).collect(Collectors.toList());
    }


    public List<Producto> buscarPorCategoria(Long categoria){
        return productos.stream().filter(producto -> producto.getCategoria().equals(categoria)).collect(Collectors.toList());
    }


}

