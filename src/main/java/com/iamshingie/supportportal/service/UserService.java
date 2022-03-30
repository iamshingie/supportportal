package com.iamshingie.supportportal.service;

import com.iamshingie.supportportal.domain.User;
import com.iamshingie.supportportal.exception.domain.EmailExistException;
import com.iamshingie.supportportal.exception.domain.UserNotFoundException;
import com.iamshingie.supportportal.exception.domain.UsernameExistException;

import java.util.List;

public interface UserService {

    User register(String firstName, String lastName, String username, String email) throws UserNotFoundException, EmailExistException, UsernameExistException;

    List<User> getUsers();

    User findUserByUsername(String username);

    User findUserByEmail(String email);

}
