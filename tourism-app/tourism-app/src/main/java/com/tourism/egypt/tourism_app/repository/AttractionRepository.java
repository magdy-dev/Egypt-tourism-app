package com.tourism.egypt.tourism_app.repository;

import com.tourism.egypt.tourism_app.model.Attraction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AttractionRepository extends JpaRepository<Attraction, Long> {
    List<Attraction> findByLocation(String location);
    List<Attraction> findByOwnerId(Long ownerId);
}
