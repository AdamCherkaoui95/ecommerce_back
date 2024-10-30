package com.example.ecommerce.Service;

import com.example.ecommerce.Entity.Product;
import com.example.ecommerce.Repo.ProductRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Optional;

@Service
@Transactional
public class ProductService {

    @Autowired
    private final ProductRepo productRepo;

    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }


    public Product save(Product product) throws ParseException {
        if (product.getId() == 0) {
            product.setId(null);
        }
        Product product1 =productRepo.save(product);
        return product1;
    }
    public Page<Product> findAll(int page, int size) {
        return productRepo.findAll(PageRequest.of(page, size));
    }

    public Optional<Product> findById(Long id) {
        return productRepo.findById(id);
    }



}
