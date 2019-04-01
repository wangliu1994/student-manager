package com.winnie.student.service;

import com.winnie.student.dao.StudentInfoMapper;
import com.winnie.student.dto.response.StudentResDto;
import com.winnie.student.model.StudentInfo;
import com.winnie.student.utils.StudentUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : winnie
 * @date : 2019/3/29
 * @desc
 */
@Service
@Transactional
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentInfoMapper studentInfoMapper;

    @Override
    public int add(StudentResDto studentDto) {
        StudentInfo studentInfo = StudentUtils.convertStudentDto(studentDto);
        return studentInfoMapper.insert(studentInfo);
    }

    @Override
    public int edit(StudentResDto studentDto) {
        return 0;
    }

    @Override
    public int del(String id) {
        return 0;
    }

    @Override
    public List<StudentResDto> getAll() {
        List<StudentInfo> studentInfos = studentInfoMapper.selectByExample(null);
        return StudentUtils.converStudentInfos(studentInfos);
    }
}
