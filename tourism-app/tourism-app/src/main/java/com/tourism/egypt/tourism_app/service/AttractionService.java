package com.tourism.egypt.tourism_app.service;

import com.tourism.egypt.tourism_app.model.Attraction;
import com.tourism.egypt.tourism_app.repository.AttractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttractionService {

    @Autowired
    private AttractionRepository attractionRepository;

    public List<Attraction> getAllAttractions() {
        return attractionRepository.findAll();
    }

    public Attraction getAttractionById(Long id) {
        return attractionRepository.findById(id).orElse(null);
    }

    public Attraction createAttraction(Attraction attraction) {
        return attractionRepository.save(attraction);
    }

    public Attraction updateAttraction(Long id, Attraction attractionDetails) {
        Attraction attraction = attractionRepository.findById(id).orElse(null);
        if (attraction != null) {
            attraction.setTitle(attractionDetails.getTitle());
            attraction.setDescription(attractionDetails.getDescription());
            attraction.setLocation(attractionDetails.getLocation());
            attraction.setPrice(attractionDetails.getPrice());
            attraction.setStartDate(attractionDetails.getStartDate());
            attraction.setMaxPersons(attractionDetails.getMaxPersons());
            attraction.setImageUrl(attractionDetails.getImageUrl());
            attraction.setRating(attractionDetails.getRating());
            return attractionRepository.save(attraction);
        }
        return null;
    }

    public void deleteAttraction(Long id) {
        attractionRepository.deleteById(id);
    }

    public List<Attraction> getAttractionsByLocation(String location) {
        return attractionRepository.findByLocation(location);
    }

    public List<Attraction> getAttractionsByOwnerId(Long ownerId) {
        return attractionRepository.findByOwnerId(ownerId);
    }
}