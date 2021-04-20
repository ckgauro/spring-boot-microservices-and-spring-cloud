# Chapter 41 --done

* Users Microservice Responsibilities
> Create new user( Registration)
> User Login
> Get user details
> Update user details
> Delete user details

-----------

* Update application.properties

```
server.port=${PORT:0}
spring.application.name=users-ws
eureka.client.serviceUrl.defaultZone = http://localhost:8010/eureka
spring.devtools.restart.enabled = true
eureka.instance.instance-id=${spring.application.name}:${spring.application.instance_id:${random.value}}

```
* Definition of each application properties.

> Add @EnableDiscoveryClient -> in PhotoAppApiUsersApplicaiton 
> server.port=${PORT:0}  --> Generate and assigned Random port
> spring.application.name=users-ws --> To set application name
> eureka.client.serviceUrl.defaultZone = http://localhost:8010/eureka --> Main discovery client server
> spring.devtools.restart.enabled = true --> To enable debug mode
> eureka.instance.instance-id=${spring.application.name}:${spring.application.instance_id:${random.value}} -->To generate Random id

-----------
# Chapter 42

* Add following code inside package com.appsdeveloperblog.photoapp.api.users.ui.controllers

```
@RestController
@RequestMapping("/users")
public class UsersController {

    @GetMapping("/status/check")
    public String status(){
        return "working users";
    }
}

```

> To Run Application run following applcaition 
1. Eureka server -> photoappdiscoveryservice 
2. Eureka client -> photoappapiusers 

> To browse Application run following applcaition
1. Eureka Dashboard -> http://localhost:8010/
2. Eureka client -> http://192.168.0.8:55561/users/status/check
>> Note: Inside Eureka Dasboard 
>>> Instances currently registered with Eureka


