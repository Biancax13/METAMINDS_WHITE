package com.example.FarmLink.controllers;

import com.example.FarmLink.entities.Product;
import com.example.FarmLink.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping(value = "/addProduct")
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        return ResponseEntity.ok(service.addProduct(product));
    }

}
