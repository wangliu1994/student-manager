package com.winnie.teacher.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author : winnie
 * @date : 2019/4/1
 * @desc student-service使用的是mybatis，teacher-service使用的tk-mybatis
 */
@Table(name = "tb_student")
@Data
public class StudentInfo {
    @Id
    private String id;

    private String name;

    private Integer gender;

    @Column(name = "card_num")
    private String cardNum;

    @Column(name = "register_time")
    private Date registerTime;

    @Column(name = "class_id")
    private String classId;
}
