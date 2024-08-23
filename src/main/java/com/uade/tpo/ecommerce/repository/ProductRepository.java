package com.uade.tpo.ecommerce.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.uade.tpo.ecommerce.dto.ProductDto;
import com.uade.tpo.ecommerce.model.Product;

@Repository
public class ProductRepository {
	
	private List<Product> products = new ArrayList<>();
	
	private Long lastId = (long) 3; //Contador de ids provisional
	
	public ProductRepository() {
		products.add(new Product((long) 1,"producto1", 5, 500, "Producto de prueba 1", null));
		products.add(new Product((long) 2,"producto2", 10, 750, "Producto de prueba 2", null));
		products.add(new Product((long) 3,"producto3", 100, 100, "Producto de prueba 3", null));
		
	}
	
	public Optional<Product> findById(Long id){
		return products.stream()	
				.filter(product -> product.getId() == id)
				.findFirst();
	}

	public List<Product> findAll() {
		return products;
	}

	public Product add(ProductDto productDto) {
		Product newProduct = new Product(lastId + 1, productDto.getDesc(), productDto.getStock(), productDto.getPrecio(), productDto.getInformacion(), productDto.getDireccionImagenes());
		products.add(newProduct);
		lastId = lastId + 1;
		return newProduct;
	}
	
}
