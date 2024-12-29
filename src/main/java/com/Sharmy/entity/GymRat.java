package com.Sharmy.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "gym_rat")
public class GymRat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "training_level", nullable = false)
    private String trainingLevel;

    @Column(nullable = false)
    private String goals;

    @Column(nullable = false)
    private String availableHours;


    private String location;

    @Column(nullable = false)
    private String preferences;

    @OneToOne(mappedBy = "gymRat")
    private User user;

}
