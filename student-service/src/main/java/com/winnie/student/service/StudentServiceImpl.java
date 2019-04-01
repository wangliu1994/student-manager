package com.winnie.student.service;

import com.winnie.student.dao.ClassInfoMapper;
import com.winnie.student.dao.StudentInfoMapper;
import com.winnie.student.dao.TeacherInfoMapper;
import com.winnie.student.dto.request.StudentReqDto;
import com.winnie.student.dto.response.StudentResDto;
import com.winnie.student.model.ClassInfo;
import com.winnie.student.model.StudentInfo;
import com.winnie.student.model.StudentInfoExample;
import com.winnie.student.model.TeacherInfo;
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
    public int add(StudentReqDto studentDto) {
        StudentInfo studentInfo = StudentUtils.convertStudentReqDto(studentDto);
        return studentInfoMapper.insert(studentInfo);
    }

    @Override
    public int edit(StudentReqDto studentDto) {
        StudentInfo studentInfo = StudentUtils.convertStudentReqDto(studentDto);
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
        StudentResDto studentResDto = StudentUtils.convertStudentInfo(studentInfo);
        if (studentInfo == null) {
            return null;
        }
        ClassInfo classInfo = classInfoMapper.selectByPrimaryKey(studentResDto.getClassId());
        if (classInfo == null) {
            return studentResDto;
        }
        studentResDto.setClassName(classInfo.getName());
        studentResDto.setMonitorId(classInfo.getMonitorId());
        studentResDto.setChineseTeacherId(classInfo.getChineseTeacherId());
        studentResDto.setMathTeacherId(classInfo.getMathTeacherId());
        studentResDto.setEnglishTeacherId(classInfo.getEnglishTeacherId());
        TeacherInfo monitorInfo = teacherInfoMapper.selectByPrimaryKey(studentResDto.getMonitorId());
        if (monitorInfo != null) {
            studentResDto.setMonitorName(monitorInfo.getName());
        }
        TeacherInfo chineseInfo = teacherInfoMapper.selectByPrimaryKey(studentResDto.getChineseTeacherId());
        if (chineseInfo != null) {
            studentResDto.setChineseTeacherName(chineseInfo.getName());
        }
        TeacherInfo mathInfo = teacherInfoMapper.selectByPrimaryKey(studentResDto.getMathTeacherId());
        if (mathInfo != null) {
            studentResDto.setMathTeacherName(mathInfo.getName());
        }
        TeacherInfo englishInfo = teacherInfoMapper.selectByPrimaryKey(studentResDto.getEnglishTeacherId());
        if (englishInfo != null) {
            studentResDto.setEnglishTeacherName(englishInfo.getName());
        }
        return studentResDto;
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
