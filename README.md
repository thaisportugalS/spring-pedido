# Sistema de Pedidos com Kafka, MongoDB e Spring Boot

Este é um sistema de pedidos simples implementado com **Spring Boot**, **Apache Kafka**, e **MongoDB**. A arquitetura utilizada é **Hexagonal**, permitindo a comunicação assíncrona entre os componentes de criação de pedidos e processamento dos mesmos. O sistema é desenvolvido em **Java 17** e gerido com **Maven**.

## Funcionalidades

- **Criação de pedidos**: Permite criar um novo pedido através de um endpoint REST.
- **Consulta de status de pedidos**: Permite consultar o status de um pedido (ex: AGUARDANDO_ENVIO, ENVIADO_TRANSPORTADORA).
- **Integração com Kafka**: A cada novo pedido, uma mensagem é publicada em um tópico Kafka.
- **Processamento assíncrono**: Um consumidor Kafka lê a mensagem, atualiza o status do pedido no MongoDB para `ENVIADO_TRANSPORTADORA`.

## Arquitetura

- **MongoDB**: Usado para armazenar os pedidos e seus status.
- **Kafka**: Usado para comunicação assíncrona entre a criação e o processamento do pedido.
- **Spring Boot**: Framework utilizado para a construção do microserviço, seguindo a arquitetura Hexagonal.

## Tecnologias

- **Spring Boot** 3.0.0
- **Apache Kafka** 3.x
- **MongoDB** 6.x
- **Java 17**
- **Maven**

## Docker Compose

O projeto inclui um arquivo `docker-compose.yml` para facilitar a configuração dos serviços de **Zookeeper**, **Kafka**, **MongoDB** e **Schema Registry** (se necessário para seu caso).

## Pré-requisitos

- **Docker** e **Docker Compose** instalados
- **Java 17** instalado

## Configuração

### 1. Clonar o repositório

Clone o repositório do projeto:

```bash
git clone https://github.com/seu-usuario/spring-pedido.git
cd spring-pedido
