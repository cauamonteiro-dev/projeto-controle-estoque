# 📦 Projeto Controle de Estoque

Este projeto consiste em uma API REST para controle de estoque, permitindo o gerenciamento de produtos, incluindo cadastro, consulta, atualização e remoção.

A API foi desenvolvida utilizando Java e Spring Boot, com foco em boas práticas de desenvolvimento backend e arquitetura em camadas.

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

### Backend
- Java 21
- Spring Boot
  - Spring Web
  - Spring Data JPA
- PostgreSQL
- Maven

### Ferramentas
- IntelliJ IDEA
- Git & GitHub

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

---

## 🖥️ Frontend da Aplicação

Além da API REST, o projeto também possui um frontend simples desenvolvido em React, com o objetivo de consumir os endpoints da aplicação e praticar a integração entre frontend e backend.

🔗 [Link do Frontend](https://github.com/cauamonteiro-dev/controle-estoque-frontend)

---

## ▶️ Como Executar a API

### Pré-requisitos

Antes de começar, é necessário ter instalado:

* Java 21
* Maven
* PostgreSQL

---

### Configurar o banco de dados

Crie um banco PostgreSQL com o nome:

```sql
projeto_controle_estoque
```

Depois, configure as credenciais do banco no arquivo:

```properties
src/main/resources/application.properties
```

---

### Executar a aplicação

No terminal, execute:

```bash
./mvnw spring-boot:run
```

Ou execute a classe principal pelo IntelliJ IDEA.

---

### API disponível para requisições em:

```text
http://localhost:8080
```

---

## 👨‍💻 Autor

Cauã Monteiro

