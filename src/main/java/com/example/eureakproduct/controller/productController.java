package com.example.eureakproduct.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productController {

    @GetMapping("/msg")
    public String msg(){
        return "this is product msg";
    }
}
