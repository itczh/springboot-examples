package com.itczh.example.jpa;

import com.itczh.example.jpa.entity.UserEntity;
import com.itczh.example.jpa.repostioy.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootJpaExampleApplicationTests {

    @Autowired
    private UserRepository userRepository;
    @Test
    public void contextLoads() {
    }

    @Test
    public void testSelect() {
        UserEntity userEntity = userRepository.getOne(1);
        System.out.println(userEntity.getName());
    }
}
