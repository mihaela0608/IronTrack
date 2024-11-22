package com.example.demo.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "workouts")
@Getter
@Setter
public class Workout extends BaseEntity{
    @Column(nullable = false)
    private String title;
    private String description;
    private String instructions;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Intensity intensity;
    @ManyToOne
    private User user;
    @Column(nullable = false)
    private LocalDateTime created;


}
