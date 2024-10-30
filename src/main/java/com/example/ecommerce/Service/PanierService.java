package com.example.ecommerce.Service;

import com.example.ecommerce.Entity.Panier;
import com.example.ecommerce.Repo.PanierRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;

@Service
@Transactional
public class PanierService {

    @Autowired
    private final PanierRepo panierRepo;

    public PanierService(PanierRepo panierRepo) {
        this.panierRepo = panierRepo;
    }


    public Panier save(Panier panier) throws ParseException {
        Panier panier1 =panierRepo.save(panier);
        return panier1;
    }

    public List<Panier> findAll() {
        return panierRepo.findAll();
    }

}
