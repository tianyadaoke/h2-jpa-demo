package com.florhispania.h2demo.dao.onetomany;

import com.florhispania.h2demo.bean.onetomany.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
