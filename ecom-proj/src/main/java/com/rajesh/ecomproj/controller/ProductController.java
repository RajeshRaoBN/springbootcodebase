package com.rajesh.ecomproj.controller;

import com.rajesh.ecomproj.model.Product;
import com.rajesh.ecomproj.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
// @CrossOrigin("http://localhost:5173")
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService productService;

    @CrossOrigin("http://localhost:5173")
    @RequestMapping("/")
    public String greeting() {
        return "Hello World from ProductController";
    }

    @CrossOrigin("http://localhost:5173")
    @RequestMapping("/products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @CrossOrigin
    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable long id) {
        return productService.getProductById(id);
    }


}
