package com.haihai.selfwriting01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.haihai.selfwriting01.mapper")
@SpringBootApplication
public class SelfWriting01Application {

    public static void main(String[] args) {
        SpringApplication.run(SelfWriting01Application.class, args);
    }

}
