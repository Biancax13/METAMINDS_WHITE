package com.example.FarmLink.services;

import com.example.FarmLink.entities.Product;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import com.example.FarmLink.repositories.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {

        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return this.productRepository.findAll();
    }

    public Product getProductById(Long id){
        return this.productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
    }

    public List<Product> getProductsByName(String name) {
        List<Product> products = productRepository.findAll();

        return products.stream().filter(product -> product.getName().equalsIgnoreCase(name)).collect(Collectors.toList());

    }

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }
}
