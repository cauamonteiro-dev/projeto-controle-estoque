# 📦 Projeto Controle de Estoque

Este projeto consiste em uma **API REST para controle de estoque**, permitindo o gerenciamento de produtos, incluindo cadastro, consulta, atualização e remoção.  
Foi desenvolvido com foco em **boas práticas de backend**, utilizando Java e o ecossistema Spring.

---

## 🎯 Objetivo do Projeto

Este projeto foi criado com o objetivo de **praticar e consolidar conhecimentos** em:

- Desenvolvimento backend com **Java e Spring Boot**
- Criação e estruturação de **APIs REST**
- Integração com **banco de dados relacional**
- Uso do **Spring Data JPA**
- Arquitetura organizada em camadas (Controller, Service, Repository)
- Versionamento de código com **Git e GitHub**

---

## 🛠️ Tecnologias Utilizadas

- **Java 21**
- **Spring Boot**
  - Spring Web
  - Spring Data JPA
- **PostgreSQL**
- **Maven**
- **IntelliJ IDEA**
- **Git & GitHub**

---

## ⚙️ Funcionalidades

- Cadastro de produtos
- Listagem de produtos
- Consulta de produto por ID
- Atualização de informações do produto
- Remoção de produtos
- Controle de quantidade em estoque
- Tratamento básico de erros

---

## 🗄️ Banco de Dados

- **SGBD:** PostgreSQL  
- **Banco:** `projeto_controle_estoque`
- A estrutura das tabelas é gerada automaticamente pelo Hibernate (`ddl-auto=update`)

---

## 📡 Endpoints da API

| Método | Endpoint       | Descrição                |
| ------ | -------------- | ------------------------ |
| POST   | /produtos      | Cadastrar produto        |
| GET    | /produtos      | Listar todos os produtos |
| GET    | /produtos/{id} | Buscar produto por ID    |
| PUT    | /produtos/{id} | Atualizar produto        |
| DELETE | /produtos/{id} | Remover produto          |

## 👨‍💻 Autor

Cauã Monteiro

