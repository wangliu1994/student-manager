package com.winnie.teacher.service;


import com.winnie.teacher.dto.request.StudentReqDto;
import com.winnie.teacher.dto.response.StudentResDto;

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

    List<StudentResDto> query(List<String> ids);

    List<StudentResDto> getAll();
}
