package com.allstate.repositories;

import com.allstate.entities.Product;
import org.springframework.data.repository.CrudRepository;


public interface ProductRepository extends CrudRepository<Product,Integer> {
    public Product findByName(String title);
}
