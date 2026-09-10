package com.example.javaweb2.model;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class Note {
    private Long id;
    private String title;
    private String content;
    private String category;
    private LocalDateTime createdAt;
}
