package com.winnie.student.service;

import com.winnie.student.dto.response.ClassResDto;

import java.util.List;

/**
 * @author : winnie
 * @date : 2019/4/1
 * @desc
 */
public interface ClassService {
    int add(ClassResDto classInResDto);

    int edit(ClassResDto classInResDto);

    int del(String id);

    ClassResDto getByPk(String id);

    List<ClassResDto> getAll();
}
