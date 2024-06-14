Repositório do Spring Boot CRUD:


Este é um exemplo simples de uma aplicação CRUD (Create, Read, Update, Delete) usando Spring Boot e MySQL.

## Pré-requisitos

- Java JDK 8 ou superior instalado
- Maven instalado
- MySQL Server instalado e rodando localmente (ou configurável para outro ambiente)

## Configuração do Banco de Dados

1. **Crie um banco de dados MySQL:**

   ```sql
   CREATE DATABASE IF NOT EXISTS crud_example;
   ```

2. **Configure as propriedades do banco de dados:**

   - Abra o arquivo `src/main/resources/application.properties`.
   - Modifique as seguintes propriedades com as configurações do seu banco de dados MySQL:

     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/crud_example?useSSL=false&serverTimezone=UTC
     spring.datasource.username=seu_usuario
     spring.datasource.password=sua_senha
     ```

## Como Executar

1. Clone o repositório:

   ```bash
   git clone https://github.com/seu_usuario/spring-boot-crud.git
   cd spring-boot-crud
   ```

2. Compile o projeto usando Maven:

   ```bash
   mvn clean package
   ```

3. Execute o arquivo JAR gerado:

   ```bash
   java -jar target/crud-application.jar
   ```

4. Acesse a aplicação localmente em [http://localhost:8080](http://localhost:8080).

## Endpoints da API

- **GET /api/cachorros**: Retorna todos os cachorros cadastrados.
- **GET /api/cachorros/{id}**: Retorna um cachorro específico pelo ID.
- **POST /api/cachorros**: Cria um novo cachorro.
- **PUT /api/cachorros/{id}**: Atualiza um cachorro existente pelo ID.
- **DELETE /api/cachorros/{id}**: Deleta um cachorro existente pelo ID.

## Exemplos de Uso

- **Listar todos os cachorros**:

  ```bash
  curl http://localhost:8080/api/cachorros
  ```

- **Criar um novo cachorro**:

  ```bash
  curl -X POST -H "Content-Type: application/json" -d '{"raca":"Labrador Retriever","numeroPatas":4,"corDoPelo":"Amarelo"}' http://localhost:8080/api/cachorros
  ```

- **Atualizar um cachorro existente**:

  ```bash
  curl -X PUT -H "Content-Type: application/json" -d '{"raca":"Labrador","numeroPatas":4,"corDoPelo":"Amarelo"}' http://localhost:8080/api/cachorros/1
  ```

- **Deletar um cachorro existente**:

  ```bash
  curl -X DELETE http://localhost:8080/api/cachorros/1
  ```

## Tecnologias Utilizadas

- Java
- Spring Boot
- MySQL
- Maven

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para enviar pull requests ou abrir issues se encontrar problemas ou tiver sugestões.

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.
```

### Explicação do `README.md`

- **Descrição Geral**: Uma breve descrição do projeto e o propósito do repositório.
- **Pré-requisitos**: Listagem dos requisitos necessários para executar a aplicação.
- **Configuração do Banco de Dados**: Instruções para configurar o MySQL e as propriedades do banco de dados no Spring Boot.
- **Como Executar**: Passos para clonar, compilar e executar a aplicação.
- **Endpoints da API**: Documentação dos endpoints disponíveis na API.
- **Exemplos de Uso**: Exemplos de como interagir com a API usando `curl`.
- **Tecnologias Utilizadas**: Lista das principais tecnologias utilizadas no projeto.
- **Contribuição**: Instruções para contribuir com o projeto.
- **Licença**: Informações sobre a licença do projeto.

Personalize as seções conforme necessário para se adequarem ao seu projeto específico. Isso fornecerá um guia útil para os desenvolvedores que visitarem o seu repositório.
