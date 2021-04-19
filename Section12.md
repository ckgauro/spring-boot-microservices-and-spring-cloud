# Section12 Not done

Chapter 72
https://github.com/simplyi/SpringCloudVideoCourse/tree/master/PhotoAppApiUsers
* Create user(sign-up)
* User Login( Sign-in or Authentication)
* Get User Details
* Update User
* Delete User

---------------------------

* Chapter 74 , 75 and 76 
```

https://github.com/simplyi/SpringCloudVideoCourse/blob/master/PhotoAppApiUsers/src/main/java/com/appsdeveloperblog/photoapp/api/users/ui/model/CreateUserRequestModel.java

https://github.com/simplyi/SpringCloudVideoCourse/blob/master/PhotoAppApiUsers/src/main/java/com/appsdeveloperblog/photoapp/api/users/ui/controllers/UsersController.java


@PostMapping
public String createUser(@valid @RequestBody CreateUserRequestModel userDetails){
    return "Create user method is called";
}

```
* Chapter 78 , 79 

```
https://github.com/simplyi/SpringCloudVideoCourse/tree/master/PhotoAppApiUsers/src/main/java/com/appsdeveloperblog/photoapp/api/users/shared

https://github.com/simplyi/SpringCloudVideoCourse/tree/master/PhotoAppApiUsers/src/main/java/com/appsdeveloperblog/photoapp/api/users/service


```
* Chapter 81

```
Update POM 
* add JPA , modelMapper


```
* Chapter 82, 83, 84

```

https://github.com/simplyi/SpringCloudVideoCourse/blob/master/PhotoAppApiUsers/src/main/java/com/appsdeveloperblog/photoapp/api/users/data/UserEntity.java
https://github.com/simplyi/SpringCloudVideoCourse/blob/master/PhotoAppApiUsers/src/main/java/com/appsdeveloperblog/photoapp/api/users/data/UsersRepository.java



```
* Chapter 84,85

```
--> [Test ]
PostMan
--> [POST]

```
*   url:[POST] localhost:8011/users-ws/users
*  [Body]
{
    "firstName":"Raj",
    "lastName":"tharu",
    "password":"1254654",
    "email":"test@gmail.com"
}

 url:[POST] localhost:8011/users-ws/h2-console

```

* Chapter 86

```
https://github.com/simplyi/SpringCloudVideoCourse/blob/master/PhotoAppApiUsers/src/main/java/com/appsdeveloperblog/photoapp/api/users/ui/model/CreateUserResponseModel.java

--> [Test ]
PostMan
--> [POST]

```
*   url:[POST] localhost:8011/users-ws/users
*  [Body]
{
    "firstName":"Raj",
    "lastName":"tharu",
    "password":"1254654",
    "email":"test@gmail.com"
}

 url:[POST] localhost:8011/users-ws/h2-console

```
* update chapter 87
```
Update POM 
* add spring security

--------------------
```
* update chapter 88
```
Update POM 
* 

```
https://github.com/simplyi/SpringCloudVideoCourse/blob/master/PhotoAppApiUsers/src/main/java/com/appsdeveloperblog/photoapp/api/users/security/WebSecurity.java
[revise it]

```

