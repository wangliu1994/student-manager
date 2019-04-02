package com.winnie.student;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;

import java.util.ArrayList;
import java.util.List;

/**
 * description web配置
 */
@Configuration
public class ConvertConfig {

    /**
     * stringHttpMessageConverter
     * @return StringHttpMessageConverter
     */
//    @Bean
//    public StringHttpMessageConverter stringHttpMessageConverter() {
//        StringHttpMessageConverter stringHttpMessageConverter = new StringHttpMessageConverter();
//        List<MediaType> supportedMediaTypes = new ArrayList();
//        supportedMediaTypes.add(MediaType.parseMediaType("text/html;charset=UTF-8"));
//        supportedMediaTypes.add(MediaType.parseMediaType("text/plain;charset=UTF-8"));
//        supportedMediaTypes.add(MediaType.parseMediaType("application/json;charset=UTF-8"));
//        stringHttpMessageConverter.setSupportedMediaTypes(supportedMediaTypes);
//        return stringHttpMessageConverter;
//    }

    @Bean
    public HttpMessageConverters fastJsonHttpMessageConverters() {
        // 1.定义一个converters转换消息的对象
        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
        // 2.添加fastjson的配置信息，比如: 是否需要格式化返回的json数据
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
        // 3.在converter中添加配置信息
        fastConverter.setFastJsonConfig(fastJsonConfig);
        // 4.将converter赋值给HttpMessageConverter
        HttpMessageConverter<?> converter = fastConverter;
        // 5.返回HttpMessageConverters对象
        return new HttpMessageConverters(converter);
    }
}