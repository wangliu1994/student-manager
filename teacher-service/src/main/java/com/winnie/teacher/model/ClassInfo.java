package com.winnie.teacher.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author : winnie
 * @date : 2019/4/1
 * @desc student-service使用的是mybatis，teacher-service使用的tk-mybatis
 */
@Table(name = "tb_class")
@Data
public class ClassInfo {
    @Id
    @Column(name = "class_id")
    private String classId;

    private String name;

    @Column(name = "monitor_id")
    private String monitorId;

    private Integer excellent;

    @Column(name = "english_teacher_id")
    private String englishTeacherId;

    @Column(name = "math_teacher_id")
    private String mathTeacherId;

    @Column(name = "chinese_teacher_id")
    private String chineseTeacherId;
}
