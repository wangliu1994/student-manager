package com.winnie.teacher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

//注意：早期的版本（Dalston及更早版本）还需在启动类上添加注解@EnableDiscoveryClient 或@EnableEurekaClient ，从Edgware开始，该注解可省略。
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.winnie.teacher.dao")
public class TeacherServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeacherServiceApplication.class, args);
    }

}
