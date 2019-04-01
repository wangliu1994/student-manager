package com.winnie.teacher.service;

import com.winnie.teacher.dto.request.StudentReqDto;
import com.winnie.teacher.dto.response.StudentResDto;
import com.winnie.teacher.model.ClassInfo;
import com.winnie.teacher.model.StudentInfo;
import com.winnie.teacher.model.TeacherInfo;
import com.winnie.teacher.utils.StudentUtils;
import com.winnie.teacher.dao.ClassMapper;
import com.winnie.teacher.dao.StudentMapper;
import com.winnie.teacher.dao.TeacherMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

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
    private StudentMapper studentInfoMapper;

    @Resource
    private TeacherMapper teacherInfoMapper;

    @Resource
    private ClassMapper classInfoMapper;

    @Override
    public int add(StudentReqDto studentDto) {
        StudentInfo studentInfo = StudentUtils.convertStudentReqDto(studentDto);
        return studentInfoMapper.insert(studentInfo);
    }

    @Override
    public int edit(StudentReqDto studentDto) {
        StudentInfo studentInfo = StudentUtils.convertStudentReqDto(studentDto);
        Example example = new Example(StudentInfo.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("id", studentDto.getId());
        return studentInfoMapper.updateByExample(studentInfo, example);
    }

    @Override
    public int del(String id) {
        return studentInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public StudentResDto getByPk(String id) {
        StudentInfo student = studentInfoMapper.selectByPrimaryKey(id);
        StudentResDto studentResDto = StudentUtils.convertStudentInfo(student);
        if (student != null) {
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
        }
        return studentResDto;
    }

    @Override
    public List<StudentResDto> query(List<String> ids) {
        Example example = new Example(StudentInfo.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andIn("id", ids);
        List<StudentInfo> studentInfos = studentInfoMapper.selectByExample(example);
        return StudentUtils.convertStudentInfos(studentInfos);
    }

    @Override
    public List<StudentResDto> getAll() {
        List<StudentInfo> studentInfos = studentInfoMapper.selectByExample(null);
        return StudentUtils.convertStudentInfos(studentInfos);
    }
}
