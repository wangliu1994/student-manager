package com.winnie.studentservice.utils;

import com.winnie.studentservice.dto.StudentDto;
import com.winnie.studentservice.model.StudentInfo;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : winnie
 * @date : 2019/3/29
 * @desc
 */
public class StudentUtils {

    public static StudentInfo convertStudentDto(StudentDto studentDto){
        StudentInfo studentInfo = new StudentInfo();
        BeanUtils.copyProperties(studentDto, studentInfo);
        return studentInfo;
    }

    public static StudentDto converStudentInfo(StudentInfo studentInfo){
        StudentDto studentDto = new StudentDto();
        BeanUtils.copyProperties(studentInfo, studentDto);
        return studentDto;
    }

    public static List<StudentInfo> converStudentDtos(List<StudentDto> studentDtos){
        return studentDtos.stream().map(StudentUtils::convertStudentDto).collect(Collectors.toList());
    }

    public static List<StudentDto> converStudentInfos(List<StudentInfo> studentInfos){
        return studentInfos.stream().map(StudentUtils::converStudentInfo).collect(Collectors.toList());
    }
}
