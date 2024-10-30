package com.example.ecommerce.Service;

import com.example.ecommerce.Entity.PanierDetail;
import com.example.ecommerce.Repo.PanierRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class PanierService {

    @Autowired
    private final PanierRepo panierRepo;

    public PanierService(PanierRepo panierRepo) {
        this.panierRepo = panierRepo;
    }


    public PanierDetail save(PanierDetail panierDetail) throws ParseException {
        if (panierDetail.getId() == 0)
            panierDetail.setId(null);
        return panierRepo.save(panierDetail);
    }

    public List<PanierDetail> findAll() {
        return panierRepo.findAll();
    }

}
