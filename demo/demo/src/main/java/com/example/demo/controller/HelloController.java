package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;

//import javax.validation.Valid;
import jakarta.validation.Valid;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import com.example.demo.dto.EstudoDTO;
import com.example.demo.dto.ResponseDTO;

@RestController
@RequestMapping("/api/v1/estudo/")
public class HelloController {


    // estrutura de uma rota de Api com spring
    @GetMapping("/hello")
    public String hello(){
        return new String("olá, Seja muito bem-vindo!!");
    }


    // PathVariable muito parecido com requestparam, mas mudam pouca coisa entre um e outro.

    //permite que use regex no url para requisições.

    //  Rota que recebe um param do usuário, e devolve outra resposta.
    @GetMapping("/hello/{name}")
    public String helloNome(@PathVariable String name){
        return new String("Seja bem-vindo, "+name+"!");
    }

    // path com regex.
    @GetMapping("/docs/{filename:.+\\.pdf}")
    public String baixarPdf(@PathVariable String filename) {
        return "Download do arquivo: " + filename;
    }


   // Estrutura para fazer requisições query

   // duas variáveis, sendo a e b
    @GetMapping("/somar")
    public String somar(@RequestParam int a, @RequestParam int b){
        int resultado = a +b;
        return "Resultado: " + resultado;
    }

    // define uma palavra para usar na URL
    @GetMapping("/buscar")
    public String buscar(@RequestParam(name = "search") String palavraChave){
        return "Buscando por: " + palavraChave;
    }

    // possui um valor padrão, caso não seja inserido nenhum valor
    @GetMapping("/saudar")
    public String saudar (@RequestParam(defaultValue = "Mundo") String name){
        return "olá, "+ name;
    }

    // faz com que o query não seja obrigatorio.
    @GetMapping("/saudarr")
    public String sudarr(@RequestParam(required = false) String nome){
        if (nome == null){
            return new String("Olá, visitante!!");
        }else{
            return new String("Olá, "+ nome);
        }
    }

    // ele pega um query com múltiplos parâmetros e armazena em uma lista
    @GetMapping("/filter")
    public String filter(@RequestParam List<String> tag){
        return "tags: "+ tag+ "\n";
    }


    //Ela volta uma resposta no modelo Json, mas não pode caracter especiais.
    @PostMapping
    public Map<String, String> criarEstudo( @RequestBody @Valid EstudoDTO estudo){

        // Volta em um texto.
        //return "Título: " + estudo.getNome() + ", Descricção: " + estudo.getDescricao() + " \n";

        return Map.of(
            "Titulo", estudo.getNome(),
            "Descricao", estudo.getDescricao()
        );
    }

    //Cria um DTO para voltar a respostas, mas não pode caracter especial
    @PostMapping("/teste")
    public ResponseDTO criarAtividade( @RequestBody @Valid EstudoDTO estudo){
        return new ResponseDTO(estudo.getNome(), estudo.getDescricao());
    }

    // Retorna um json, bem mais formatado.
    @PostMapping("/map")
    public Map<String, Object> tarefas(@RequestBody(required=false) @Valid EstudoDTO estudo){
        Map<String, Object> response = new HashMap<>();

        response.put("Nome", estudo.getNome());
        response.put("Descrição", estudo.getDescricao());

        return response;
    }

}