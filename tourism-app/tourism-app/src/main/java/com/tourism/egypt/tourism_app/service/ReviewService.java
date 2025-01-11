package com.tourism.egypt.tourism_app.service;


import com.tourism.egypt.tourism_app.model.Review;
import com.tourism.egypt.tourism_app.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    public Review getReviewById(Long id) {
        return reviewRepository.findById(id).orElse(null);
    }

    public Review createReview(Review review) {
        return reviewRepository.save(review);
    }

    public Review updateReview(Long id, Review reviewDetails) {
        Review review = reviewRepository.findById(id).orElse(null);
        if (review != null) {
            review.setComment(reviewDetails.getComment());
            review.setRating(reviewDetails.getRating());
            return reviewRepository.save(review);
        }
        return null;
    }

    public void deleteReview(Long id) {
        reviewRepository.deleteById(id);
    }

    public List<Review> getReviewsByAttractionId(Long attractionId) {
        return reviewRepository.findByAttractionId(attractionId);
    }

    public List<Review> getReviewsByEventId(Long eventId) {
        return reviewRepository.findByEventId(eventId);
    }

    public List<Review> getReviewsByUserId(Long userId) {
        return reviewRepository.findByUserId(userId);
    }
}