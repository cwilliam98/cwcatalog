package com.cristian.cwcatalog.dto;

import java.io.Serializable;

import com.cristian.cwcatalog.entities.Product;

public class ProductDTO implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	private String description;
	private Double price;

	public ProductDTO() {
	}

	public ProductDTO(String id, String name, String description, Double price) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}
	
	public ProductDTO(Product entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.description = entity.getDescription();
		this.price = entity.getPrice();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}
