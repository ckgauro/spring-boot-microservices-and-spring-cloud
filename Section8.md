# Section8.md 

Zuul API Gateway
----------------------
Chapter 56

* Run two times micro services PhotoAppApiUsers

* in PhotoAppApiUsers modify application properties to generate random instance name
> eureka.instance.instance-id=${spring.application.name}:${spring.application.instance_id:${random.value}}
> server.port=${PORT:0}

* Now restart all the services

Run Discover application , Account , Zulu and Users
> Run refresh Eureka  dashboard
> localhost:8010


* Goto Terminal of PhotoAppApiUsers
> mvn  spring-boot:run -Dspring-boot-run.arguments--spring.application.instance_id=gauro


> Run refresh Eureka  dashboard
> localhost:8010

* Goto Terminal of PhotoAppApiUsers
> mvn  spring-boot:run -Dspring-boot-run.arguments--spring.application.instance_id=gauro2,--server.port=8999

> Run refresh Eureka  dashboard
> localhost:8010

-----------------

Chapter 57


* in PhotoAppApiUsers modify application properties to generate random instance name
* @Autowired
	private Environment env;

> Run refresh Eureka  dashboard
> localhost:8010

* localhost:8011/users-us/users/status/check 
refresh above link to see different port