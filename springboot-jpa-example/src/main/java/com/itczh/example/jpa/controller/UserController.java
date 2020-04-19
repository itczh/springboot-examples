package com.itczh.example.jpa.controller;

import com.itczh.example.jpa.entity.UserEntity;
import com.itczh.example.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public UserEntity save(@RequestBody UserEntity userEntity) {
        userService.save(userEntity);
        return userEntity;
    }

    @PostMapping("/update")
    public UserEntity update(@RequestBody UserEntity userEntity) {
        userService.update(userEntity);
        return userEntity;
    }

    @PostMapping("/delete")
    public String delete(Integer id) {
        userService.delete(id);
        return "已删除";
    }

    @GetMapping("/{id}")
    public UserEntity get(@PathVariable Integer id) {
        return userService.getById(id);
    }

    @GetMapping("/all")
    public List<UserEntity> getAll() {
        return userService.listAll();
    }

    @GetMapping("/page/{page}/{size}")
    public Page<UserEntity> page(@PathVariable("page") int page, @PathVariable("size") int size ) {
        if (page < 0) {
            page = 0;
        }
        return userService.listByPage(PageRequest.of(page - 1, size));
    }

}
