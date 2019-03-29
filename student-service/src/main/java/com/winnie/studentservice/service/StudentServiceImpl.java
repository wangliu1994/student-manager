package com.winnie.studentservice.service;

import com.winnie.studentservice.dao.StudentInfoMapper;
import com.winnie.studentservice.dto.StudentDto;
import com.winnie.studentservice.model.StudentInfo;
import com.winnie.studentservice.utils.StudentUtils;
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
    public String add(StudentDto studentDto) {
        StudentInfo studentInfo = StudentUtils.convertStudentDto(studentDto);
        int result =  studentInfoMapper.insert(studentInfo);
        if(result > 0){
            return "添加成功";
        }else {
            return "添加失败";
        }
    }

    @Override
    public List<StudentDto> getAll() {
        List<StudentInfo> studentInfos = studentInfoMapper.selectByExample(null);
        return StudentUtils.converStudentInfos(studentInfos);
    }
}
