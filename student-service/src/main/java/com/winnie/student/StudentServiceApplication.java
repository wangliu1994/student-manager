package com.winnie.student;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//注意：早期的版本（Dalston及更早版本）还需在启动类上添加注解@EnableDiscoveryClient 或@EnableEurekaClient ，从Edgware开始，该注解可省略。
@EnableDiscoveryClient
//之前是，直接在Mapper类上面添加注解@Mapper，这种方式要求每一个mapper类都需要添加此注解，麻烦。
// 通过使用@MapperScan可以指定要扫描的Mapper类的包的路径,比如:
@MapperScan("com.winnie.student.dao")
@SpringBootApplication
//但是springboot项目中自定义的拦截器会被屏蔽. 所以只能改用使用@Configuration,配置注册为Bean的方式实现自定义filter,以下ServletComponentScan未生效
@ServletComponentScan("com.winnie.student.config")
public class StudentServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentServiceApplication.class, args);
    }

}
