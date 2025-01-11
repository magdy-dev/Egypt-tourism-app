package com.tourism.egypt.tourism_app.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String comment;
    private double rating;

    // Many-to-One relationship with User
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    // Many-to-One relationship with Attraction
    @ManyToOne
    @JoinColumn(name = "attraction_id", nullable = false)
    private Attraction attraction;

    // Many-to-One relationship with Event
    @ManyToOne
    @JoinColumn(name = "event_id", nullable = false)
    private Event event;
}