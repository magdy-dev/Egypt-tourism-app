package com.tourism.egypt.tourism_app.repository;

import com.tourism.egypt.tourism_app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}