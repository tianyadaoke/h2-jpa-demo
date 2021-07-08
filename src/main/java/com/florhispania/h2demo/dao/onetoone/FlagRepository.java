package com.florhispania.h2demo.dao.onetoone;

import com.florhispania.h2demo.bean.onetoone.Flag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlagRepository extends JpaRepository<Flag,Long> {
}
