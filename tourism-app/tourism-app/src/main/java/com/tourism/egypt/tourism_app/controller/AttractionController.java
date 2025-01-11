package com.tourism.egypt.tourism_app.controller;


import com.tourism.egypt.tourism_app.model.Attraction;
import com.tourism.egypt.tourism_app.service.AttractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/attractions")
public class AttractionController {

    @Autowired
    private AttractionService attractionService;

    @GetMapping
    public List<Attraction> getAllAttractions() {
        return attractionService.getAllAttractions();
    }

    @GetMapping("/{id}")
    public Attraction getAttractionById(@PathVariable Long id) {
        return attractionService.getAttractionById(id);
    }

    @PostMapping
    public Attraction createAttraction(@RequestBody Attraction attraction) {
        return attractionService.createAttraction(attraction);
    }

    @PutMapping("/{id}")
    public Attraction updateAttraction(@PathVariable Long id, @RequestBody Attraction attractionDetails) {
        return attractionService.updateAttraction(id, attractionDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteAttraction(@PathVariable Long id) {
        attractionService.deleteAttraction(id);
    }

    @GetMapping("/location/{location}")
    public List<Attraction> getAttractionsByLocation(@PathVariable String location) {
        return attractionService.getAttractionsByLocation(location);
    }

    @GetMapping("/owner/{ownerId}")
    public List<Attraction> getAttractionsByOwnerId(@PathVariable Long ownerId) {
        return attractionService.getAttractionsByOwnerId(ownerId);
    }
}