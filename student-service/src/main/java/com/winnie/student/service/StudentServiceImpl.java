package com.winnie.student.service;

import com.winnie.student.dao.ClassInfoMapper;
import com.winnie.student.dao.StudentInfoMapper;
import com.winnie.student.dao.TeacherInfoMapper;
import com.winnie.student.dto.response.StudentResDto;
import com.winnie.student.model.StudentInfo;
import com.winnie.student.model.StudentInfoExample;
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

    @Resource
    private TeacherInfoMapper teacherInfoMapper;

    @Resource
    private ClassInfoMapper classInfoMapper;

    @Override
    public int add(StudentResDto studentDto) {
        StudentInfo studentInfo = StudentUtils.convertStudentDto(studentDto);
        return studentInfoMapper.insert(studentInfo);
    }

    @Override
    public int edit(StudentResDto studentDto) {
        StudentInfo studentInfo = StudentUtils.convertStudentDto(studentDto);
        StudentInfoExample example = new StudentInfoExample();
        StudentInfoExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(studentInfo.getId());
        return studentInfoMapper.updateByExample(studentInfo, example);
    }

    @Override
    public int del(String id) {
        return studentInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public StudentResDto getByPk(String id) {
        StudentInfo studentInfo = studentInfoMapper.selectByPrimaryKey(id);
        return StudentUtils.convertStudentInfo(studentInfo);
    }

    @Override
    public List<StudentResDto> query(List<String> ids) {
        StudentInfoExample example = new StudentInfoExample();
        StudentInfoExample.Criteria criteria = example.createCriteria();
        criteria.andIdIn(ids);
        List<StudentInfo> studentInfos = studentInfoMapper.selectByExample(example);
        return StudentUtils.convertStudentInfos(studentInfos);
    }

    @Override
    public List<StudentResDto> getAll() {
        List<StudentInfo> studentInfos = studentInfoMapper.selectByExample(null);
        return StudentUtils.convertStudentInfos(studentInfos);
    }
}
