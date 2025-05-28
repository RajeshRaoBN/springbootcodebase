package com.rajesh.demoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoappApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(DemoappApplication.class, args);

        Dev obj=context.getBean(Dev.class);
        System.out.println(obj.getAge());
        obj.code();
    }

}
