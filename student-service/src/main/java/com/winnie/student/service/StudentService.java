package com.winnie.student.service;

import com.winnie.student.dto.response.StudentResDto;

import java.util.List;

/**
 * @author : winnie
 * @date : 2019/3/29
 * @desc
 */
public interface StudentService {

    int add(StudentResDto studentDto);

    int edit(StudentResDto studentDto);

    int del(String id);

    StudentResDto getByPk(String id);

    List<StudentResDto> query(List<String> ids);

    List<StudentResDto> getAll();
}
