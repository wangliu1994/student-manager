package com.winnie.teacher.service;


import com.winnie.teacher.dto.response.TeacherResDto;

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

    TeacherResDto getCacheByPk(String id);

    List<TeacherResDto> getAll();
}
