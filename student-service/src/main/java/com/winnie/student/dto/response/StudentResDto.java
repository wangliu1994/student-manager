package com.winnie.student.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@ApiModel(value = "StudentResDto", description = "学生返回参数")
@Data
public class StudentResDto {
    @ApiModelProperty(value = "学生编号")
    private String id;

    @ApiModelProperty(value = "学生姓名")
    private String name;

    @ApiModelProperty(value = "学生性别")
    private Integer gender;

    @ApiModelProperty(value = "学生身份证号")
    private String cardNum;

    @ApiModelProperty(value = "学生注册时间")
    private Date registerTime;

    @ApiModelProperty(value = "学生所在班级编号")
    private String classId;

    @ApiModelProperty(value = "学生所在班级名称")
    private String className;

    @ApiModelProperty(value = "班主任编号")
    private String monitorId;

    @ApiModelProperty(value = "班主任姓名")
    private String monitorName;

    @ApiModelProperty(value = "语文教师编号")
    private String chineseTeacherId;

    @ApiModelProperty(value = "语文教师姓名")
    private String chineseTeacherName;

    @ApiModelProperty(value = "数学教师编号")
    private String mathTeacherId;

    @ApiModelProperty(value = "数学教师姓名")
    private String mathTeacherName;

    @ApiModelProperty(value = "英语教师编号")
    private String englishTeacherId;

    @ApiModelProperty(value = "英语教师姓名")
    private String englishTeacherName;
}