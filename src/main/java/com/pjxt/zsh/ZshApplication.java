package com.pjxt.zsh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.pjxt.zsh.dao")
public class ZshApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZshApplication.class, args);
    }
}
