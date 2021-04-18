Section 4
https://github.com/simplyi/SpringCloudVideoCourse/tree/master/PhotoAppDiscoveryService

# Chapter 38
* Eureka Discovery Service

# chapter 39
Spring Cloud Netflix eureka
* Pom

> server.port=8010
> eureka.client.registerWithEureka=false
> eureka.client.fetchRegistry=false

> logging.level.com.netflix.eureka=OFF
> logging.level.com.netflix.discovery=OFF

> spring.application.name=discoveryservice

* To Fetch Eureka Dashboard
> localhost:8010
----------
* To use new Eureka Cloud version modify in POM file
```
<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.3.5.RELEASE</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>
```
```
<properties>
		<java.version>11</java.version>
		<spring-cloud.version>Hoxton.SR9</spring-cloud.version>
	</properties>
```
<dependency>
  <groupId>org.springframework.cloud</groupId>
  <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
</dependency>