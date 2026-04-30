# pix-api

API REST em Java para simular transações PIX, com foco em **idempotência** — garantindo que requisições duplicadas não gerem efeitos colaterais.

## Tecnologias

- Java 21
- Spring Boot 3.5
- Spring Data JPA + Hibernate
- PostgreSQL
- Flyway (migrações de banco)
- Lombok

## Pré-requisitos

- JDK 21
- PostgreSQL rodando em `localhost:5432`

## Configuração do banco

```sql
CREATE USER pix_user WITH PASSWORD 'pix_pass';
CREATE DATABASE pix_db OWNER pix_user;
```

Ou via Docker (reaproveitando um container existente):

```bash
docker exec <container> psql -U <admin_user> -c "CREATE USER pix_user WITH PASSWORD 'pix_pass';"
docker exec <container> psql -U <admin_user> -c "CREATE DATABASE pix_db OWNER pix_user;"
```

## Executando

```bash
./mvnw spring-boot:run
```

A aplicação sobe em `http://localhost:8080`.

## Variáveis de ambiente

As configurações padrão estão em `src/main/resources/application.yml`. Para sobrescrever:

| Variável | Padrão |
|---|---|
| `SPRING_DATASOURCE_URL` | `jdbc:postgresql://localhost:5432/pix_db` |
| `SPRING_DATASOURCE_USERNAME` | `pix_user` |
| `SPRING_DATASOURCE_PASSWORD` | `pix_pass` |

## Testes

```bash
./mvnw test
```
