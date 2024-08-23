package com.uade.tpo.ecommerce.dto;

import java.util.ArrayList;

public class ProductDto {
	private Long id;
	private String desc;
	private int stock;
	private double precio;
	private String informacion;
	private ArrayList<String> direccionImagenes;
	
	public ProductDto(Long id, String desc, int stock, double precio, String informacion,
			ArrayList<String> direccionImagenes) {
		this.id = id;
		this.desc = desc;
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

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
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
}
