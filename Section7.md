# Section7.md 

Zuul API Gateway

* chapter 51
https://github.com/simplyi/SpringCloudVideoCourse/tree/master/PhotoAppApiZuulAPIGateway

* Chapter 52

Modify in application.properties

spring.application.name=zuul
server.port=8011
eureka.client.serviceUrl.defaultZone = http://localhost:8010/eureka



Run Discover application , Account , Zulu and Users
> Run refresh Eureka  dashboard
> localhost:8010

> Check in console of Eureka discover it should register 
> localhost:8011/users-ws/status/check
> localhost:8011/account-ws/status/check