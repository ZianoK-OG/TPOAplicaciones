package com.uade.tpo.ecommerce.ecommerce;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/productosCatalogo")
public class CatalogoProdControlador {

    private final CatalogoProdServicio catalogoProdServicio;

    public CatalogoProdControlador(CatalogoProdServicio catalogoProdServicio){
        this.catalogoProdServicio = catalogoProdServicio;
    }


    @GetMapping("/destacados")
    public ResponseEntity<List<ProductoDto>> getProductosDestacados(){
        List<ProductoDto> productosDestacados = catalogoProdServicio.getProductosDestacados();
        return ResponseEntity.ok(productosDestacados);
    }


    @GetMapping("/categoria/{categoria}")
    public ResponseEntity<List<ProductoDto>> getProductosCategoria(@PathVariable Long categoria){
        List<ProductoDto> productosCategoria = catalogoProdServicio.getProductosCategoria(categoria);
        return ResponseEntity.ok(productosCategoria);
    }


    @GetMapping("/productos_recientes/{usuarioID}")
    public ResponseEntity<List<ProductoDto>> getProductosRecientes(@PathVariable Long usuarioID){
        List<ProductoDto> productosRecientes = catalogoProdServicio.getProductosRecientes(usuarioID);
        return ResponseEntity.ok(productosRecientes);
    }


    @PostMapping("/favoritos/{usuarioID}/{productoID}")
    public ResponseEntity<Void> agregarProductoFavoritos(@PathVariable Long usuarioID, @PathVariable Long productoID) {
        catalogoProdServicio.agregarProductoFavoritos(usuarioID, productoID);
        return ResponseEntity.ok().build();
    }
    }



//FALTA OBTENER DETALLES DEL PRODUCTO Y AGREGAR PRODUCTO AL CARRITO DESDE OBTENER DETALLES
//Anotaciones de JPA
//AllArgsConstructor, lombok @data
