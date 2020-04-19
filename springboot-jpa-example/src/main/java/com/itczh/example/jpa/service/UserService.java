package com.itczh.example.jpa.service;

import com.itczh.example.jpa.entity.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {

    void save(UserEntity userEntity);

    void update(UserEntity entity);

    void delete(Integer id);

    UserEntity getById(Integer id);

    List<UserEntity> listAll();

    Page<UserEntity> listByPage(Pageable pageable);
}
