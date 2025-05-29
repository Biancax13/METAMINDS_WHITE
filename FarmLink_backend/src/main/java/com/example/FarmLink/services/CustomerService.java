package com.example.FarmLink.services;

import com.example.FarmLink.entities.Customer;
import org.springframework.stereotype.Service;
import com.example.FarmLink.repositories.CustomerRepository;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer getCustomerById(Long id){
        return this.customerRepository.findById(id).orElseThrow(() -> new RuntimeException("Customer not found"));
    }
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

}
