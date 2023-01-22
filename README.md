# SpringBoot project with OIDC based SSO implementation

## How to use it?

### Setup
- Import the project in your favorite IDE as maven project
- Review and configure `src/main/resources/application.yml` with the OIDC client id and secret details

#### Callback urls
http://localhost:8080/login/oauth2/code/github
http://localhost:8080/login/oauth2/code/google
http://localhost:8080/login/oauth2/code/gluu

### Running the application
You can also build and run the process application with Spring Boot.

#### Manually
1. Build the application using:

```bash
mvn clean package
```
2. Run the *.jar file from the `target` directory using:

```bash
java -jar target/springboot-oidc-sso-0.0.1-SNAPSHOT.jar
```

For a faster 1-click (re-)deployment see the alternatives below.

#### Maven Spring Boot Plugin
1. Build and deploy the process application using:

```bash
mvn clean package spring-boot:run
```



### Experience it
The default redirect URI template is {baseUrl}/login/oauth2/code/{registrationId}

http://localhost:8080/

## OIDC Provider configuration

### Google


### Gluu


### GitHub


### Azure
- portal.azure.com
- App registration
- Add client credentials to generate secret.



## References
https://spring.io/guides/tutorials/spring-boot-oauth2/






