package com.winnie.student.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "ClassResDto", description = "班级范湖参数")
public class ClassResDto {
    @ApiModelProperty(value = "班级编号")
    private String classId;

    @ApiModelProperty(value = "班级名称")
    private String name;

    @ApiModelProperty(value = "班主任编号")
    private String monitorId;

    @ApiModelProperty(value = "是否优秀班级")
    private Integer excellent;

    @ApiModelProperty(value = "英语教师编号")
    private String englishTeacherId;

    @ApiModelProperty(value = "数学教师编号")
    private String mathTeacherId;

    @ApiModelProperty(value = "语文教师编号")
    private String chineseTeacherId;
}