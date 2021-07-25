package com.microserviceA.microserviceA.service;

import com.microserviceA.microserviceA.UserDto;

import java.util.Optional;

public interface UserService {
    UserDto registerNewUserAccount(UserDto userDto);

    Optional<UserDto> Login(UserDto userDto);


}
