package com.microserviceA.microserviceA;

import lombok.Data;
import lombok.Value;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name="User")
public class UserDto {
    @Id
    String userName;
    String password;
}
