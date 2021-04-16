package com.appsdeveloperblog.app.ws.shared;

import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author Chandra
 */
@Service
public class Utils {
    public String generateUserId(){
        return UUID.randomUUID().toString();
    }
}
