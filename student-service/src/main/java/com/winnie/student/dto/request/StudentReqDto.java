package com.winnie.student.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@ApiModel(value = "StudentReqDto", description = "学生请求参数")
@Data
public class StudentReqDto {
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
}