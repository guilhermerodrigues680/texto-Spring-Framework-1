# Texto Spring Framework 1

### Spring Framework

[spring.io](https://spring.io/)

Site do framework, contém informações, guias e documentação.

---

### Spring Initializr

[start.spring.io](https://start.spring.io/)

Site para gerar uma aplicação com Spring Boot.

- Spring Boot

#### Spring e Spring Boot

Spring é um framework usado no java que resolve diversos problemas utilizando técnicas, como injeção de dependência, inversão de controle,contêiner e etc… No caso, para implementar ele em seu projeto é necessário fazer diversas configurações, por exemplo: se quisemos fazer com que o spring converse com jpa e hibernate, há inúmeras configurações que devemos fazer. Com este problema em mente surgiu o spring boot que venho para resolver as múltiplas configurações básicas necessárias, você especifica o que você quer em seu projeto e ele já monta com tudo configurado.

#### Spring Boot e Dependecias

- Spring Web (RestFul App e Apache Tomcat)
- JDBC
- MySql Driver, Oracle Drive, PostgreSql Drive, etc
- Spring Data JPA (Spring Data e Hibernate)
- Lombok (Reduz código boilerplate)
- Spring Security (Autenticação e Autorização, adaptável para usar JWT)

#### Spring Initializr e cURL

```sh
# Faca uma requisicao no https://start.spring.io/ para detalhes e exemplos
curl https://start.spring.io/
```

---

### Comandos uteis do Maven e Java

- `./mvnw spring-boot:run` ->  Inicia a aplicação do Spring Boot.
- `./mvnw clean` -> Limpa a pasta de compilação do projeto (target)
- `./mvnw package` -> Compila e empacota o projeto usando o empacotamento escolhido, por exemplo, em JAR. E salva na pasta de compilação do projeto (target).
- `./mvnw clean package` -> Limpa a pasta de compilacao do projeto e em seguida compila e empacota o projeto.
- `java -jar app-version.jar` -> Executa a aplicação empacotada usando o JRE.

``

---

### IntelliJ IDEA Community Edition

[www.jetbrains.com/pt-br/idea](https://www.jetbrains.com/pt-br/idea/)

Uma ótima IDE para desenvolvimento

- Para desenvolvimento JVM e Android
- Open source gratuito

A Community Edition é open source, licenciada no Apache 2.0. Projetos como o Android e o Swift usam o Apache 2.0 e, portanto, você está em boa companhia. Ela também pode ser usada para desenvolvimento comercial.

---

### Parte 1 - Projeto com Spring Boot sem dependencias

Projeto default do Spring Boot

[start.spring.io](https://start.spring.io/)

```sh
curl https://start.spring.io/starter.zip -d baseDir=demo -o demo.zip

# ou passando todos os paramentros

curl https://start.spring.io/starter.zip \
    -d applicationName=DemoApplication \
    -d artifactId=demo \
    -d baseDir=demo \
    -d bootVersion=2.4.0 \
    -d description="Demo project for Spring Boot" \
    -d groupId=com.example \
    -d javaVersion=11 \
    -d language=java \
    -d name=demo \
    -d packageName=com.example.demo \
    -d packaging=jar \
    -d type=maven-project \
    -d version=0.0.1-SNAPSHOT \
    -o demo.zip
```

---

### Parte 2 - Projeto com Spring Boot e Spring Web

[start.spring.io](https://start.spring.io/)

```sh
curl https://start.spring.io/starter.zip -d dependencies=web -d baseDir=demo -o demo.zip

# ou passando todos paramentros

curl https://start.spring.io/starter.zip \
    -d dependencies=web \
    -d applicationName=WebappApplication \
    -d artifactId=webapp \
    -d baseDir=webapp \
    -d bootVersion=2.4.0 \
    -d description="Webapp com Spring Boot" \
    -d groupId=com.example \
    -d javaVersion=11 \
    -d language=java \
    -d name=webapp \
    -d packageName=com.example.webapp \
    -d packaging=jar \
    -d type=maven-project \
    -d version=0.0.1-SNAPSHOT \
    -o webapp.zip
```

---
