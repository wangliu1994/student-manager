package com.winnie.studentservice.model;

import java.util.Date;

public class StudentInfo {
    private String id;

    private String name;

    private Integer gender;

    private String cardNum;

    private Date registerTime;

    private String classId;

    public StudentInfo(String id, String name, Integer gender, String cardNum, Date registerTime, String classId) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.cardNum = cardNum;
        this.registerTime = registerTime;
        this.classId = classId;
    }

    public StudentInfo() {
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