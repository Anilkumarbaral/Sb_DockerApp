package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @GetMapping("/welcome")
    public String getWelcome(){
        return "Hi, Anil welcome to docker practice";
    }
    @GetMapping("/greet")
    public String getGreeting(){
        return "Hi Anil Good Morning, Anil welcome to docker practice";
    }
}
