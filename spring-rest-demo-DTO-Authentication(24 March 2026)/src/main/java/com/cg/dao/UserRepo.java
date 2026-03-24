package com.cg.dao;

import com.cg.entity.Employee;
import com.cg.entity.UserBean;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserBean, String> {
}
