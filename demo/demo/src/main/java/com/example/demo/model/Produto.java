package com.example.demo.model;

public class Produto{
    private String name;
    private int value;

    public Produto(String name, int value) {
        this.name = name;
        this.value = value;
    }

    // getters e setters obrigatórios para JSON funcionar
    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
