package com.florhispania.h2demo.dao.manytomany;

import com.florhispania.h2demo.bean.manytomany.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu,Long> {
}
