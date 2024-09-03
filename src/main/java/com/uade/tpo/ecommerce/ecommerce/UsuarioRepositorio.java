package com.uade.tpo.ecommerce.ecommerce;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class UsuarioRepositorio {

    private Map<Long, List<Long>> productosRecientes = new HashMap<>();


    public List<Long> buscarProductosRecientes(Long usuarioID) {
        return productosRecientes.getOrDefault(usuarioID, new ArrayList<>());
    }
}
