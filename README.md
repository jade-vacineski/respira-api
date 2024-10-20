# Respira!

**Respira!** é uma aplicação web desenvolvida em **Java** utilizando o **Spring Boot**. O objetivo da aplicação é monitorar e exibir a qualidade do ar em diferentes localidades, com base em dados fornecidos pela API pública **OpenAQ**. Os usuários podem consultar a qualidade do ar em uma cidade ou região de sua escolha e obter informações detalhadas sobre poluentes como PM2.5, PM10 e CO2.

## Tecnologias Utilizadas

- **Java** com **Spring Boot** para o backend.
- **Liquibase** para controle de versões do banco de dados.
- **MySQL** como sistema de gerenciamento de banco de dados.
- **Keycloak** para autenticação e controle de acesso (planejado para futuras versões).
- **API OpenAQ** para fornecimento de dados sobre a qualidade do ar.
- **Docker** para gerenciar containers, incluindo a execução do Keycloak.

## Funcionalidades

- Exibir a qualidade do ar em tempo real em diferentes localidades.
- Informações sobre os níveis de poluentes como:
  - **PM2.5**
  - **PM10**
  - **CO2**
- Consumo de dados da **API OpenAQ**.
- Filtro por localização escolhida pelo usuário.

