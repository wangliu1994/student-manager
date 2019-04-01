package com.winnie.student.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "TeacherResDto", description = "教师返回参数")
public class TeacherResDto {
    @ApiModelProperty(value = "教师编号")
    private String id;

    @ApiModelProperty(value = "教师性别")
    private String gender;

    @ApiModelProperty(value = "教师姓名")
    private String name;
}