package com.locationvoiture.locationvoiture.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_car")
    private Long id;
    private String matricule;
    private String modele;
    private String marque;
    private String color;
    private int nbrPlace;
    private Date dateAchat;
    private boolean disponible;
}
