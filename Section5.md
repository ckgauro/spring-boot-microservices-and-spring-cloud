# SEction 5

https://github.com/simplyi/SpringCloudVideoCourse/tree/master/PhotoAppApiUsers

Chp 43
https://github.com/simplyi/SpringCloudVideoCourse/blob/master/PhotoAppApiUsers/src/main/resources/application.properties

----------
Ch 44
https://github.com/simplyi/SpringCloudVideoCourse/blob/master/PhotoAppApiUsers/src/main/java/com/appsdeveloperblog/photoapp/api/users/ui/controllers/UsersController.java
    @GetMapping("/status/check")
	public String status()
	{
		return "Working on port " + env.getProperty("local.server.port") + ", with token = " + env.getProperty("token.secret");
	}
--------
ch 45
* Run both server could and client
> localhost:8010

** If you will find users-ws 
> Click on that
> localhost 192.168.2.81:895/users/status/check



