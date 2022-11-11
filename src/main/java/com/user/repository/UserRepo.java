package com.user.repository;

import com.user.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users,String> {
    Users findByLoginId(String loginId);
}
