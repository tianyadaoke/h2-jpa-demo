package com.florhispania.h2demo.web;

import com.florhispania.h2demo.bean.manytomany.Menu;
import com.florhispania.h2demo.bean.manytomany.Role;
import com.florhispania.h2demo.bean.manytomany.User;
import com.florhispania.h2demo.dao.manytomany.MenuRepository;
import com.florhispania.h2demo.dao.manytomany.RoleRepository;
import com.florhispania.h2demo.dao.manytomany.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class UserRoleMenuController {

    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;
    @Autowired
    MenuRepository menuRepository;

    @PostMapping("/user")
    @Transactional
    public void add( ) {
        User user = new User();
        user.setUserName("carlos");
        user.setAge(30);

        Role role = new Role();
        role.setRoleName("java programmer");

        Menu menu = new Menu();
        menu.setMenuName("/cart/productos");

        role.getMenus().add(menu);
        user.getRoles().add(role);
        userRepository.save(user);
    }

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        return userRepository.findById(id).orElse(new User());
    }

    @GetMapping("/users")
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/roles")
    public List<Role> findAllRoles() {
        return roleRepository.findAll();
    }

    @GetMapping("/menus")
    public List<Menu> findAllMenus() {
        return menuRepository.findAll();
    }

}
