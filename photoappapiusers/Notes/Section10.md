# chapter 68  --Done

mvn spring-boot:run -Dspring-boot.run.arguments=--spring.application.instance_id=chand
mvn spring-boot:run -Dspring-boot.run.arguments="--spring.application.instance_id=chand2 --server.port=8999"

mvn spring-boot:run -Dspring-boot.run.arguments="--server.port=8999 --spring.application.instance_id=dhn"

--------------
# chapter 69

in UsersController

@Autowired
private Environment env;


Now test browser 

