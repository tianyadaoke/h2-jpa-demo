package com.florhispania.h2demo.dao.onetomany;

import com.florhispania.h2demo.bean.onetomany.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassroomRepository extends JpaRepository<Classroom,Long> {
}
