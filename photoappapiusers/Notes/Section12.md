# Chapter 72 --not done
* Ading support for the H2 database in 
* Update maven
<!-- https://mvnrepository.com/artifact/com.h2database/h2 -->
		<dependency>
			<groupId>com.h2database</groupId>
			<artifactId>h2</artifactId>
			<scope>runtime</scope>
		</dependency>

* Update in application.properties file
spring.h2.console.enabled=true
spring.h2.console.settings.web-allow-others=true


-----------------

Now Broswer H2database spring gateapi using  

localhost:8082/users-ws/h2-console
