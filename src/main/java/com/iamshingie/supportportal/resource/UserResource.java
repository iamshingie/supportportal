package com.iamshingie.supportportal.resource;

import com.iamshingie.supportportal.domain.User;
import com.iamshingie.supportportal.exception.ExceptionHandling;
import com.iamshingie.supportportal.exception.domain.EmailExistException;
import com.iamshingie.supportportal.exception.domain.UserNotFoundException;
import com.iamshingie.supportportal.exception.domain.UsernameExistException;
import com.iamshingie.supportportal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserResource extends ExceptionHandling {
    private final UserService userService;

    @Autowired
    public UserResource(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user) throws UserNotFoundException, EmailExistException, UsernameExistException {
     User newUser = userService.register(user.getFirstName(),user.getLastName(),user.getUsername(),user.getEmail());
     return new ResponseEntity<>(newUser, HttpStatus.OK);
    }
}
