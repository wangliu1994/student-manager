package com.winnie.teacher.utils;

import com.winnie.teacher.dto.request.StudentReqDto;
import com.winnie.teacher.dto.response.StudentResDto;
import com.winnie.teacher.model.StudentInfo;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : winnie
 * @date : 2019/3/29
 * @desc
 */
public class StudentUtils {
    public static StudentInfo convertStudentResDto(StudentResDto studentDto){
        StudentInfo studentInfo = new StudentInfo();
        BeanUtils.copyProperties(studentDto, studentInfo);
        return studentInfo;
    }

    public static StudentInfo convertStudentReqDto(StudentReqDto studentDto){
        StudentInfo studentInfo = new StudentInfo();
        BeanUtils.copyProperties(studentDto, studentInfo);
        return studentInfo;
    }

    public static StudentResDto convertStudentInfo(StudentInfo studentInfo){
        StudentResDto studentDto = new StudentResDto();
        BeanUtils.copyProperties(studentInfo, studentDto);
        return studentDto;
    }

    public static List<StudentInfo> convertStudentDtos(List<StudentResDto> studentDtos){
        return studentDtos.stream().map(StudentUtils::convertStudentResDto).collect(Collectors.toList());
    }

    public static List<StudentResDto> convertStudentInfos(List<StudentInfo> studentInfos){
        return studentInfos.stream().map(StudentUtils::convertStudentInfo).collect(Collectors.toList());
    }
}
