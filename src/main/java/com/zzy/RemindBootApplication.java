package com.zzy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zzy.mapper")
public class RemindBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(RemindBootApplication.class, args);
    }

}
