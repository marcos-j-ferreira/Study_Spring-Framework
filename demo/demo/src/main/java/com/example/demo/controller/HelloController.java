package com.exemplo.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/v1/estudo")
public class HelloController{

    @GetMapping("")
    @GetMapping("/hello")
    public final String HelloWorld(){
        return "Hello, world!!";

    } 
}