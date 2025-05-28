package com.example.FarmLink.controllers;

import com.example.FarmLink.entities.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.example.FarmLink.services.OrderService;
import com.example.FarmLink.services.ProductService;
import java.util.List;

@Controller
@RequestMapping("/api")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @Autowired
    private ProductService productService;

    public OrderController(ProductService productService, OrderService orderService) {
        this.productService = productService;
        this.orderService = orderService;
    }

    @GetMapping(value = "/getProducts")
    public ResponseEntity<List<Product>> getAllProducts(){
        List<Product> products = productService.getAllProducts();
        return ResponseEntity.ok(products);
    }

    @GetMapping("/message")
    public ResponseEntity<String> getMessage() {
        return ResponseEntity.ok("Yes it's working");
    }



}
