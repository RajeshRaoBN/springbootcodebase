package com.rajesh.simplewebapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class index {

    @RequestMapping("/index")
    public String index() {
        return "Hello from Spring Boot!";
    }

    @RequestMapping("/login")
    public String login() {
        return "Login Success!";
    }
}
