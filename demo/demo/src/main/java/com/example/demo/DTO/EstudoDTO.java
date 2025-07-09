package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class EstudoDTO{

    private String nome;

    @Size(min = 1,max = 200, message = "O nome deve ter entre 1 e 100")
    private String descricao;

    public EstudoDTO(String nome, String descricao ){
        this.nome = nome;
        this.descricao = descricao;
    }

    @NotBlank(message = "O nome não pode estar em branco")
    public String getNome(){
        return nome;
    }
    
    public String getDescricao(){
        return descricao;
    }

    public void setNome( String nome ){
        this.nome = nome;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
}