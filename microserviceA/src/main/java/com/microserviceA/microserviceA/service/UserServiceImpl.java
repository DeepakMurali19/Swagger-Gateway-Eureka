package com.microserviceA.microserviceA.service;

import com.microserviceA.microserviceA.UserDto;
import com.microserviceA.microserviceA.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDto registerNewUserAccount(UserDto userDto) {
        return userRepository.save(userDto);
    }

    @Override
    public Optional<UserDto> Login(UserDto userDto) {
        return userRepository.findById(userDto.getUserName());
    }


    
}
