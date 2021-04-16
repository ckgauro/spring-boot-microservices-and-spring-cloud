package com.appsdeveloperblog.app.ws.userservice.impl;

import com.appsdeveloperblog.app.ws.shared.Utils;
import com.appsdeveloperblog.app.ws.ui.model.request.UserDetailsRequestModel;
import com.appsdeveloperblog.app.ws.ui.model.response.UserRest;
import com.appsdeveloperblog.app.ws.userservice.UserService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Chandra
 */

@Service
public class UserServiceImpl implements UserService {

    Map<String, UserRest> users;

    private final Utils utils;

    public UserServiceImpl(Utils utils) {
        this.utils = utils;
    }

    @Override
    public UserRest createUser(UserDetailsRequestModel userDetailsRequestModel) {
        UserRest returnValue = UserRest.builder()
                .email(userDetailsRequestModel.getEmail())
                .firstName(userDetailsRequestModel.getFirstName())
                .lastName(userDetailsRequestModel.getLastName())
                .userId(utils.generateUserId())
                .build();
        if(users==null)
            users=new HashMap<>();
        users.put(returnValue.getUserId(), returnValue);
        return returnValue;
    }
}
