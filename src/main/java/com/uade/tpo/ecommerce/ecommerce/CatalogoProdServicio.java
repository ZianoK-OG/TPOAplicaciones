package com.uade.tpo.ecommerce.ecommerce;

import java.util.List;
import java.util.stream.Collectors;

public class CatalogoProdServicio {

    private final CatalogoProdRepositorio catalogoProdRepositorio;
    private final UsuarioRepositorio usuarioRepositorio;

    public CatalogoProdServicio(CatalogoProdRepositorio catalogoProdRepositorio, UsuarioRepositorio usuarioRepositorio){
        this.catalogoProdRepositorio = catalogoProdRepositorio;
        this.usuarioRepositorio = usuarioRepositorio;
    }

    public List<ProductoDto> getProductosDestacados(){
        return catalogoProdRepositorio.buscarProductoDestacado().stream()
                .map(producto -> convertirDto(producto)).collect(Collectors.toList());
    }

    public List<ProductoDto> getProductosCategoria(Long categoria){
        return catalogoProdRepositorio.buscarPorCategoria(categoria)
                .stream().map(producto -> convertirDto(producto)).collect(Collectors.toList());
    }

    public List<ProductoDto> getProductosRecientes(Long usuarioID){

    }

    public void agregarProductoFavoritos(Long usuarioID, Long productoID){
        usuarioRepositorio.agregarProductoFavoritos(usuarioID, productoID);
    }

    private ProductoDto convertirDto(Producto producto){
        return new ProductoDto(producto.getNombre(), producto.getCategoria(), producto.isEsDestacado(),producto.getId());
    }

}


//FALTA PRODUCTOS VISTOS RECIENTEMENTES POR EL USUARIO Y PRODUCTO DETALLE DTO
