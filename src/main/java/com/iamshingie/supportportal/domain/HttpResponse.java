package com.iamshingie.supportportal.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.util.Date;

@Data
@NoArgsConstructor
public class HttpResponse {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss", timezone = "Africa/Harare")
    private Date timestamp;
    private int httpStatusCode;
    private HttpStatus httpStatus;
    private String message;
    private String reason;

    public HttpResponse(int httpStatusCode, HttpStatus httpStatus, String message, String reason) {
        this.timestamp = new Date();
        this.httpStatusCode = httpStatusCode;
        this.httpStatus = httpStatus;
        this.message = message;
        this.reason = reason;
    }
}
