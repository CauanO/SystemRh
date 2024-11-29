
# SystemRH - README

## Sobre o projeto

**SystemRH** é uma aplicação desenvolvida com **Spring Boot**, focada na gestão de recursos humanos. A aplicação utiliza o banco de dados PostgreSQL, com templates Thymeleaf para renderização de páginas e JPA para gerenciamento de persistência.

---

## Pré-requisitos

Certifique-se de ter os seguintes softwares instalados:

- **Java 17** ou superior
- **Maven** (opcional, caso deseje usar diretamente os scripts `mvnw`)
- **PostgreSQL**

---

## Passos para rodar o projeto

### 1. Clone o repositório

```bash
git clone <url-do-repositorio>
cd SystemRH
```

### 2. Configure o banco de dados

- Certifique-se de que o PostgreSQL está em execução.
- Crie um banco de dados para a aplicação:
  ```sql
  CREATE DATABASE systemrh;
  ```
- Atualize as configurações no arquivo `application.properties` ou `application.yml` da aplicação para refletir seu ambiente PostgreSQL (usuário, senha, e URL do banco).

### 3. Compile o projeto

Para compilar e preparar o projeto:

```bash
./mvnw clean install
```

### 4. Execute a aplicação

Inicie o servidor com o seguinte comando:

```bash
./mvnw spring-boot:run
```

A aplicação estará disponível em: [http://localhost:8080](http://localhost:8080)

---

## Estrutura do projeto

- **`src/main/java`**: Código fonte Java.
- **`src/main/resources`**: Arquivos de configuração e templates.
- **`pom.xml`**: Gerenciamento de dependências e plugins.

---

## Tecnologias utilizadas

- **Spring Boot** 3.4.0
- **Thymeleaf** para templates HTML
- **PostgreSQL** para banco de dados
- **Spring Data JPA** para persistência
- **Jakarta Validation** para validação de dados
