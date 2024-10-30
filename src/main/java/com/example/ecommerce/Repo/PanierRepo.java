package com.example.ecommerce.Repo;

import com.example.ecommerce.Entity.Panier;
import com.example.ecommerce.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PanierRepo extends JpaRepository<Panier, Long> {
}
