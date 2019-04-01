package com.winnie.teacher.utils;

import com.winnie.teacher.dto.response.TeacherResDto;
import com.winnie.teacher.model.TeacherInfo;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : winnie
 * @date : 2019/4/1
 * @desc
 */
public class TeacherUtils {
    public static TeacherInfo convertTeacherDto(TeacherResDto teacherResDto){
        TeacherInfo teacherInfo = new TeacherInfo();
        BeanUtils.copyProperties(teacherResDto, teacherInfo);
        return teacherInfo;
    }

    public static TeacherResDto convertTeacherInfo(TeacherInfo teacherInfo){
        TeacherResDto teacherResDto = new TeacherResDto();
        BeanUtils.copyProperties(teacherInfo, teacherResDto);
        return teacherResDto;
    }

    public static List<TeacherInfo> convertTeacherDtos(List<TeacherResDto> teacherResDtos){
        return teacherResDtos.stream().map(TeacherUtils::convertTeacherDto).collect(Collectors.toList());
    }

    public static List<TeacherResDto> convertTeacherInfos(List<TeacherInfo> teacherInfos){
        return teacherInfos.stream().map(TeacherUtils::convertTeacherInfo).collect(Collectors.toList());
    }
}
