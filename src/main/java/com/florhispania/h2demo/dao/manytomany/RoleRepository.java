package com.florhispania.h2demo.dao.manytomany;

import com.florhispania.h2demo.bean.manytomany.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
