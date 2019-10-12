# Spring Postgres - Starter Pack

## Requirements

For building and running the application you need:

- JDK >= 1.8
- Docker

## Building and Running

```bash
mvn clean install
```

Build the app container: 

```bash
docker build -t starterpack/spring-boot-postgres .
```

Run postgres and app containers:

```bash
docker-compose up
```

## Test if everything is OK

Create new model:

```bash
curl -X POST \
  http://localhost:8080/model \
  -d '{
	"id": 1,
	"handle": "starterpack"
}'
```

Get created model:

```bash
curl -X GET http://localhost:8080/model/1
```
