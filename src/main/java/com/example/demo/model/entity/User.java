package com.example.demo.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User extends BaseEntity{
    @Column(nullable = false)
    private String username;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(name = "registration_date", nullable = false)
    private LocalDate registrationDate;

    @OneToMany(mappedBy = "user")
    private List<Goal> goals;
    @OneToMany(mappedBy = "user")
    private List<Workout> workouts;

    @ManyToMany
    private List<Workout> favourites;
}
