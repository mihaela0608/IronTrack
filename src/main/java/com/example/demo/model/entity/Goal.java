package com.example.demo.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "goals")
@Getter
@Setter
public class Goal extends BaseEntity {
    @ManyToOne
    private User user;
    @Column(name = "goal_type", nullable = false)
    private String goalType;
    @Column(nullable = false)
    private double target;
    @Column(name = "due_date")
    private LocalDate dueDate;

}
