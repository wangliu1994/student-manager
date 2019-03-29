package com.winnie.gateway;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : winnie
 * @date : 2019/3/28
 * @desc
 */
@Component
@Primary
public class SwaggerProvider implements SwaggerResourcesProvider {
    private static final String API_URI = "/v2/api-docs";

    @Override
    public List<SwaggerResource> get() {
        List<SwaggerResource> resources = new ArrayList<>();
        resources.add(swaggerResource("学生系统","STUDENT-SERVICE"));
        resources.add(swaggerResource("教师系统","TEACHER-SERVICE"));
        resources.add(swaggerResource("注册系统","EUREKA-SERVICE"));
        return resources;
    }

    private SwaggerResource swaggerResource(String name, String location) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location + API_URI);
        swaggerResource.setSwaggerVersion("2.0");
        return swaggerResource;
    }
}
