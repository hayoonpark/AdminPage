package com.example.study.repository;

import com.example.study.StudyApplication;
import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.User;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

@Ignore
public class UserRepositoryTest extends StudyApplicationTests {

    // DI, Dependency Injection (의존성 주입)
    @Autowired
    private UserRepository userRepository;

    @Test

    public void create() {
        // String sql = insert into user (%s, %s, %d) value (account, eamil, age);
        User user = new User();
        user.setAccount("TestUser03");
        user.setEmail("TestUser03@gmail.com");
        user.setPhoneNumber("010-1111-3333");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("TestUser3");

        User newUser = userRepository.save(user);
        System.out.println("newUser : " + newUser);
    }

    public void read(){

    }

    public void update(){

    }

    public void delete(){

    }
}
