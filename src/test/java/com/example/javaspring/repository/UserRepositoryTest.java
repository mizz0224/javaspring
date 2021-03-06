package com.example.javaspring.repository;


import com.example.javaspring.JavaspringApplication;
import com.example.javaspring.model.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
@RunWith(SpringRunner.class)
public class UserRepositoryTest extends JavaspringApplication{
    //Dependency Injection(DI) 스프링의 대표적인 기능, 의존성주입
    @Autowired

    private UserRepository userRepository;


    @Test
    public void create(){
        User user = new User();
        user.setAccount("TestUser03");
        user.setEmail("TestUser03@gmail.com");
        user.setPhoneNumber("010-1111-3333");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("TestUser3");
        User user1 = new User(2147483648L,"TestUser03","TestUser03@gmail.com","010-1111-3333",LocalDateTime.now(),"TestUser3",LocalDateTime.now(),"TestUser3");
        User newUser = userRepository.save(user);
        System.out.println("newUser : "+newUser);
        //System.out.println(user1);
        //System.out.println(LocalDateTime.now());
    }
    public void read(){

    }
    public void update(){

    }
    public void delete(){

    }

}
