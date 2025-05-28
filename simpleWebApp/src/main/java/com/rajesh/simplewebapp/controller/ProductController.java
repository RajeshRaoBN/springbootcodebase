package com.rajesh.simplewebapp.controller;

import com.rajesh.simplewebapp.model.Product;
import com.rajesh.simplewebapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/allproducts")
    public List<Product> allProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/product/{prodId}")
    public Product getProductById(@PathVariable int prodId) {
        return productService.getProductById(prodId);
    }

    @PostMapping("/product")
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }

    @PutMapping("/product")
    public void updateProduct(@RequestBody Product product) {
        productService.updateProduct(product);
    }

    @DeleteMapping("/product/{prodId}")
    public void deleteProduct(@PathVariable int prodId) {
        productService.deleteProduct(prodId);
    }
}
