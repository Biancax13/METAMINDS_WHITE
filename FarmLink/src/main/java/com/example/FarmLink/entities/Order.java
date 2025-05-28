package com.example.FarmLink.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "order_table")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "orderDescription")
    private String orderDescription;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Product> products;

    public Order() {
    }

    public Order(int id, String orderDescription, Customer customer, List<Product> products) {
        this.id = id;
        this.orderDescription = orderDescription;
        this.customer = customer;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }
}
