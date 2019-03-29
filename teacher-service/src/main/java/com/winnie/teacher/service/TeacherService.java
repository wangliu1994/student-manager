package com.winnie.teacher.service;

import com.winnie.teacher.model.TeacherInfo;

import java.util.List;

/**
 * @author : winnie
 * @date : 2019/3/29
 * @desc
 */
public interface TeacherService {

    String add(TeacherInfo studentDto);

    List<TeacherInfo> getAll();
}
