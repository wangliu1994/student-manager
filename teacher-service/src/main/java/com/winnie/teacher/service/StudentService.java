package com.winnie.teacher.service;


import com.github.pagehelper.PageInfo;
import com.winnie.common.dto.BasePageResult;
import com.winnie.teacher.dto.request.StudentReqDto;
import com.winnie.teacher.dto.response.StudentResDto;
import com.winnie.teacher.model.StudentInfo;

import java.util.List;

/**
 * @author : winnie
 * @date : 2019/3/29
 * @desc
 */
public interface StudentService {

    int add(StudentReqDto studentDto);

    int edit(StudentReqDto studentDto);

    int del(String id);

    StudentResDto getByPk(String id);

    BasePageResult<List<StudentResDto>> query(List<String> ids, int pageSize, int pageNum);

    BasePageResult<List<StudentResDto>> getAll(int pageSize, int pageNum);
}
