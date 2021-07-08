package com.florhispania.h2demo.bean.onetomany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "classroom_id")
    private Long classroomId;
    @Column(name = "classroom_name")
    private String classroomName;
    @Column(name = "classroom_address")
    private String classroomAddress;
    @OneToMany(mappedBy = "classroom",fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Student> students=new HashSet<>();

    public Long getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Long classroomId) {
        this.classroomId = classroomId;
    }

    public String getClassroomName() {
        return classroomName;
    }

    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName;
    }

    public String getClassroomAddress() {
        return classroomAddress;
    }

    public void setClassroomAddress(String classroomAddress) {
        this.classroomAddress = classroomAddress;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
