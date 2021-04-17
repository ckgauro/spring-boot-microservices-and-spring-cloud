package com.appsdeveloperblog.app.ws.ui.controllers;

import com.appsdeveloperblog.app.ws.ui.model.request.UpdateUserDetailsRequestModel;
import com.appsdeveloperblog.app.ws.ui.model.request.UserDetailsRequestModel;
import com.appsdeveloperblog.app.ws.ui.model.response.UserRest;
import com.appsdeveloperblog.app.ws.userservice.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Chandra
 */
@Slf4j
@RestController
@RequestMapping("/users")
public class UserController {
    private final Map<String, UserRest> users = new HashMap<>();

    @Autowired
    UserService userService;

    @GetMapping
    public String getUsers(@RequestParam(value = "page", defaultValue = "1") int page,
                           @RequestParam(value = "limit", defaultValue = "50") int limit,
                           @RequestParam(value = "sort", defaultValue = "desc", required = false) String sort
    ) {
        return "get users was called with page =" + page + " and limit = " + limit +
                " and sort =" + sort;
    }


    @GetMapping(path = "/{userId}", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<UserRest> getUser(@PathVariable String userId) {
        if (users.containsKey(userId)) {
            return new ResponseEntity<>(users.get(userId), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<UserRest> createUser( @Valid @RequestBody UserDetailsRequestModel userDetailsRequestModel) {

        log.info("========userDetailsRequestModel===>");
        log.info(userDetailsRequestModel.toString());
        log.info("=============userDetailsRequestModel ends=======>");
        UserRest userRest = userService.createUser(userDetailsRequestModel);
        return new ResponseEntity<UserRest>(userRest, HttpStatus.OK);
    }

    @PutMapping(path = "/{userId}",produces ={MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},
            consumes ={MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE} )
    public ResponseEntity<UserRest> updateUser(@PathVariable String userId, @Valid @RequestBody UpdateUserDetailsRequestModel updateUserDetailsRequestModel){
        UserRest userRest=users.get(userId);
        userRest.setFirstName(updateUserDetailsRequestModel.getFirstName());
        userRest.setLastName(updateUserDetailsRequestModel.getLastName());
        users.put(userId, userRest);

        return new ResponseEntity<>(userRest , HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable String id){
        users.remove(id);
        return  ResponseEntity.noContent().build();
    }

    @GetMapping(path = "/test/{id}")
    public ResponseEntity<Void> test(@PathVariable String id){
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Error in update");
      //  return  ResponseEntity.noContent().build();
    }

}