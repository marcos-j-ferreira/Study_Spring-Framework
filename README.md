# Study-Spring-Framework

Projeto voltado para aprofundar meus conhecimentos em Spring Boot.

### Sumário

* [Objetivo](#objetivo)
* [Conteúdos Estudados](#conteúdos-estudados)
* [Como Baixar e Rodar](#como-baixar-e-rodar)
* [Rotas](#rotas)
* [Atualizações](#atualizações)
* [Autor](#autor)

---

## Objetivo

Este projeto teve como principal objetivo aprofundar meus estudos sobre o Spring Framework, com foco específico na construção de controladores (`@Controller` e `@RestController`).

> Estudei os principais componentes utilizados em controladores, boas práticas, e como construir uma API RESTful com Spring.

---

## Conteúdos Estudados

Foram diversos tópicos abordados. A ideia principal era consolidar o conhecimento adquirido durante os estudos, mesmo que a estrutura não esteja totalmente organizada.

> Tópicos estudados:

* `@RestController:` Indica que a classe é um controlador e que os métodos retornam diretamente a resposta (geralmente JSON).
* `@RequestMapping:` Define o endpoint base para receber requisições.
* `@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping:` Definem os métodos HTTP que a rota aceita.
* `@PathVariable:` Permite capturar variáveis diretamente da URL.
* `@RequestParam:` Permite capturar parâmetros de *query string*.
* `@RequestBody:` Indica que o método receberá um corpo de requisição (geralmente JSON).
* `@Valid:` Utilizado para validação automática dos dados de entrada com base nas anotações do Java Bean Validation.
* `@ResponseEntity:` Permite customizar a resposta da requisição, incluindo o corpo, cabeçalhos e status HTTP.

---

## Como Baixar e Rodar

> Para rodar o projeto localmente, basta seguir os seguintes passos:

```bash
git clone https://github.com/marcos-j-ferreira/Study_Spring-Framework.git

cd Study_Spring-Framework/demo/demo/

# Observação: é possível executar diretamente, mas recomenda-se compilar primeiro.
mvn compile 

mvn spring-boot:run
```

> A API estará disponível por padrão em `http://localhost:8081`, mas essa porta pode ser alterada no arquivo de propriedades.

> Arquivo de configuração: [`application.properties`](./demo/demo/src/main/resources/application.properties)

---

## Rotas

O foco deste projeto não foi a documentação detalhada das rotas ou suas respostas, visto que elas não fazem nenhum tratamento avançado de dados. O objetivo era apenas compreender o funcionamento geral do Spring em uma API REST.

> Algumas rotas foram mapeadas no arquivo `start.sh` com exemplos simples de uso em diferentes máquinas.

> Arquivo shell: [`start.sh`](./demo/demo/start.sh)

---

## Atualizações

Não pretendo adicionar novas funcionalidades nesta API, a não ser que eu decida estudar outros tópicos relacionados ao Spring futuramente.

---

## Autor

Autor: **Marcos J. L. Ferreira**