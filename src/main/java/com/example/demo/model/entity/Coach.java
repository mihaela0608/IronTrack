package com.example.demo.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "coaches")
public class Coach extends BaseEntity{

    @OneToOne
    private User user;

    @ManyToOne
    private Team team;
}
