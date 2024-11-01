package com.example.ecommerce.Repo;

import com.example.ecommerce.Entity.PanierDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PanierRepo extends JpaRepository<PanierDetail, Long> {
}
