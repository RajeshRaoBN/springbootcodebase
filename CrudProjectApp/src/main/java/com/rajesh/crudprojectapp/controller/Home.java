package com.rajesh.crudprojectapp.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    public String Home() {
        return "Hello World!";
    }
}
