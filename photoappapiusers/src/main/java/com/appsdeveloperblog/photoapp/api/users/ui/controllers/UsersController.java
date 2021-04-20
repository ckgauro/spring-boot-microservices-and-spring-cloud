package com.appsdeveloperblog.photoapp.api.users.ui.controllers;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chandra
 */
@RestController
@RequestMapping("/users")
public class UsersController {

    private final Environment environment;

    public UsersController(Environment environment) {
        this.environment = environment;
    }

    @GetMapping("/status/check")
    public String status(){
        return "working on port "+environment.getProperty("local.server.port")+", with token ="+environment.getProperty("token.secret");
    }
}
