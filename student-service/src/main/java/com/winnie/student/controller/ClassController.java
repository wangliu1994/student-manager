package com.winnie.student.controller;

import com.winnie.common.dto.BaseResult;
import com.winnie.common.dto.BaseResultCode;
import com.winnie.common.utils.ResultUtils;
import com.winnie.student.dto.response.ClassResDto;
import com.winnie.student.dto.response.StudentResDto;
import com.winnie.student.service.ClassService;
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
@RequestMapping("/class")
@Api(tags = "班级信息管理")
public class ClassController {
    @Resource
    private ClassService classService;

    @GetMapping("/getAll")
    @ApiOperation(value = "获取班级列表")
    public BaseResult<List<ClassResDto>> getAll() {
        List<ClassResDto> classResDtos = classService.getAll();
        return ResultUtils.genSuccessResult(classResDtos);
    }

    @GetMapping("/get")
    @ApiOperation(value = "获取班级详情")
    public BaseResult<ClassResDto> get(@RequestParam("id") String id) {
        ClassResDto classResDto = classService.getByPk(id);
        return ResultUtils.genSuccessResult(classResDto);
    }

    @PostMapping("/add")
    @ApiOperation(value = "新增班级信息")
    public BaseResult add(@RequestBody ClassResDto classInfo) {
        int addResult = classService.add(classInfo);
        if (addResult > 0) {
            return ResultUtils.genSuccessResult();
        } else {
            return ResultUtils.genResult(BaseResultCode.BASE_FIALED);
        }
    }

    @PutMapping("/edit")
    @ApiOperation(value = "编辑班级信息")
    public BaseResult edit(@RequestBody ClassResDto classInfo) {
        int addResult = classService.edit(classInfo);
        if (addResult > 0) {
            return ResultUtils.genSuccessResult();
        } else {
            return ResultUtils.genResult(BaseResultCode.BASE_FIALED);
        }
    }

    @DeleteMapping("/del")
    @ApiOperation(value = "删除班级信息")
    public BaseResult del(@RequestParam("id") String id) {
        int addResult = classService.del(id);
        if (addResult > 0) {
            return ResultUtils.genSuccessResult();
        } else {
            return ResultUtils.genResult(BaseResultCode.BASE_FIALED);
        }
    }
}
