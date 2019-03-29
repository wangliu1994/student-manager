package com.winnie.student.service;

import com.winnie.student.dto.StudentDto;

import java.util.List;

/**
 * @author : winnie
 * @date : 2019/3/29
 * @desc
 */
public interface StudentService {

    String add(StudentDto studentDto);

    List<StudentDto> getAll();
}
