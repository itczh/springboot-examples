package com.chenzhenhu.springboot.mybatis.mapper;

import com.chenzhenhu.springboot.mybatis.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    int insert(UserEntity entity);

    int update(UserEntity entity);

    int delete(Long id);

    UserEntity selectById(Long id);

    @Select("select id, name, email from user where name = #{0}")
    UserEntity selectByName(String name);

    List<UserEntity> selectList(@Param("condition") UserEntity entity);
}
