package com.winnie.student.service;

import com.winnie.student.dao.ClassInfoMapper;
import com.winnie.student.dto.response.ClassResDto;
import com.winnie.student.model.ClassInfo;
import com.winnie.student.model.ClassInfoExample;
import com.winnie.student.utils.ClassUtils;
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
    private ClassInfoMapper classInfoMapper;

    @Override
    public int add(ClassResDto classInResDto) {
        ClassInfo classInfo = ClassUtils.convertClassDto(classInResDto);
        return classInfoMapper.insert(classInfo);
    }

    @Override
    public int edit(ClassResDto classInResDto) {
        ClassInfo classInfo = ClassUtils.convertClassDto(classInResDto);
        ClassInfoExample example = new ClassInfoExample();
        ClassInfoExample.Criteria criteria = example.createCriteria();
        criteria.andClassIdEqualTo(classInfo.getClassId());
        return classInfoMapper.updateByExample(classInfo, example);
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
