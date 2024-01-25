package com.gautam.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gautam.product.entity.Product;

public interface ProductRepository extends JpaRepository <Product, Integer>{

	Product findByName(String name);

	

}
