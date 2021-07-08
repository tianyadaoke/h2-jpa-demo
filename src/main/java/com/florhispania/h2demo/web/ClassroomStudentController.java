package com.florhispania.h2demo.web;

import com.florhispania.h2demo.bean.onetomany.Classroom;
import com.florhispania.h2demo.bean.onetomany.Student;
import com.florhispania.h2demo.dao.onetomany.ClassroomRepository;
import com.florhispania.h2demo.dao.onetomany.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class ClassroomStudentController {
    @Autowired
    ClassroomRepository classroomRepository;
    @Autowired
    StudentRepository studentRepository;
    @PostMapping("/student")
    @Transactional
    public void addStudent(){
        Classroom classroom = new Classroom();
        classroom.setClassroomAddress("1-101");
        classroom.setClassroomName("dragon class");

        Student student = new Student();
        student.setStudentName("carlos");
        student.setTelephone("689865565555");
        student.setClassroom(classroom);

        studentRepository.save(student);
    }

    @GetMapping("/students")
    public List<Student> findAll(){
        return studentRepository.findAll();
    }
}
