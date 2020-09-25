package com.ycu.ycumybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ycu.ycumybatis.mapper")
public class YcuMybatisApplication {

    public static void main(String[] args) {

        SpringApplication.run(YcuMybatisApplication.class, args);
    }

}
