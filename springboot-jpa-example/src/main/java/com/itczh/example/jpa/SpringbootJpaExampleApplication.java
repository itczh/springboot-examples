package com.itczh.example.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class SpringbootJpaExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootJpaExampleApplication.class, args);
    }
}
