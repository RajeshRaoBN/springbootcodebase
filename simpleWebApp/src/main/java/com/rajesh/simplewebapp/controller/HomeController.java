package com.rajesh.simplewebapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String greeting() {
        return "Home Page";
    }

    @RequestMapping("/about")
    public String about() {
        return "About Page";
    }
}
