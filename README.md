# Projeto: Microservices na Prática

Neste projeto, desenvolvi dois microservices utilizando o Spring Boot: `user-microservice` e `email-microservice`. Abaixo estão os principais tópicos abordados e as implementações realizadas.

## O que foi feito:

### 1. Criação dos Microservices
- **User Microservice**: Desenvolvi um microservice responsável pelo gerenciamento de usuários, incluindo a criação de endpoints RESTful para salvar e consultar usuários.
- **Email Microservice**: Desenvolvi um microservice dedicado ao envio de emails, preparando-o para receber e processar mensagens de outros microservices.

### 2. Comunicação Assíncrona com RabbitMQ
- **Configuração do RabbitMQ**: Configurei o RabbitMQ para permitir a comunicação entre os microservices. 
- **Criação do Producer e Consumer**: Implementei um `Producer` no `user-microservice` para enviar mensagens e um `Consumer` no `email-microservice` para processar essas mensagens.
- **Conexão com CloudAMQP**: Configurei a conexão com o serviço CloudAMQP para gerenciar o RabbitMQ na nuvem.

### 3. Implementação do Envio de Emails
- **Configuração do SMTP do Gmail**: Configurei o `email-microservice` para enviar emails utilizando o SMTP do Gmail.
- **Execução do Fluxo Completo**: Testei o fluxo completo, desde a criação de um usuário até o envio de um email de confirmação, validando a comunicação assíncrona entre os microservices.

### 4. Preparação do Ambiente
- **Configuração do Ambiente de Desenvolvimento**: Utilize o JDK 17, Maven, Postman, PgAdmin, e uma IDE de sua escolha (IntelliJ, STS, Eclipse) para desenvolver e testar os microservices.

Este projeto me proporcionou uma experiência prática e aprofundada na construção de uma arquitetura de microservices, envolvendo comunicação assíncrona e integração com serviços externos como o RabbitMQ e o SMTP do Gmail.
