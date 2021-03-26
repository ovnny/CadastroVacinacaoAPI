# Primeira API REST DIO


## Projeto base:

- Desenvolvimento de testes unitários para validar uma API REST de gerenciamento de estoques de cerveja
- Digital Inovation One inc.
- Bootcamp Inter/Java

## Tecnologias Utilizadas:

OpenJDK-11 | Intellij-IDEA | PostgreSQL | JUnit5 | Mockito | Hamcrest | Maven | Spring

## Configurations:

Configuration - Swagger



1) Criar os profiles dev, prod e test
2) Persistência em disco para ambiente dev e test;
3) Banco em servidor ubuntu (KISS)
4) Api de gerenciamento de funcionários
* Model | Service | Controller | DTO? | JPA/H2
5) DB - id, nome, matrícula | active, acess, cpf

> segregate parts of your application configuration and make it be 
available only in certain environments. Any @Component or 
@Configuration can be marked with @Profile to limit when it is loaded

> You can use a spring.profiles.active Environment property to specify
> which profiles are active.

    spring.profiles.active=dev,hsqldb

    specify it on the command line using the following switch: --spring.profiles.active=dev,hsqldb.
   
   
   
Rascunhos
==================================================================

Primeiro iremos configurar os profiles pra definir o escopo de cada parte da aplicação baseada no estado atual definido pelo application.properties.

### application.properties


	spring.profiles.active=dev
	spring.application.name=Profiles
	app.message=Setup primary configuration and checking profiles for ${spring.application.name}
	

### application-dev.properties
	
	### DEV ENVIRONMENT SETTINGS ###
	
	app.message=Now ${spring.application.name} in development mode - DEV ENVIRONMENT.
	
	spring.datasource.driver-class-name=org.h2.Driver 
	spring.datasource.url=jdbc:h2:mem:db;DB_CLOSE_DELAY=-1
	spring.datasource.username=ovnny
	spring.datasource.password=db123
	
	// H2 configuration for dev env
	

### application-test.properties

	### TEST ENVIRONMENT SETTINGS ###
	
	app.message=Now ${spring.application.name} in test mode - TEST ENVIRONMENT.
	
	spring.datasource.driver-class-name={ postgresName } 
	spring.datasource.url={ jdbc-postgres-host-url }
	spring.datasource.username=<USERNAME>
	spring.datasource.password=<SECRET>

### application-prod.properties

	### PROD ENVIRONMENT SETTINGS ###
	
	app.message=Now ${spring.application.name} in production mode - PROD ENVIRONMENT.
	
	spring.datasource.driver-class-name={ postgresName } 
	spring.datasource.url={ jdbc-postgres-host-url }
	spring.datasource.username=<USERNAME-PROD>
	spring.datasource.password=<SECRET_PASS>





