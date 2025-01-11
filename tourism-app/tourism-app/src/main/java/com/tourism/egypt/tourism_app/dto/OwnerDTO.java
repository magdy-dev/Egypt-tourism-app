package com.tourism.egypt.tourism_app.dto;


import lombok.Data;

@Data
public class OwnerDTO {
    private Long id;
    private String name;
    private String email;
    private String password;
}