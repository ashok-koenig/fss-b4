package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String welcomeMessage(){
        return "Welcome to Spring Boot REST API Demo";
    }

    @GetMapping("/about")
    public String aboutMessage(){
        return "This is about message";
    }

    @RequestMapping("/contact")
    public String contactInfo(){
        return "The Contact information...";
    }
}
