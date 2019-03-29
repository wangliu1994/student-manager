package com.winnie.student.model;

/**
 * 学生管理使用的是mybatis，教师管理使用的tk-mybatis
 */
public class ClassInfo {
    private String classId;

    private String name;

    private String monitorId;

    private Integer excellent;

    private String englishTeacherId;

    private String mathTeacherId;

    private String chineseTeacherId;

    public ClassInfo(String classId, String name, String monitorId, Integer excellent, String englishTeacherId, String mathTeacherId, String chineseTeacherId) {
        this.classId = classId;
        this.name = name;
        this.monitorId = monitorId;
        this.excellent = excellent;
        this.englishTeacherId = englishTeacherId;
        this.mathTeacherId = mathTeacherId;
        this.chineseTeacherId = chineseTeacherId;
    }

    public ClassInfo() {
        super();
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId == null ? null : classId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMonitorId() {
        return monitorId;
    }

    public void setMonitorId(String monitorId) {
        this.monitorId = monitorId == null ? null : monitorId.trim();
    }

    public Integer getExcellent() {
        return excellent;
    }

    public void setExcellent(Integer excellent) {
        this.excellent = excellent;
    }

    public String getEnglishTeacherId() {
        return englishTeacherId;
    }

    public void setEnglishTeacherId(String englishTeacherId) {
        this.englishTeacherId = englishTeacherId == null ? null : englishTeacherId.trim();
    }

    public String getMathTeacherId() {
        return mathTeacherId;
    }

    public void setMathTeacherId(String mathTeacherId) {
        this.mathTeacherId = mathTeacherId == null ? null : mathTeacherId.trim();
    }

    public String getChineseTeacherId() {
        return chineseTeacherId;
    }

    public void setChineseTeacherId(String chineseTeacherId) {
        this.chineseTeacherId = chineseTeacherId == null ? null : chineseTeacherId.trim();
    }
}