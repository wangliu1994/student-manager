package com.winnie.student.service;

import com.winnie.student.dto.response.TeacherResDto;

import java.util.List;

/**
 * @author : winnie
 * @date : 2019/4/1
 * @desc
 */
public interface TeacherService {
    int add(TeacherResDto teacherResDto);

    int edit(TeacherResDto teacherResDto);

    int del(String id);

    TeacherResDto getByPk(String id);

    List<TeacherResDto> getAll();
}
