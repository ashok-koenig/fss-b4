package com.example.products.controller;

import com.example.products.entity.Product;
import com.example.products.exception.ProductNotFoundException;
import com.example.products.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@Tag(name = "Products API", description = "Operations related to products")
public class ProductController {
    @Autowired
    ProductService productService;

    @Operation(summary = "Create a product")
    @PostMapping
    public ResponseEntity<Product> createProduct(@Valid @RequestBody Product product){
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.saveProduct(product));
    }

    @Operation(summary = "Get all products")
    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @Operation(summary = "Get product by ID")
    @GetMapping("/{id}")
    public Product getAProduct(@PathVariable Integer id){
        return productService.getAProduct(id).orElseThrow(() -> new ProductNotFoundException(id));
    }

    @Operation(summary = "Update a product")
    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Integer id,@Valid @RequestBody Product product){
        productService.getAProduct(id).orElseThrow(() -> new ProductNotFoundException(id));
        product.setId(id);
        return productService.saveProduct(product);
    }

    @Operation(summary = "Delete a product")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable Integer id){
        productService.getAProduct(id).orElseThrow(() -> new ProductNotFoundException(id));
        productService.deleteProduct(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
    }
}
