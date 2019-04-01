package com.winnie.student.utils;

import com.winnie.student.dto.response.StudentResDto;
import com.winnie.student.model.StudentInfo;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : winnie
 * @date : 2019/3/29
 * @desc
 */
public class StudentUtils {

    public static StudentInfo convertStudentDto(StudentResDto studentDto){
        StudentInfo studentInfo = new StudentInfo();
        BeanUtils.copyProperties(studentDto, studentInfo);
        return studentInfo;
    }

    public static StudentResDto converStudentInfo(StudentInfo studentInfo){
        StudentResDto studentDto = new StudentResDto();
        BeanUtils.copyProperties(studentInfo, studentDto);
        return studentDto;
    }

    public static List<StudentInfo> converStudentDtos(List<StudentResDto> studentDtos){
        return studentDtos.stream().map(StudentUtils::convertStudentDto).collect(Collectors.toList());
    }

    public static List<StudentResDto> converStudentInfos(List<StudentInfo> studentInfos){
        return studentInfos.stream().map(StudentUtils::converStudentInfo).collect(Collectors.toList());
    }
}
