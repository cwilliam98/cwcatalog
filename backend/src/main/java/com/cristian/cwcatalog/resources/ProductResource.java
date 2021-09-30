package com.cristian.cwcatalog.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cristian.cwcatalog.entities.Product;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> list = new ArrayList<>();
		list.add(new Product("1", "teste","teste", 59.99));
		list.add(new Product("2", "teste 2","teste 2", 69.99));
		return ResponseEntity.ok().body(list);
	}

}
