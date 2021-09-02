package com.example.javaspring.repository;

import com.example.javaspring.JavaspringApplication;
import com.example.javaspring.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class UserRepositoryTest extends JavaspringApplication {
    //Dependency Injection(DI) 스프링의 대표적인 기능, 의존성주입
    @Autowired
    private UserRepository userRepository;

    @Test
    public void create(){
        User user = new User();
        user.setAccount("TestUser01");
        user.setEmail("TestUser01@gmail.com");
        user.setPhoneNumber("010-1111-1111");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("amdin");


        //User newUser = userRepository.s
        //System.out.println("newUser : "+newUser);
    }
    public void read(){

    }
    public void update(){

    }
    public void delete(){

    }

}
