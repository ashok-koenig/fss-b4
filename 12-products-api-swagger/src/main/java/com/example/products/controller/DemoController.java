package com.example.products.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Demon controller")
@RestController
public class DemoController {
    @Operation(summary = "Welcome message")
    @GetMapping("/")
    public String welcomeMessage(){
        return "Welcome to Swagger documentation";
    }
}
