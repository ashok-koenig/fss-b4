package com.example.products.service;

import com.example.products.entity.Product;
import com.example.products.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    @Async
    public CompletableFuture<String> longRunningTask(){
        try {
            Thread.sleep(5000); // Simulate long running task
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return CompletableFuture.completedFuture("Task completed");
    }

    // Create product and update product
    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Optional<Product> getAProduct(Integer id){
        return productRepository.findById(id);
    }

    public void deleteProduct(Integer id){
        productRepository.deleteById(id);
    }

}
