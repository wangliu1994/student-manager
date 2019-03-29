package com.winnie.studentservice.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(value = "学生返回参数")
public class StudentDto {
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

    @ApiModelProperty(value = "学生所在班级")
    private String classId;

    public StudentDto(String id, String name, Integer gender, String cardNum, Date registerTime, String classId) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.cardNum = cardNum;
        this.registerTime = registerTime;
        this.classId = classId;
    }

    public StudentDto() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum == null ? null : cardNum.trim();
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId == null ? null : classId.trim();
    }
}