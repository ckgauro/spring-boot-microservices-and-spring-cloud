Section 4 
https://github.com/simplyi/SpringCloudVideoCourse/tree/master/PhotoAppDiscoveryService

# Chapter 38
* Eureka Discovery Service

# chapter 39
Spring Cloud Netflix eureka
* Pom

server.port=8010
eureka.client.registerWithEureka=false
eureka.client.fetchRegistry=false

logging.level.com.netflix.eureka=OFF
logging.level.com.netflix.discovery=OFF

spring.application.name=discoveryservice


localhost:8010

<dependency>
  <groupId>org.springframework.cloud</groupId>
  <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
</dependency>