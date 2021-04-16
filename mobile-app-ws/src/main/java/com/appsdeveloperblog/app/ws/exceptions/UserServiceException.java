package com.appsdeveloperblog.app.ws.exceptions;

import org.apache.catalina.User;

/**
 * @author Chandra
 */
public class UserServiceException  extends RuntimeException{
    private static final long serialVersionUID=1348771109171435607L;
    public UserServiceException(String  message){
        super(message);
    }
}
