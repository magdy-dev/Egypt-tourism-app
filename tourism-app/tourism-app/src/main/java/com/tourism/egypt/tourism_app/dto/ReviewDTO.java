package com.tourism.egypt.tourism_app.dto;


import lombok.Data;

@Data
public class ReviewDTO {
    private Long id;
    private String comment;
    private double rating;
    private Long userId;       // To associate the review with a user
    private Long attractionId; // To associate the review with an attraction
    private Long eventId;      // To associate the review with an event
}