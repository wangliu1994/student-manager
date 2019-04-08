package com.winnie.teacher.service;

import com.winnie.teacher.dao.TeacherMapper;
import com.winnie.teacher.dto.response.TeacherResDto;
import com.winnie.teacher.model.TeacherInfo;
import com.winnie.teacher.utils.StringRedisUtils;
import com.winnie.teacher.utils.TeacherUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : winnie
 * @date : 2019/4/1
 * @desc
 */
@Service
@Transactional
@Slf4j
public class TeacherServiceImpl implements TeacherService {
    @Resource
    private TeacherMapper teacherInfoMapper;

    @Resource
    private StringRedisUtils stringRedisUtils;

    @Override
    public int add(TeacherResDto teacherResDto) {
        TeacherInfo teacherInfo = TeacherUtils.convertTeacherDto(teacherResDto);
        return teacherInfoMapper.insert(teacherInfo);
    }

    @Override
    public int edit(TeacherResDto teacherResDto) {
        TeacherInfo teacherInfo = TeacherUtils.convertTeacherDto(teacherResDto);
        Example example = new Example(TeacherInfo.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("id", teacherInfo.getId());
        return teacherInfoMapper.updateByExample(teacherInfo, example);
    }

    @Override
    public int del(String id) {
        return teacherInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public TeacherResDto getByPk(String id) {
        TeacherInfo teacherInfo = teacherInfoMapper.selectByPrimaryKey(id);
        TeacherResDto teacherResDto = TeacherUtils.convertTeacherInfo(teacherInfo);
        if (stringRedisUtils.set("teacher" + id, teacherResDto)) {
            log.info("缓存教师信息");
        }
        return teacherResDto;
    }

    @Override
    public TeacherResDto getCacheByPk(String id) {
        return stringRedisUtils.get("teacher" + id, TeacherResDto.class);
    }

    @Override
    public List<TeacherResDto> getAll() {
        List<TeacherInfo> studentInfos = teacherInfoMapper.selectByExample(null);
        return TeacherUtils.convertTeacherInfos(studentInfos);
    }
}
