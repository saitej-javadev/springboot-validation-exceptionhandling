package com.saitej.springboot.validationexceptionhandling.service;

import com.saitej.springboot.validationexceptionhandling.dto.UserRequest;
import com.saitej.springboot.validationexceptionhandling.entity.User;
import com.saitej.springboot.validationexceptionhandling.exception.UserNotFoundException;

import java.util.List;

public interface UserService {
    User saveUser(UserRequest user);
    User getUserById(Long id) throws UserNotFoundException;
    List<User> getAllUsers();
}
