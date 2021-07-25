package com.microserviceA.microserviceA;

import com.microserviceA.microserviceA.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/a")
public class HomeController {
    @Autowired
    UserServiceImpl userService;

    @GetMapping("/hello")
    String Welcome(){
        return "Welcome Microservice A";
    }

    @PostMapping("/user/registration")
    public UserDto registerUserAccount(@RequestBody UserDto userDto) {
           return  userService.registerNewUserAccount(userDto);
    }

    @PostMapping("/user/login")
    public Optional<UserDto> userLogin(@RequestBody UserDto userDto) {
        return  userService.Login(userDto);
    }
}