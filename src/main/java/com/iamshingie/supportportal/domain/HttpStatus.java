package com.iamshingie.supportportal.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class HttpStatus {
    private Date timestamp;
    private int HttpStatusCode;
    private HttpStatus httpStatus;
    private String message;
    private String reason;

    public HttpStatus(int httpStatusCode, HttpStatus httpStatus, String message, String reason) {
        this.timestamp = new Date();
        HttpStatusCode = httpStatusCode;
        this.httpStatus = httpStatus;
        this.message = message;
        this.reason = reason;
    }
}
