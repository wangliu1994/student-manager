package com.winnie.teacher.service;

import com.winnie.teacher.dao.ClassMapper;
import com.winnie.teacher.dto.response.ClassResDto;
import com.winnie.teacher.model.ClassInfo;
import com.winnie.teacher.utils.ClassUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : winnie
 * @date : 2019/4/1
 * @desc
 */
@Service
public class ClassServiceImpl implements ClassService {
    @Resource
    private ClassMapper classInfoMapper;

    @Override
    public int add(ClassResDto classInResDto) {
        ClassInfo classInfo = ClassUtils.convertClassDto(classInResDto);
        return classInfoMapper.insert(classInfo);
    }

    @Override
    public int edit(ClassResDto classInResDto) {
        ClassInfo classInfo = ClassUtils.convertClassDto(classInResDto);
       //TODO
        return classInfoMapper.updateByExample(classInfo, null);
    }

    @Override
    public int del(String id) {
        return classInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public ClassResDto getByPk(String id) {
        ClassInfo classInfo = classInfoMapper.selectByPrimaryKey(id);
        return ClassUtils.convertClassInfo(classInfo);
    }

    @Override
    public List<ClassResDto> getAll() {
        List<ClassInfo> classInfos = classInfoMapper.selectByExample(null);
        return ClassUtils.convertClassInfos(classInfos);
    }
}
