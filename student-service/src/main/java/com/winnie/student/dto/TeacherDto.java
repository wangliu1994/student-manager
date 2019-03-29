package com.winnie.student.dto;

public class TeacherDto {
    private String id;

    private String gender;

    private String name;

    public TeacherDto(String id, String gender, String name) {
        this.id = id;
        this.gender = gender;
        this.name = name;
    }

    public TeacherDto() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}