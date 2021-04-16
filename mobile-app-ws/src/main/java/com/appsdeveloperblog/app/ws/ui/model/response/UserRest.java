package com.appsdeveloperblog.app.ws.ui.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Chandra
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UserRest {
    private String firstName;
    private String lastName;
    private String email;
    private String userId;
}
