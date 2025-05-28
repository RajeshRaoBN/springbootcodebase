package com.rajesh.simplewebapp.service;

import com.rajesh.simplewebapp.model.Product;
import com.rajesh.simplewebapp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;

    /*List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(1, "Iphone", "Iphone 16 Pro", 2000 ),
            new Product(2, "Cannon", "Cannon EOS", 400 ),
            new Product(3, "Logitech", "Logitech mic", 50 )));*/

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public Product getProductById(long prodId) {
        return productRepo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product product) {
        productRepo.save(product);
    }

    public void updateProduct(Product product) {
        productRepo.save(product);
    }

    public void deleteProduct(long prodId) {
        productRepo.deleteById(prodId);
    }
}

