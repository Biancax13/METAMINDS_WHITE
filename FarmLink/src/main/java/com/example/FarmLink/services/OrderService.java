package com.example.FarmLink.services;

import org.springframework.stereotype.Service;
import com.example.FarmLink.entities.Order;
import com.example.FarmLink.repositories.OrderRepository;
import com.example.FarmLink.repositories.ProductRepository;

@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final ProductRepository productRepository;

    public OrderService(OrderRepository orderRepository, ProductRepository productRepository) {
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
    }
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }
}
