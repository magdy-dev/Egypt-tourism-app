package com.tourism.egypt.tourism_app.repository;

import com.tourism.egypt.tourism_app.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Long> {
    Owner findByEmail(String email);
}