package com.test.amit.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/hello")

public class HelloWorldController {

    @GetMapping("/world")
    public String abc(){
        return "as";
    }
    
}