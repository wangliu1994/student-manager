package com.winnie.studentservice.dao;

import com.winnie.studentservice.model.TeacherInfo;
import com.winnie.studentservice.model.TeacherInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherInfoMapper {
    int countByExample(TeacherInfoExample example);

    int deleteByExample(TeacherInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(TeacherInfo record);

    int insertSelective(TeacherInfo record);

    List<TeacherInfo> selectByExample(TeacherInfoExample example);

    TeacherInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TeacherInfo record, @Param("example") TeacherInfoExample example);

    int updateByExample(@Param("record") TeacherInfo record, @Param("example") TeacherInfoExample example);

    int updateByPrimaryKeySelective(TeacherInfo record);

    int updateByPrimaryKey(TeacherInfo record);
}