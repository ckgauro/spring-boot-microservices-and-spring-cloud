package com.appsdeveloperblog.app.ws.userservice;

import com.appsdeveloperblog.app.ws.ui.model.request.UserDetailsRequestModel;
import com.appsdeveloperblog.app.ws.ui.model.response.UserRest;

/**
 * @author Chandra
 */
public interface UserService {
    UserRest createUser(UserDetailsRequestModel userDetailsRequestModel);
}
