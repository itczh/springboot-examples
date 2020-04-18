package com.chenzhenhu.springboot.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.chenzhenhu.springboot.mybatis.mapper")
public class MybatisConfiguration {
}
