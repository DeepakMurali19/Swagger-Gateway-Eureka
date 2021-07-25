package com.microserviceB.microserviceB;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/b")
public class HomeController {
    @GetMapping("/hello")
    String Welcome(){
        return "Welcome Microservice B";
    }
}