package com.example.prac2.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_TEACHER")
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Teacher extends Period{
    @Id @GeneratedValue
    private Long teacherId;
    private String teacherSubject;
    private String teacherName;
    private int teacherAge;

    public void create(String teacherSubject, String teacherName, int teacherAge) {
        this.teacherSubject = teacherSubject;
        this.teacherName = teacherName;
        this.teacherAge = teacherAge;
    }
}
