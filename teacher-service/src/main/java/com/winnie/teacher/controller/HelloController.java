package com.winnie.teacher.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : winnie
 * @date : 2019/4/1
 * @desc
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    @ApiOperation(value = "问候接口", notes = "问候")
    public String hello() {
        return "Hello, I am winnie";
    }
}
