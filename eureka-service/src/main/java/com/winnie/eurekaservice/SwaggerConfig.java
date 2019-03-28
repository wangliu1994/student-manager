package com.winnie.eurekaservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author : winnie
 * @date : 2019/3/27
 * @desc
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket SWApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("学生管理系统")
                .description("学生在校信息管理")
                .termsOfServiceUrl("http://127.0.0.1:8081/")
                .contact(new Contact("winnie", "winnie.com", "wangliu023@qq.com"))
                .version("1.0")
                .build();
    }
}
