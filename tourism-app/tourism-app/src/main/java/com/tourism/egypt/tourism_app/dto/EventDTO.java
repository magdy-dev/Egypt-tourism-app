package com.tourism.egypt.tourism_app.dto;


import lombok.Data;
import java.util.Date;

@Data
public class EventDTO {
    private Long id;
    private String title;
    private String description;
    private String location;
    private double price;
    private Date startDate;
    private int maxPersons;
    private String imageUrl;
    private Long ownerId; // To associate the event with an owner
}