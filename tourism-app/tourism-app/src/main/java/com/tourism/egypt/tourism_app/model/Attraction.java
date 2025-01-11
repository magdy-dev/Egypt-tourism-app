package com.tourism.egypt.tourism_app.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
    public class Attraction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String location;
    private double price;
    private String startDate;
    private int maxPersons;
    private String imageUrl;
    private double rating;

    // Many-to-One relationship with Owner
    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private Owner owner;
}