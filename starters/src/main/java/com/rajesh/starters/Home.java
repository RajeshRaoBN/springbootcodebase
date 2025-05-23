package com.rajesh.starters;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @RequestMapping("/home")
    public String home() {
        return "Hello from Spring Boot!";
    }
}
