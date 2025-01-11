package com.tourism.egypt.tourism_app.repository;

import com.tourism.egypt.tourism_app.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    // Custom query methods (if needed)
    List<Review> findByAttractionId(Long attractionId);
    List<Review> findByEventId(Long eventId);
    List<Review> findByUserId(Long userId);
}