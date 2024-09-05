package model;

import java.util.ArrayList;

import dto.ProductDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String description;
	@Column(nullable = false, unique = true)
	private int stock;
	@Column(nullable = false, unique = true)
	private double precio;
	private String informacion;
	private ArrayList<String> direccionImagenes;
	
	public Product() {
	}

	public Product(Long id, String description, int stock, double precio, String informacion,
			ArrayList<String> direccionImagenes) {
		this.id = id;
		this.description = description;
		this.stock = stock;
		this.precio = precio;
		this.informacion = informacion;
		this.direccionImagenes = direccionImagenes;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getStock() {
		return stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String getInformacion() {
		return informacion;
	}
	
	public void setInformacion(String informacion) {
		this.informacion = informacion;
	}
	
	public ArrayList<String> getDireccionImagenes() {
		return direccionImagenes;
	}
	
	public void setDireccionImagenes(ArrayList<String> direccionImagenes) {
		this.direccionImagenes = direccionImagenes;
	}
	
	public ProductDto toDto() {
		return new ProductDto(this.id, this.description, this.stock, this.precio, this.informacion, this.direccionImagenes);
	}
}
