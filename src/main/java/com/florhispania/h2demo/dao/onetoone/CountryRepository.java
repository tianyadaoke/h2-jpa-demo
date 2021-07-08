package com.florhispania.h2demo.dao.onetoone;

import com.florhispania.h2demo.bean.onetoone.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Long> {
}
