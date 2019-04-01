package com.winnie.student.service;

import com.winnie.student.dto.response.ClassInResDto;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : winnie
 * @date : 2019/4/1
 * @desc
 */
@Service
public class ClassServiceImpl implements ClassService {
    @Override
    public int add(ClassInResDto classInResDto) {
        return 0;
    }

    @Override
    public int edit(ClassInResDto classInResDto) {
        return 0;
    }

    @Override
    public int del(String id) {
        return 0;
    }

    @Override
    public ClassInResDto getByPk(String id) {
        return null;
    }

    @Override
    public List<ClassInResDto> getAll() {
        return null;
    }
}
