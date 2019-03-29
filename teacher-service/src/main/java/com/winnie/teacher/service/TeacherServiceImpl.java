package com.winnie.teacher.service;
;
import com.winnie.teacher.dao.TeacherMapper;
import com.winnie.teacher.model.TeacherInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : winnie
 * @date : 2019/3/29
 * @desc
 */
@Service
@Transactional
public class TeacherServiceImpl implements TeacherService {
    @Resource
    private TeacherMapper teacherMapper;

    @Override
    public String add(TeacherInfo teacherInfo) {
        int result =  teacherMapper.insert(teacherInfo);
        if(result > 0){
            return "添加成功";
        }else {
            return "添加失败";
        }
    }

    @Override
    public List<TeacherInfo> getAll() {
        List<TeacherInfo> teacherInfos = teacherMapper.selectByExample(null);
        return teacherInfos;
    }
}
