package com.cristian.cwcatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cristian.cwcatalog.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

}
