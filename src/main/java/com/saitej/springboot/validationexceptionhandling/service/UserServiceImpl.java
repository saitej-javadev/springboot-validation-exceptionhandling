package com.saitej.springboot.validationexceptionhandling.service;

import com.saitej.springboot.validationexceptionhandling.dto.UserRequest;
import com.saitej.springboot.validationexceptionhandling.entity.User;
import com.saitej.springboot.validationexceptionhandling.exception.UserNotFoundException;
import com.saitej.springboot.validationexceptionhandling.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(UserRequest userRequest) {
        User user = modelMapper.map(userRequest, User.class);
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long id) throws UserNotFoundException {
        User user = userRepository.findById(id).orElse(null);
        if (user!=null){
            return user;
        }else{
            throw new UserNotFoundException("user not found with id: " +id);
        }
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
