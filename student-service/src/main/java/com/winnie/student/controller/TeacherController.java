package com.winnie.student.controller;

import com.winnie.common.dto.BaseResult;
import com.winnie.common.dto.BaseResultCode;
import com.winnie.common.utils.ResultUtils;
import com.winnie.student.dto.response.TeacherResDto;
import com.winnie.student.service.TeacherService;
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
    public BaseResult<List<TeacherResDto>> getAll() {
        List<TeacherResDto> teacherResDtos = teacherService.getAll();
        return ResultUtils.genSuccessResult(teacherResDtos);
    }

    @GetMapping("/get")
    @ApiOperation(value = "获取教师详情")
    public BaseResult<TeacherResDto> get(@RequestParam("id") String id) {
        TeacherResDto teacherResDto = teacherService.getByPk(id);
        return ResultUtils.genSuccessResult(teacherResDto);
    }

    @PostMapping("/add")
    @ApiOperation(value = "新增教师信息")
    public BaseResult add(@RequestBody TeacherResDto teacher) {
        int addResult = teacherService.add(teacher);
        if (addResult > 0) {
            return ResultUtils.genSuccessResult();
        } else {
            return ResultUtils.genResult(BaseResultCode.BASE_FIALED);
        }
    }

    @PutMapping("/edit")
    @ApiOperation(value = "编辑教师信息")
    public BaseResult edit(@RequestBody TeacherResDto teacher) {
        int addResult = teacherService.edit(teacher);
        if (addResult > 0) {
            return ResultUtils.genSuccessResult();
        } else {
            return ResultUtils.genResult(BaseResultCode.BASE_FIALED);
        }
    }

    @DeleteMapping("/del")
    @ApiOperation(value = "删除教师信息")
    public BaseResult del(@RequestParam("id") String id) {
        int addResult = teacherService.del(id);
        if (addResult > 0) {
            return ResultUtils.genSuccessResult();
        } else {
            return ResultUtils.genResult(BaseResultCode.BASE_FIALED);
        }
    }
}
