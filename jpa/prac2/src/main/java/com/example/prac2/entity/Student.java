package com.example.prac2.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "TBL_STUDENT")
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Student extends Period{
    @Id @GeneratedValue
    private Long studentId;
    private String studentName;
    private int studentAge;
    private String studentHobby;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TEACHER_ID")
    private Teacher teacher;

    public void create(String studentName, int studentAge, String studentHobby) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentHobby = studentHobby;
    }

    public void changeTeacher(Teacher teacher){
        this.teacher = teacher;
    }
}
