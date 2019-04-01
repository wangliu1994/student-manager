package com.winnie.student.controller;

import com.winnie.common.dto.BaseResult;
import com.winnie.common.dto.BaseResultCode;
import com.winnie.common.utils.ResultUtils;
import com.winnie.student.dto.response.StudentResDto;
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

    @GetMapping("/getAll")
    @ApiOperation(value = "获取学生列表")
    public BaseResult<List<StudentResDto>> getAll() {
        List<StudentResDto> studentResDtos = studentServices.getAll();
        return ResultUtils.genSuccessResult(studentResDtos);
    }

    @PostMapping("/addStudent")
    @ApiOperation(value = "新增学生信息")
    public BaseResult addStudent(@RequestBody StudentResDto student){
        int addResult = studentServices.add(student);
        if(addResult >0){
            return ResultUtils.genSuccessResult();
        }else {
            return ResultUtils.genResult(BaseResultCode.BASE_FIALED);
        }
    }
}
