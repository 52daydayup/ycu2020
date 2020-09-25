package com.ycu.ycumall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ycu.ycumall.mapper")
public class YcuMallApplication {

    public static void main(String[] args) {
        SpringApplication.run(YcuMallApplication.class, args);
    }

}
