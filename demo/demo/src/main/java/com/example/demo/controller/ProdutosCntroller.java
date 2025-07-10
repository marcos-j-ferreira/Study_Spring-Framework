package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpHeaders;

//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Produto;
import com.example.demo.model.MyResponse;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/v1/produtos")
public class ProdutosCntroller{

    // recebe um param, não sendo obrigatorio, e voltar um valor no formato json
    @GetMapping({"/value/{name}", "/value"})
    public Produto listar(@PathVariable(required = false) String name){
        if (name != null){
            return new Produto(name, 100);
        }else{
            return new Produto("Nothing", 000);
        }
    } 

    // recebe dois param, e volar um json, com responseEntity
    @GetMapping("/p1/{nome}/{valor}")
    public ResponseEntity<Produto> getProduct(@PathVariable(required=true) String nome, @PathVariable(required=true) int valor){
        Produto p10 = new Produto(nome, valor);
        return ResponseEntity.ok(p10);
    }

    // recebe param por requisição POST em body, e responde de forma mais personalizado.
    @PostMapping("/add")
    public ResponseEntity<Produto> create(@RequestBody Produto produto){

        return ResponseEntity
                .status(201)
                .body(produto);
    }

    @GetMapping("/header")
    public ResponseEntity<MyResponse> getCustomHeader(){
        HttpHeaders headers = new HttpHeaders();
        headers.add("Estudo-Spring-Java", "Cansadokkkk");

        String  nome = "Estudo";
        String last = "Heard-como-funciona";

        MyResponse response = new MyResponse (nome, last);

        return ResponseEntity
                .ok()
                .headers(headers)
                .body(new MyResponse(nome, last));
    }

}