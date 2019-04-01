package com.winnie.teacher.service;

import com.winnie.teacher.dao.TeacherMapper;
import com.winnie.teacher.dto.response.TeacherResDto;
import com.winnie.teacher.model.TeacherInfo;
import com.winnie.teacher.utils.TeacherUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : winnie
 * @date : 2019/4/1
 * @desc
 */
@Service
@Transactional
public class TeacherServiceImpl implements TeacherService {
    @Resource
    private TeacherMapper teacherInfoMapper;

    @Override
    public int add(TeacherResDto teacherResDto) {
        TeacherInfo teacherInfo = TeacherUtils.convertTeacherDto(teacherResDto);
        return teacherInfoMapper.insert(teacherInfo);
    }

    @Override
    public int edit(TeacherResDto teacherResDto) {
        TeacherInfo teacherInfo = TeacherUtils.convertTeacherDto(teacherResDto);
        //TODO
        return teacherInfoMapper.updateByExample(teacherInfo, null);
    }

    @Override
    public int del(String id) {
        return teacherInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public TeacherResDto getByPk(String id) {
        TeacherInfo teacherInfo = teacherInfoMapper.selectByPrimaryKey(id);
        return TeacherUtils.convertTeacherInfo(teacherInfo);
    }

    @Override
    public List<TeacherResDto> getAll() {
        List<TeacherInfo> studentInfos = teacherInfoMapper.selectByExample(null);
        return TeacherUtils.convertTeacherInfos(studentInfos);
    }
}
