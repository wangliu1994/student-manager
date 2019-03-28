package com.winnie.teacherservice;

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
@RequestMapping("/teacher")
@Api(tags = "教师信息管理")
public class TeacherController {

    @GetMapping("/helloName")
    @ApiOperation(value = "问候接口", notes = "问候")
    public String hello(String name) {
        return "Hello, " + name;
    }
}
