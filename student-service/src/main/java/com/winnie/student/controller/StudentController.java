package com.winnie.student.controller;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigService;
import com.winnie.student.dto.StudentDto;
import com.winnie.student.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : winnie
 * @date : 2019/3/26
 * @desc
 */
@RestController
@RequestMapping("/student")
@Api(tags = "学生信息管理")
public class StudentController {

    @Resource
    private StudentService studentServices;

    @GetMapping("/hello")
    @ApiOperation(value = "问候接口", notes = "问候")
    public String hello() {
        Config config = ConfigService.getAppConfig(); //config instance is singleton for each namespace and is never null
        String someKey = "winnieKey";
        String someDefaultValue = "defaultValue";
        String value = config.getProperty(someKey, someDefaultValue);

        return "Hello, I am a Student, your value is: " + value;
    }

    @GetMapping("/getAll")
    @ApiOperation(value = "获取学生列表")
    public List<StudentDto> getAll() {
        return studentServices.getAll();
    }

    @PostMapping("/addStudent")
    @ApiOperation(value = "新增学生信息")
    public String addStudent(@RequestBody StudentDto student){
        return studentServices.add(student);
    }
}
