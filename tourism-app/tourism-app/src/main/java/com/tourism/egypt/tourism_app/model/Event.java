package com.tourism.egypt.tourism_app.model;


import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String location;
    private double price;
    private Date startDate;
    private int maxPersons;
    private String imageUrl;

    // Many-to-One relationship with Owner
    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private Owner owner;
}