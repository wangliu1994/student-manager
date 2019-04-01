package com.winnie.student.service;

import com.winnie.student.dao.TeacherInfoMapper;
import com.winnie.student.dto.response.TeacherResDto;
import com.winnie.student.model.TeacherInfo;
import com.winnie.student.model.TeacherInfoExample;
import com.winnie.student.utils.TeacherUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : winnie
 * @date : 2019/4/1
 * @desc
 */
@Service
public class TeacherServiceImpl implements TeacherService {
    @Resource
    private TeacherInfoMapper teacherInfoMapper;

    @Override
    public int add(TeacherResDto teacherResDto) {
        TeacherInfo teacherInfo = TeacherUtils.convertTeacherDto(teacherResDto);
        return teacherInfoMapper.insert(teacherInfo);
    }

    @Override
    public int edit(TeacherResDto teacherResDto) {
        TeacherInfo teacherInfo = TeacherUtils.convertTeacherDto(teacherResDto);
        TeacherInfoExample example = new TeacherInfoExample();
        TeacherInfoExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(teacherInfo.getId());
        return teacherInfoMapper.updateByExample(teacherInfo, example);
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
