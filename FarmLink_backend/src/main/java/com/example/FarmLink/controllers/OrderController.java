package com.example.FarmLink.controllers;

import com.example.FarmLink.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.example.FarmLink.services.OrderService;
import java.util.List;

@Controller
@RequestMapping("/api/order")
public class OrderController {
    @Autowired
    private OrderService service;

    public OrderController(OrderService orderService) {
        this.service = orderService;
    }

    @GetMapping("/getOrders")
    public ResponseEntity<List<Order>> getAllOrders(@RequestBody Order order){
        List<Order> orders = service.getAllOrders();
        return ResponseEntity.ok(orders);
    }

    @PostMapping("/addOrder")
    public ResponseEntity<Order> addOrder(@RequestBody Order order) {
        return ResponseEntity.ok(service.saveOrder(order));
    }

    @GetMapping("/message")
    public ResponseEntity<String> getMessage() {
        return ResponseEntity.ok("It's working");
    }

}
