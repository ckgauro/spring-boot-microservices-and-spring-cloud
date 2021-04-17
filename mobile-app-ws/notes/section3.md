# Chapter 20

* localhost:8080/users?page=1&limit=50
* localhost:8080/users?page=1
* localhost:8080/users?limit=50

> required = false doesn't work in primitive data type

# Chapter 22 and 23

* public ResponseEntity<UserRest> getUser(@PathVariable String userId)
----
in PostMan choose Headers
> Headers>accept= application/xml
> Headers>accept= application/json
in Pom.xml
> Add Jacson.xml to add xml format

<!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.dataformat/jackson-dataformat-xml -->
		<dependency>
			<groupId>com.fasterxml.jackson.dataformat</groupId>
			<artifactId>jackson-dataformat-xml</artifactId>
		</dependency>
---------------------
# Chapter 24
* ResponseEntity

# Chapter 25
* createUser
* [POST] localhost:8080/users  
* in PostMan choose Headers
> Headers>accept= application/xml
> content-Type= application/xml
* [POST] localhost:8080/users
* in PostMan choose Headers
> Headers>accept= application/json
> content-Type= application/json

> {
> "firstName":"Chandu",
> "lastName":"Chaud",
> "email":"abc@gmail.com"
> "password":"abc"
> }

# Chapter 26 & 27
* @Valid
> visit Apps developer blog.com
> Hibernate validation constraints

-> @NotNull and @Size
* [POST] localhost:8080/users
* in PostMan choose Headers
> Headers>accept= application/json
> content-Type= application/json
> {
> "firstName":"Chandu",
> "lastName":"Chaud",
> "email":"abc@gmail.com"
> "password":"abc"
> }
-------
* It should throws errors
-> To Do Task
  Pass wrong json data


----
* [GET] localhost:8080/users/[copy userid which is return while posting]
in PostMan choose Headers
> Headers>accept= application/xml
> Headers>accept= application/json

# Chapter 28
* updateUser
----
* [Put] localhost:8080/users/[copy userid which is return while posting]
  in PostMan choose Headers
> Headers>accept= application/xml
> Headers>accept= application/json

> {
> "firstName":"Aryan",
> "lastName":"GC"
> }

----

# Chapter 29
* [DELETE] localhost:8080/users/[copy userid which is return while posting]
* [GET] localhost:8080/users/[copy userid which is return while posting]
> It show return no content


----

# Chapter 30

* https://github.com/simplyi/mobile-app-ws-quick-start/blob/master/src/main/java/com/appsdeveloperblog/app/ws/exceptions/AppExceptionsHandler.java
* [GET] localhost:8080/users/[copy userid which is return while posting]
> Headers>accept= application/xml
> Headers>accept= application/json

----

# Chapter 31
* https://github.com/simplyi/mobile-app-ws-quick-start/blob/016f087382bf7e2760a29df95793a98a91b0c267/src/main/java/com/appsdeveloperblog/app/ws/ui/model/response/ErrorMessage.java#
* https://github.com/simplyi/mobile-app-ws-quick-start/blob/master/src/main/java/com/appsdeveloperblog/app/ws/exceptions/AppExceptionsHandler.java
* [GET] localhost:8080/users/[copy userid which is return while posting]
> Headers>accept= application/xml
> Headers>accept= application/json

----

# Chapter 33
* https://github.com/simplyi/mobile-app-ws-quick-start/blob/master/src/main/java/com/appsdeveloperblog/app/ws/exceptions/UserServiceException.java
* https://github.com/simplyi/mobile-app-ws-quick-start/blob/016f087382bf7e2760a29df95793a98a91b0c267/src/main/java/com/appsdeveloperblog/app/ws/ui/model/response/ErrorMessage.java#
* https://github.com/simplyi/mobile-app-ws-quick-start/blob/master/src/main/java/com/appsdeveloperblog/app/ws/exceptions/AppExceptionsHandler.java
* [GET] localhost:8080/users/[copy userid which is return while posting]
> Headers>accept= application/xml
> Headers>accept= application/json

----

----

# Chapter 33
* https://github.com/simplyi/mobile-app-ws-quick-start/blob/master/src/main/java/com/appsdeveloperblog/app/ws/exceptions/UserServiceException.java
* https://github.com/simplyi/mobile-app-ws-quick-start/blob/016f087382bf7e2760a29df95793a98a91b0c267/src/main/java/com/appsdeveloperblog/app/ws/ui/model/response/ErrorMessage.java#
* https://github.com/simplyi/mobile-app-ws-quick-start/blob/master/src/main/java/com/appsdeveloperblog/app/ws/exceptions/AppExceptionsHandler.java
* [GET] localhost:8080/users/[copy userid which is return while posting]
> Headers>accept= application/xml
> Headers>accept= application/json


# Chapter 34
* https://github.com/simplyi/mobile-app-ws-quick-start/blob/master/src/main/java/com/appsdeveloperblog/app/ws/exceptions/AppExceptionsHandler.java
* [GET] localhost:8080/users/[copy userid which is return while posting]
* public ResponseEntity<Object> handleSpecificExceptions(Exception ex, WebRequest request)
> Headers>accept= application/xml
> Headers>accept= application/json


----

# Chapter 35
* https://github.com/simplyi/mobile-app-ws-quick-start/blob/master/src/main/java/com/appsdeveloperblog/app/ws/ui/controllers/UserController.java
* https://github.com/simplyi/mobile-app-ws-quick-start/blob/016f087382bf7e2760a29df95793a98a91b0c267/src/main/java/com/appsdeveloperblog/app/ws/userservice/UserService.java#L6
* [GET] localhost:8080/users/[copy userid which is return while posting]
* public ResponseEntity<Object> handleSpecificExceptions(Exception ex, WebRequest request) 
> Headers>accept= application/xml
> Headers>accept= application/json

----------

# Chapter 36
* https://github.com/simplyi/mobile-app-ws-quick-start/blob/master/src/main/java/com/appsdeveloperblog/app/ws/ui/controllers/UserController.java
* https://github.com/simplyi/mobile-app-ws-quick-start/blob/016f087382bf7e2760a29df95793a98a91b0c267/src/main/java/com/appsdeveloperblog/app/ws/userservice/UserService.java#L6
* createUser
* [POST] localhost:8080/users
* in PostMan choose Headers
> Headers>accept= application/xml
> content-Type= application/xml
* [POST] localhost:8080/users
* in PostMan choose Headers
> Headers>accept= application/json
> content-Type= application/json

> {
> "firstName":"Chandu",
> "lastName":"Chaud",
> "email":"abc@gmail.com"
> "password":"abc"
> }

----------

# Chapter 37
* To run from command
* to build application
> Goto terminal
> mvn install
>> It will compile application
* to run application
> Goto target folder
> java -jar target/mobile-application-ws.jar

* Now test all method [GET,POST,PUT,DELETE]




