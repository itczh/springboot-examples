package com.chenzhenhu.springboot.mybatis;

import com.chenzhenhu.springboot.mybatis.entity.UserEntity;
import com.chenzhenhu.springboot.mybatis.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisSimpleApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testInsert() {
        UserEntity entity = new UserEntity();
        entity.setName("test1");
        entity.setEmail("test1@qq.com");
        userMapper.insert(entity);
    }

    @Test
    public void testUpdate() {
        UserEntity entity = new UserEntity();
        entity.setId(1L);
        entity.setName("test2");
        entity.setEmail("test3@qq.com");
        userMapper.update(entity);
    }

    @Test
    public void testDelete() {
        userMapper.delete(1L);
    }

    @Test
    public void testSelect() {
        UserEntity entity = userMapper.selectByName("test1");
        System.out.println(entity.getName());

        List<UserEntity> list = userMapper.selectList(entity);
        for (UserEntity user : list) {
            System.out.println(user.getName());
        }
    }
}
