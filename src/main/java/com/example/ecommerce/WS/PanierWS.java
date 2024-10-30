package com.example.ecommerce.WS;

import com.example.ecommerce.Entity.PanierDetail;
import com.example.ecommerce.Entity.Product;
import com.example.ecommerce.Service.PanierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/panier")
public class PanierWS {
    @Autowired
    private final PanierService panierService;

    public PanierWS(PanierService panierService) {
        this.panierService = panierService;
    }

    @PostMapping("/")
    public ResponseEntity<List<PanierDetail>> save(@RequestBody List<PanierDetail> panierDetails) throws ParseException {
        List<PanierDetail> savedDetails = new ArrayList<>();
        for (PanierDetail panierDetail : panierDetails) {
            PanierDetail savedDetail = panierService.save(panierDetail);
            savedDetails.add(savedDetail);
        }
        return new ResponseEntity<>(savedDetails, HttpStatus.CREATED);
    }


}
