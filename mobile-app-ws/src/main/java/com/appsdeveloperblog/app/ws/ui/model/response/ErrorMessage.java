package com.appsdeveloperblog.app.ws.ui.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Chandra
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorMessage {
    private Date timeStamp;
    private String message;
}
