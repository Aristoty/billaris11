package com.shop.billaris.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Adresse {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idAdresse;

    private String rue;
    private String ville;
    private String etat;
    private String CodePostal;
    private String pays;


}
