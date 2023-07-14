package com.locationvoiture.locationvoiture.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "User")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_user")
    private Long id;
    @Column(name = "Name")
    private String name;
    @Column(name = "LastName")
    private String lasName;
    @Column(name = "Mobile")
    private String mobile;
    @Column(name = "CIN")
    private String cin;
    @Column(name = "Email")
    private String adrEmail;

}
