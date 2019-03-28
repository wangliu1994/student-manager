package com.winnie.studentservice;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : winnie
 * @date : 2019/3/26
 * @desc
 */
@RestController
@RequestMapping("/student")
@Api(tags = "学生信息管理")
public class StudentController {

    @GetMapping("/hello")
    @ApiOperation(value = "问候接口", notes = "问候")
    public String hello() {
        Config config = ConfigService.getAppConfig(); //config instance is singleton for each namespace and is never null
        String someKey = "winnieKey";
        String someDefaultValue = "defaultValue";
        String value = config.getProperty(someKey, someDefaultValue);

        return "Hello, I am a Student, your value is: " + value;
    }

    @GetMapping("/helloName")
    @ApiOperation(value = "传入姓名问候接口", notes = "问候")
    public String hello(String name) {
        return "Hello, " + name;
    }
}
