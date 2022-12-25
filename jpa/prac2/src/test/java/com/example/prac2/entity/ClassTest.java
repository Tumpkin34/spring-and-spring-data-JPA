package com.example.prac2.entity;

import com.example.prac2.repository.StudentRepository;
import com.example.prac2.repository.TeacherRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Slf4j
@Transactional
@Rollback(false)
public class ClassTest {
    @Autowired
    private TeacherRepository teacherRepository;
    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveTest(){
        Teacher teacher = new Teacher();
        teacher.create("수학","김철수",40);
        teacherRepository.save(teacher);
    }
    @Test
    public void saveStudentTest(){
        Student student = new Student();
        student.create("황지수",14,"음악");
        studentRepository.save(student);
    }
}
