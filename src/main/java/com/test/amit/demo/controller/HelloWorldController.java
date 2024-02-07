package com.test.amit.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/")

public class HelloWorldController {

    @GetMapping("path")
    public String abc(){
        return "as";
    }
    
}