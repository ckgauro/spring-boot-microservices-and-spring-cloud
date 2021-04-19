# Spring Api Gateway 

* It is used for Load balancing

> localhost:8082/users-ws/users/status/check

* Modify in application properties
```
> server.port=8082 -->to run in 8082 port
> spring.application.name=api-gateway -> Name of API gateWay in eureka dashboard
> eureka.client.service-url.defaultZone=http://localhost:8010/eureka

> spring.cloud.gateway.discovery.locator.enabled=true --> To enable api gateway
> spring.cloud.gateway.discovery.locator.lower-case-service-id=true --> to disable lowercase url

 ```
# Chapter 62
* Manually Routing --ongoing 

```
* spring.cloud.gateway.routes[0].id=users-status-check  --> 
    > It create unique router id
* spring.cloud.gateway.routes[0].uri = lb://users-ws -->
    > It stores Eureka dashboard 
    > lb:->loadBalance
    > users-ws --> It is application name of micro services spring.application.name
* spring.cloud.gateway.routes[0].predicates[0]=Path=/users/status/check
    > It stores url path
* spring.cloud.gateway.routes[0].predicates[1]=Method=GET
    >  It stores method i.e. GET If  you want to additional method
* spring.cloud.gateway.routes[0].filters[0]=RemoveRequestHeader=Cookie
    > It remove remove request header  

```
# Chapter 63
* Manually Routing
> Restart all microservices 
> Browse -> http://localhost:8010/
> Open POSTMAN 
> [GET] http:localhost:8082/users/status/check

---------
# Chapter 64
* Manually Routing

``` 
* spring.cloud.gateway.routes[0].predicates[0]=Path=/users-ws/users/status/check
* spring.cloud.gateway.routes[0].filters[1]=RewritePath=/users-ws/(?<segment>.*), /$\{segment}
 > /users-ws/users/status/check to /users/status/check

```
> Restart all microservices
> Browse -> http://localhost:8010/
> Open POSTMAN
> [GET] http:localhost:8082/users-ws/users/status/check



