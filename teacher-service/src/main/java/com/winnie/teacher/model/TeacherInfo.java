package com.winnie.teacher.model;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 学生管理使用的是mybatis，教师管理使用的tk-mybatis
 */
@Data
// @Table指定该实体类对应的表名,如表名为teacher_info,类名为TeacherInfo可以不需要此注解
@Table(name = "tb_teacher")
@ApiModel(value = "教师信息")
public class TeacherInfo {
    // @Id表示该字段对应数据库表的主键id
    // @GeneratedValue中strategy表示使用数据库自带的主键生成策略.
    // @GeneratedValue中generator配置为"JDBC",在数据插入完毕之后,会自动将主键id填充到实体类中.类似普通mapper.xml中配置的selectKey标签
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY,generator = "JDBC")
    private String id;

    private String gender;

    private String name;
}