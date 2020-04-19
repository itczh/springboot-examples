package com.itczh.example.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.itczh.example.mybatis.mapper")
public class MybatisConfiguration {
}
