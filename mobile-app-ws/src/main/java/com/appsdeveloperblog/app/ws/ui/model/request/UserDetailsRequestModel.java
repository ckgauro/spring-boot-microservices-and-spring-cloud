package com.appsdeveloperblog.app.ws.ui.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Chandra
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDetailsRequestModel {

    @NotNull(message = "First name cannot be null")
    @Size(min=2, message = "First name must not be less than 2 characters")
    private  String firstName;


    private String lastName;

    private String email;

    private String password;

}
