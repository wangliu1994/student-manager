package com.winnie.student.service;

import com.winnie.student.dto.response.ClassInResDto;

import java.util.List;

/**
 * @author : winnie
 * @date : 2019/4/1
 * @desc
 */
public interface ClassService {
    int add(ClassInResDto classInResDto);

    int edit(ClassInResDto classInResDto);

    int del(String id);

    ClassInResDto getByPk(String id);

    List<ClassInResDto> getAll();
}
