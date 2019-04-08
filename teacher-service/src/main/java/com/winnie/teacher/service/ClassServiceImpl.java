package com.winnie.teacher.service;

import com.winnie.teacher.dao.ClassMapper;
import com.winnie.teacher.dto.response.ClassResDto;
import com.winnie.teacher.model.ClassInfo;
import com.winnie.teacher.utils.ClassUtils;
import com.winnie.teacher.utils.RedisUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : winnie
 * @date : 2019/4/1
 * @desc
 */
@Service
@Slf4j
public class ClassServiceImpl implements ClassService {
    @Resource
    private ClassMapper classInfoMapper;

    @Resource
    private RedisUtils redisUtils;

    @Override
    public int add(ClassResDto classInResDto) {
        ClassInfo classInfo = ClassUtils.convertClassDto(classInResDto);
        return classInfoMapper.insert(classInfo);
    }

    @Override
    public int edit(ClassResDto classInResDto) {
        ClassInfo classInfo = ClassUtils.convertClassDto(classInResDto);
        Example example = new Example(ClassInfo.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("classId", classInResDto.getClassId());
        return classInfoMapper.updateByExample(classInfo, example);
    }

    @Override
    public int del(String id) {
        return classInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public ClassResDto getByPk(String id) {
        ClassInfo classInfo = classInfoMapper.selectByPrimaryKey(id);
        if(redisUtils.setStr("class" + id, classInfo.getName())){
            log.info("缓存班级名称");
        }
        return ClassUtils.convertClassInfo(classInfo);
    }

    @Override
    public String getCacheByPk(String id) {
        return redisUtils.getStr("class" + id);
    }

    @Override
    public List<ClassResDto> getAll() {
        List<ClassInfo> classInfos = classInfoMapper.selectByExample(null);
        return ClassUtils.convertClassInfos(classInfos);
    }
}
