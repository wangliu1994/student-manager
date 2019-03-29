package com.winnie.studentservice;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigService;
import com.winnie.studentservice.dao.StudentInfoMapper;
import com.winnie.studentservice.model.StudentInfo;
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
    private StudentInfoMapper studentInfoMapper;

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
    public List<StudentInfo> getAll() {
        return studentInfoMapper.selectByExample(null);
    }

    @PostMapping("/addStudent")
    @ApiOperation(value = "新增学生信息")
    public String addStudent(@RequestBody StudentInfo student){
        int result =  studentInfoMapper.insert(student);
        if(result > 0){
            return "添加成功";
        }else {
            return "添加失败";
        }
    }
}
