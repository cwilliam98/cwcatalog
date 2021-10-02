package com.cristian.cwcatalog.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cristian.cwcatalog.dto.ProductDTO;
import com.cristian.cwcatalog.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

	@Autowired
	private ProductService service;

	@GetMapping
	public ResponseEntity<List<ProductDTO>> findAll() {
		List<ProductDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<ProductDTO> findById(@PathVariable String id) {
		try {
			ProductDTO product = service.findById(id);
			return ResponseEntity.ok().body(product);
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}
	}

	@GetMapping(value = "/search")
	public ResponseEntity<List<ProductDTO>> search(
			@RequestParam(value = "min_price", defaultValue = "") Double minPrice,
			@RequestParam(value = "max_price", defaultValue = "") Double maxPrice,
			@RequestParam(value = "q", defaultValue = "") String q) {
		List<ProductDTO> product = service.search(q, minPrice, maxPrice);
		return ResponseEntity.ok().body(product);
	}

}
