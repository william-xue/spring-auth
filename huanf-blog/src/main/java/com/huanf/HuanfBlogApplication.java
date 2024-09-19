package com.huanf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.huanf.mapper")
public class HuanfBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(HuanfBlogApplication.class,args);
    }
}