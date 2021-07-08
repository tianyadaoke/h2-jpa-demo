package com.florhispania.h2demo.dao.manytomany;

import com.florhispania.h2demo.bean.manytomany.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
