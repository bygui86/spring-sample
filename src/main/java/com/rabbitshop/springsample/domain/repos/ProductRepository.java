package com.rabbitshop.springsample.domain.repos;

import com.rabbitshop.springsample.domain.entities.Product;
import org.springframework.data.repository.CrudRepository;


public interface ProductRepository extends CrudRepository<Product, String> {

	// no-op

}
