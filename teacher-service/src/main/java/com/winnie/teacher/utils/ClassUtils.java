package com.winnie.teacher.utils;

import com.winnie.teacher.dto.response.ClassResDto;
import com.winnie.teacher.model.ClassInfo;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : winnie
 * @date : 2019/4/1
 * @desc
 */
public class ClassUtils {
    public static ClassInfo convertClassDto(ClassResDto classInResDto){
        ClassInfo classInfo = new ClassInfo();
        BeanUtils.copyProperties(classInResDto, classInfo);
        return classInfo;
    }

    public static ClassResDto convertClassInfo(ClassInfo classInfo){
        ClassResDto classInResDto = new ClassResDto();
        BeanUtils.copyProperties(classInfo, classInResDto);
        return classInResDto;
    }

    public static List<ClassInfo> convertClassDtos(List<ClassResDto> classInResDtos){
        return classInResDtos.stream().map(ClassUtils::convertClassDto).collect(Collectors.toList());
    }

    public static List<ClassResDto> convertClassInfos(List<ClassInfo> classInfos){
        return classInfos.stream().map(ClassUtils::convertClassInfo).collect(Collectors.toList());
    }
}
