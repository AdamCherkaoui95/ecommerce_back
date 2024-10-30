package com.example.ecommerce.Service;

import com.example.ecommerce.Entity.Product;
import com.example.ecommerce.Repo.ProductRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class ProductService {

    @Autowired
    private final ProductRepo productRepo;

    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }


    public Product save(Product product) throws ParseException {
        Date date = new Date();
        SimpleDateFormat DateFor = new SimpleDateFormat("MM-dd-yyyy");
        Date date1 = DateFor.parse(DateFor.format(date));
        product.setCreatedAt(date1);
        product.setUpdatedAt(date1);
        if (product.getId() == 0) {
            product.setId(null);
        }
        Product product1 =productRepo.save(product);
        return product1;
    }

    public List<Product> findAll() {
        return productRepo.findAll();
    }



}
