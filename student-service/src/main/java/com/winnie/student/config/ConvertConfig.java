package com.winnie.student.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : winnie
 * @date : 2019/4/4
 * @desc
 */
@Configuration
public class ConvertConfig extends WebMvcConfigurationSupport {
//    @Bean
//    public StringHttpMessageConverter stringHttpMessageConverter() {
//        StringHttpMessageConverter stringHttpMessageConverter = new StringHttpMessageConverter();
//        List<MediaType> supportedMediaTypes = new ArrayList<>();
//        supportedMediaTypes.add(MediaType.parseMediaType("text/html;charset=UTF-8"));
//        supportedMediaTypes.add(MediaType.parseMediaType("text/plain;charset=UTF-8"));
//        supportedMediaTypes.add(MediaType.parseMediaType("application/json;charset=UTF-8"));
//        stringHttpMessageConverter.setSupportedMediaTypes(supportedMediaTypes);
//        return stringHttpMessageConverter;
//    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("doc.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
        super.addResourceHandlers(registry);
    }
}