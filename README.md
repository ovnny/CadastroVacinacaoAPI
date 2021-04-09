<i>TEXTO DE BLOG SOBRE IDEALIZAÇÃO, PROCESSO E CONSTRUÇÃO DE UMA API DE VACINAÇÃO

## MODEL

	
	CadastroUsuario
	
		id
		nome
		email UNIQUE
		cpf	UNIQUE
		data_nascimento
		


	
	CadastroVacinacao
	
		label: CORONAVAC
		email_usuario
		data_vacinacao
		


## CONTROLLER

### Requisitos:

- Dois endpoints
- Cadastro do usuário
- Cadastro da aplicacao da vacina

> Caso a comunicação seja bem sucedida, retorna Status 201 'http'

> Caso não seja, retorna Status 400 'http'


## TECNOLOGIAS

		Java 	| 	Spring   | 	JPA	| 	Hibernate


## OBJETIVOS DO PROJETO

* Você está fazendo uma API REST que precisará controlar a aplicação de vacinas entre a população brasileira.

* O primeiro passo deve ser a construção de um cadastro de usuários, sendo obrigatórios dados como: nome, e-mail, CPF e data de nascimento, onde e-mail e CPF devem ser únicos.

* O segundo passo é criar um cadastro de aplicação de vacinas, sendo obrigatórios dados como: nome da vacina, e-mail do usuário e a data que foi realizada a vacina.


<b>Escrever um post de blog explicando de maneira detalhada tudo que você faria para implementar esse código.</b>

## PONTOS DE AVALIAÇÃO:

### OBRIGATÓRIOS:

No texto, queremos que você:

* Explique quais as tecnologias do mundo Spring você usaria;

* Conte qual o papel das tecnologias escolhidas e quais benefícios elas trazem para a implementação do código;

* Diga quais classes seriam criadas nesse processo e traga trechos autorais explicando a construção de cada classe do código;

* Explique as etapas do processo de construção do seu código e como faria a implementação do sistema na Web;

* Traga trechos de códigos autorais que justifiquem a implementação de cada tecnologia (não precisamos do código inteiro);

<i>Os itens acima são obrigatórios, mas não se limite. Se quiser escrever mais, fique à vontade (não existe quantidade máxima de páginas ou caracteres).</i>

### OPCIONAIS:

* Construir aplicação sem usar Lombok
* Substituir email do usuário na tabela de vacinação para uma chave estrangeira associada ao id do usuário


<i>OBS: TEXTO DEVE SER ENTREGUE EM FORMATO PDF PRAZO DE 7 DIAS. </i>


________________________________________________
																							 
entrega: dia 12 de abril de 2021

------------------------------------------------------------------------------------------------

				#############################################
				#############	INÍCIO DO PROJETO  	#########
				#############################################

------------------------------------------------------------------------------------------------


# API de vacinação - Zup Orange Talents


A API deverá ser estruturada com o architectural pattern MVC (n-tier)

## Layers:

	Configuration	|	Entities	|	Control	|	Service	|	DataBase

## Tipo de Aplicação:

	Web Service RESTfull - Modelo de Maturidade de Richardson

- Cliente Servidor;
- Stateless - não guarda estado no servidor - pode estar disponível em diferentes servidores - sempre disponível
- Cache;
- Interface Uniforme;
- Sistema em camadas - adicionar mais servidores à aplicação
- Código sob demanda;


## ARCHITECTURE MVC AND DESIGN


### Web Application Context - External Layer

	Controllers		|	View Resolver	|	Handler Mapping		| Locale Resolvers	| Beans

### MODEL

- A domain model consists of three different objects:

1) A domain service is a stateless class that provides operations which are related to a domain concept but aren’t a “natural” part of an entity or a value object.

2) An entity is an object that is defined by its identity which stays unchanged through its entire lifecycle.

3) A value object describes a property or a thing, and these objects don’t have their own identity or lifecycle. The lifecycle of a value object is bound to the lifecycle of an entity.

### DTO

- A data transfer object is an object that is just a simple data container, and these objects are used to carry data between different processes and between the layers of our application.
