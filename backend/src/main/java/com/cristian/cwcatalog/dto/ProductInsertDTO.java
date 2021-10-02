package com.cristian.cwcatalog.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class ProductInsertDTO implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	@NotNull(message = "Valor 'name' é  obrigatório")
	private String name;
	@NotNull(message = "Valor 'description' é  obrigatório")
	private String description;
	@NotNull(message = "Valor 'price' é  obrigatório")
	@Positive(message = "Valor 'price' deve ser positivo")
	private Double price;

	public ProductInsertDTO() {
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
