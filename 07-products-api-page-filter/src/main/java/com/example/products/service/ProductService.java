package com.example.products.service;

import com.example.products.entity.Product;
import com.example.products.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> filterProductsByCategory(String category){
        return productRepository.findByCategory(category);
    }

    // Create product and update product
    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    public Page<Product> getAllProducts(Pageable pageable){
        return productRepository.findAll(pageable);
    }

    public Optional<Product> getAProduct(Integer id){
        return productRepository.findById(id);
    }

    public void deleteProduct(Integer id){
        productRepository.deleteById(id);
    }

}
