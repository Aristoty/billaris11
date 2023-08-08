package com.shop.billaris.repositories;

import org.springframework.data.repository.CrudRepository;

import com.shop.billaris.models.Facture;

public interface FactureRepository extends CrudRepository<Facture, Long> {
    
}
