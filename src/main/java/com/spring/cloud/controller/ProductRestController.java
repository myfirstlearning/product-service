package com.spring.cloud.controller;

import com.spring.cloud.model.Product;

import com.spring.cloud.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product-api")
public class ProductRestController {

    @Autowired
    ProductRepo productRepo;

    @PostMapping("/products")
    public Product createProduct(Product product){

        return productRepo.save(product);

    }


}
