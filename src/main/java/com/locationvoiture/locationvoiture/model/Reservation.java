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
@Table(name = "Reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_reservation")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "ID_user")
    private User user;
    @ManyToOne
    @JoinColumn(name = "ID_car")
    private Car car;

    private Date dateDebut;
    private Date dateFin;
}
