package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/v1/estudo")
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return new String("olá, Seja muito bem-vindo!!");
    }

}