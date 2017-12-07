package com.example.starter.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloResource {

    @RequestMapping("/hello")
    public String home() {
        return "Hello, World!";
    }
}
