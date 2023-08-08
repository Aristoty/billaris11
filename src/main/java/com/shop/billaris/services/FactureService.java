package com.shop.billaris.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.billaris.models.Facture;
import com.shop.billaris.repositories.FactureRepository;

@Service
public class FactureService {

    @Autowired
    private FactureRepository factureRepository;

    public List<Facture> getAllFactures(){
        List<Facture> factures = new ArrayList<>();
        factureRepository.findAll().forEach(factures::add);
        return factures;
    }
    
    public Facture getFactureById(Long idFacture){
        return factureRepository.findById(idFacture).orElse(null);
    }

    public void createFacture(Facture facture){
        factureRepository.save(facture);
    }

    public void updateFacture(Facture facture, Long idFacture){

        factureRepository.save(facture);
    }

    public void deleteFacture(Long idFacture){
        factureRepository.deleteById(idFacture);
    }
}
