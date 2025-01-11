package com.tourism.egypt.tourism_app.dto;


import lombok.Data;

@Data
public class AttractionDTO {
    private Long id;
    private String title;
    private String description;
    private String location;
    private double price;
    private String startDate;
    private int maxPersons;
    private String imageUrl;
    private double rating;
    private Long ownerId; // To associate the attraction with an owner
}