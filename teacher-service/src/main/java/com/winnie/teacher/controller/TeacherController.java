package com.winnie.teacher.controller;

import com.winnie.teacher.model.TeacherInfo;
import com.winnie.teacher.service.TeacherService;
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
@RequestMapping("/teacher")
@Api(tags = "教师信息管理")
public class TeacherController {
    @Resource
    private TeacherService teacherService;

    @GetMapping("/getAll")
    @ApiOperation(value = "获取教师列表")
    public List<TeacherInfo> getAll() {
        return teacherService.getAll();
    }

    @PostMapping("/addTeacher")
    @ApiOperation(value = "新增教师信息")
    public String addStudent(@RequestBody TeacherInfo teacher){
        return teacherService.add(teacher);
    }
}
