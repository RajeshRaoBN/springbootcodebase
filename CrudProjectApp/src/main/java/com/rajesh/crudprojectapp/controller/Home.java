package com.rajesh.crudprojectapp.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    @CrossOrigin("http://localhost/5173/")
    @RequestMapping("/greetings")
    public String greeting() {
        return "Hello from Spring Boot!";
    }
}
