package com.itczh.example.mybatis.mapper;

import com.itczh.example.mybatis.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    int insert(UserEntity entity);

    int update(UserEntity entity);

    int delete(Long id);

    UserEntity selectById(Long id);

    @Select("select id, name, email from user where name = #{0}")
    UserEntity selectByName(String name);

    List<UserEntity> selectList(@Param("condition") UserEntity entity);
}
