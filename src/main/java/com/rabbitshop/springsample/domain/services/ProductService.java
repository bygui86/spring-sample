package com.rabbitshop.springsample.domain.services;

import com.rabbitshop.springsample.domain.entities.Product;

import java.util.List;


public interface ProductService {

	List<Product> getAllProducts();

}
