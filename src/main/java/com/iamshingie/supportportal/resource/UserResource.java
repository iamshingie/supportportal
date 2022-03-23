package com.iamshingie.supportportal.resource;

import com.iamshingie.supportportal.exception.ExceptionHandling;
import com.iamshingie.supportportal.exception.domain.EmailExistException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserResource extends ExceptionHandling {

    @GetMapping("/home")
    public String showUser() throws EmailExistException{
        throw new EmailExistException("This email address is already taken");
    }
}
