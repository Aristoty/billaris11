package com.shop.billaris.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity 
public class Client {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long idClient;

    private String nom;
    private String adresse;
    private String numeroTelephone;


    @OneToMany(mappedBy = "client")
    private List<Facture> factures;


    //Constructs
    public Client() {
    }


    public Client(Long idClient, String nom, String adresse, String numeroTelephone, List<Facture> factures) {
        this.idClient = idClient;
        this.nom = nom;
        this.adresse = adresse;
        this.numeroTelephone = numeroTelephone;
        this.factures = factures;
    }

    // Getters and setters
    public Long getIdClient() {
        return this.idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNumeroTelephone() {
        return this.numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public List<Facture> getFactures() {
        return this.factures;
    }

    public void setFactures(List<Facture> factures) {
        this.factures = factures;
    }


}
