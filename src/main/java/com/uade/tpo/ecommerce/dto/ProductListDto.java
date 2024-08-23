package com.uade.tpo.ecommerce.dto;

import java.util.ArrayList;
import java.util.List;

import com.uade.tpo.ecommerce.model.Product;

public class ProductListDto {
	List<Product> productos = new ArrayList<Product>();

	public ProductListDto(List<Product> productos) {
		this.productos = productos;
	}

	public List<Product> getProductos() {
		return productos;
	}

	public void setProductos(List<Product> productos) {
		this.productos = productos;
	}
	
	
}
