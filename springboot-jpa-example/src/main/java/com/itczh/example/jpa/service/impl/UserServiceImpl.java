package com.itczh.example.jpa.service.impl;

import com.itczh.example.jpa.entity.UserEntity;
import com.itczh.example.jpa.repostioy.UserRepository;
import com.itczh.example.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(UserEntity userEntity) {
        userRepository.save(userEntity);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(UserEntity entity) {
        userRepository.save(entity);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserEntity getById(Integer id) {
        return userRepository.getOne(id);
    }

    @Override
    public List<UserEntity> listAll() {
        return userRepository.findAll();
    }

    @Override
    public Page<UserEntity> listByPage(Pageable pageable) {
        return userRepository.findAll(pageable);
    }
}
