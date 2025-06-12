package com.example.products.service;

import com.example.products.entity.Product;
import com.example.products.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    // Create product and update product
    @CacheEvict(value = "products", allEntries = true)
    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    @Cacheable(value = "products")
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Optional<Product> getAProduct(Integer id){
        return productRepository.findById(id);
    }

    @CacheEvict(value = "products", allEntries = true)
    public void deleteProduct(Integer id){
        productRepository.deleteById(id);
    }

}
