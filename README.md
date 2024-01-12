# Vector API 

## Descrição

Essa API foi criada com Java e tomcat 10.0.2, ela tem como objetivo simular um insert de produto no banco de dados, ela recebe um json com os dados do produto e retorna um print simulando o insert no banco de dados.

## TOMCAT 10.0.2

Para rodar a aplicação é necessário ter o tomcat 10.0.2 instalado na máquina, você pode baixar o tomcat através do link abaixo:

[Tomcat 10.0.2](https://tomcat.apache.org/download-10.cgi)

## Como usar a aplicação

Para usar a aplicação basta fazer uma requisição POST para a url `http://localhost:8080/product` com o seguinte json no body da requisição:


```json
{
    "descricao": "Descrição do produto 1",
    "valor": 10.0
}
```
o id do produto é gerado com o uuid do java, então não é necessário passar o id no json.

# Frontend 

## Você pode acessar o frontend da aplicação através do link abaixo:

[Frontend]()


## Tecnologias utilizadas

- Java
- Tomcat 10.0.2
- HTML 5
- JavaScript
- JQuery
- Tailwind CSS
