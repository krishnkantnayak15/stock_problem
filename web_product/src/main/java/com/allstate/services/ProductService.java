package com.allstate.services;

import com.allstate.entities.Product;
import com.allstate.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private ProductRepository repository;

    @Autowired
    public void setRepository(ProductRepository repo){this.repository = repo;}

    public Product create(Product p){
        Product temp =  this.repository.findByName(p.getName());
        System.out.println("tem"+temp);
        if(temp == null)
            return this.repository.save(p);
        else
            return temp;
    }

}
