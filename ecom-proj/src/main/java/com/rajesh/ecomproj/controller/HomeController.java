package com.rajesh.ecomproj.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @CrossOrigin("http://localhost:5173")
    @RequestMapping("/")
    public String home() {
        return "Hello from Spring Boot!";
    }
}
