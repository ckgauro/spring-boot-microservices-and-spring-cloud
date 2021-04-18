# Chapter 42

* Users Microservice Responsibilities
> Create new user( Registration)
> User Login
> Get user details
> Update user details
> Delete user details

-----------

* Update application.properties

```
server.port=0
spring.application-.name=account-ws
eureka.client.serviceUrl.defaultZone =  http://localhost:8010/eureka
spring.devtools.restart.enabled=true

```
* Definition of each application properties.

-----------
# Chapter 43

* Add following code inside package com.appsdeveloperblog.photoapp.api.account.ui.controllers

```
@RestController
@RequestMapping("/account")
public class AccountController {

    @GetMapping("/status/check")
    public String status(){
        return  "working account...";
    }
}

```

> To Run Application run following applcaition
1. Eureka server -> photoappdiscoveryservice
2. Eureka client -> photoappapiusers with 2 instances
3. Eureka client -> photoappapiclient 

> To browse Application run following applcaition
1. Eureka Dashboard -> http://localhost:8010/
2. Eureka client -> http://192.168.0.8:55561/users/status/check
3. Eureka client -> http://192.168.0.8:55531/account/status/check
>> Note: Inside Eureka Dasboard
>>> Instances currently registered with Eureka


