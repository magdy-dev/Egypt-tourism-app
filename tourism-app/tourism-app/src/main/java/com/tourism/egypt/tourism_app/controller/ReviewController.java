package com.tourism.egypt.tourism_app.controller;


import com.tourism.egypt.tourism_app.model.Review;
import com.tourism.egypt.tourism_app.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @GetMapping
    public List<Review> getAllReviews() {
        return reviewService.getAllReviews();
    }

    @GetMapping("/{id}")
    public Review getReviewById(@PathVariable Long id) {
        return reviewService.getReviewById(id);
    }

    @PostMapping
    public Review createReview(@RequestBody Review review) {
        return reviewService.createReview(review);
    }

    @PutMapping("/{id}")
    public Review updateReview(@PathVariable Long id, @RequestBody Review reviewDetails) {
        return reviewService.updateReview(id, reviewDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteReview(@PathVariable Long id) {
        reviewService.deleteReview(id);
    }

    @GetMapping("/attraction/{attractionId}")
    public List<Review> getReviewsByAttractionId(@PathVariable Long attractionId) {
        return reviewService.getReviewsByAttractionId(attractionId);
    }

    @GetMapping("/event/{eventId}")
    public List<Review> getReviewsByEventId(@PathVariable Long eventId) {
        return reviewService.getReviewsByEventId(eventId);
    }

    @GetMapping("/user/{userId}")
    public List<Review> getReviewsByUserId(@PathVariable Long userId) {
        return reviewService.getReviewsByUserId(userId);
    }
}