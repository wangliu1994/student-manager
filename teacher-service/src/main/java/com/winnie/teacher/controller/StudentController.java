package com.winnie.teacher.controller;

import com.winnie.common.dto.BasePageResult;
import com.winnie.common.dto.BaseResult;
import com.winnie.common.dto.BaseResultCode;
import com.winnie.common.utils.ResultUtils;
import com.winnie.teacher.dto.request.StudentReqDto;
import com.winnie.teacher.dto.response.StudentResDto;
import com.winnie.teacher.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class StudentController {
    @Resource
    private StudentService studentService;

    @GetMapping("/getAll")
    @ApiOperation(value = "获取学生列表")
    public BaseResult<BasePageResult<List<StudentResDto>>> getAll(
            @RequestParam("pageSize") int pagSize, @RequestParam("pageNum") int pageNum) {
        log.info("获取学生列表");
        BasePageResult<List<StudentResDto>> studentResDtos = studentService.getAll(pagSize, pageNum);
        return ResultUtils.genSuccessResult(studentResDtos);
    }

    @GetMapping("/get")
    @ApiOperation(value = "获取学生详情")
    public BaseResult<StudentResDto> get(@RequestParam("id") String id) {
        log.info("获取学生详情");
        StudentResDto studentResDto = studentService.getByPk(id);
        return ResultUtils.genSuccessResult(studentResDto);
    }

    @GetMapping("/getCache")
    @ApiOperation(value = "获取学生缓存")
    public BaseResult<Object> getCache(@RequestParam("id") String id) {
        log.info("获取学生缓存");
        Object result = studentService.getCacheByPk(id);
        return ResultUtils.genSuccessResult(result);
    }

    @PostMapping("/query")
    @ApiOperation(value = "条件查询学生")
    public BaseResult<BasePageResult<List<StudentResDto>>> query(
            @RequestBody List<String> ids, @RequestParam("pageSize") int pagSize, @RequestParam("pageNum") int pageNum) {
        log.info("条件查询学生");
        BasePageResult<List<StudentResDto>> studentResDtos = studentService.query(ids, pagSize, pageNum);
        return ResultUtils.genSuccessResult(studentResDtos);
    }

    @PostMapping("/add")
    @ApiOperation(value = "新增学生信息")
    public BaseResult add(@RequestBody StudentReqDto student) {
        log.info("新增学生信息");
        int addResult = studentService.add(student);
        if (addResult > 0) {
            return ResultUtils.genSuccessResult();
        } else {
            return ResultUtils.genResult(BaseResultCode.BASE_FIALED);
        }
    }

    @PutMapping("/edit")
    @ApiOperation(value = "编辑学生信息")
    public BaseResult edit(@RequestBody StudentReqDto student) {
        log.info("编辑学生信息");
        int addResult = studentService.edit(student);
        if (addResult > 0) {
            return ResultUtils.genSuccessResult();
        } else {
            return ResultUtils.genResult(BaseResultCode.BASE_FIALED);
        }
    }

    @DeleteMapping("/del")
    @ApiOperation(value = "删除学生信息")
    public BaseResult del(@RequestParam("id") String id) {
        log.info("删除学生信息");
        int addResult = studentService.del(id);
        if (addResult > 0) {
            return ResultUtils.genSuccessResult();
        } else {
            return ResultUtils.genResult(BaseResultCode.BASE_FIALED);
        }
    }
}
