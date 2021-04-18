package com.appsdeveloperblog.photoapp.api.users.ui.controllers;

import org.checkerframework.common.reflection.qual.GetClass;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chandra
 */
@RestController
@RequestMapping("/users")
public class UsersController {

    @GetMapping("/status/check")
    public String status(){
        return "working users";
    }
}
