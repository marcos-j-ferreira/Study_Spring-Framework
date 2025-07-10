## Testes de API

Utilizei o **Postman** como ferramenta principal para testar as rotas da API durante o desenvolvimento.

Com ele, enviei requisições do tipo `GET`, `POST` e `PUT` para validar o funcionamento dos endpoints e garantir que os dados estavam sendo corretamente manipulados.

> A estrutura básica das requisições foi configurada manualmente, sem necessidade de autenticação.

### Exemplos de testes realizados:

- **POST**: Envio de um JSON para o endpoint `/add` com `@RequestBody`.
- **GET**: Consulta de dados utilizando `@PathVariable` e `@RequestParam`.

> Se preferir, você pode importar o arquivo `start.sh` ou montar suas próprias requisições com base na estrutura dos controladores.

> Coleção de testes disponíveis em: [`postman_collection.json`](../demo/demo/Postman-export/Spring-boot-estudo.postman_collection.json) *essa tem como objetivo testar algumas rotas*

> Outra coleção que testa as `respostas da API` em: [`Spring-response.postman_collection`](../demo/demo/Postman-export/Spring-response.postman_collection.json)
