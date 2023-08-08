package com.shop.billaris.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Facture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFacture;

    private String numeroFacture;
    private String date;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToMany
    @JoinTable(
        name = "facture_produit",
        joinColumns = @JoinColumn(name= "facture_id"),
        inverseJoinColumns = @JoinColumn(name= "produit_id")
    )
    private List<Produit> produits;

    @ManyToMany
    @JoinTable(
            name = "facture_adresse",
            joinColumns =  @JoinColumn(name = "facture_id"),
            inverseJoinColumns = @JoinColumn(name = "adresse_id")
    )
    private Adresse adresseFacture;


    
}
