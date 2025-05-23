package com.example.demoone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemooneApplication {

	@RequestMapping("/")
	String home() {
		return "Hello Spring Boot";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemooneApplication.class, args);
	}

}
