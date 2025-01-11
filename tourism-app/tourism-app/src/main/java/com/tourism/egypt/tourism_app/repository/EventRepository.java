package com.tourism.egypt.tourism_app.repository;

import com.tourism.egypt.tourism_app.model.Attraction;
import com.tourism.egypt.tourism_app.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findByLocation(String location);
    List<Event> findByOwnerId(Long ownerId);
}
