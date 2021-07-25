package com.microserviceA.microserviceA.repository;
import com.microserviceA.microserviceA.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserDto, String> {


    Optional<UserDto> findByUsernameAndPassWord(UserDto userDto);
}