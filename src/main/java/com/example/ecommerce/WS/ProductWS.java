package com.example.ecommerce.WS;

import com.example.ecommerce.Entity.Product;
import com.example.ecommerce.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/products")
public class ProductWS {

    @Autowired
    private final ProductService productService;

    public ProductWS(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/")
    public ResponseEntity<Product> save(@RequestBody Product product) throws ParseException {
        Product saved = productService.save(product);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

    @GetMapping("/")
    public ResponseEntity<List<Product>> findAll() {
        List<Product> products = productService.findAll();
        return new ResponseEntity(products, HttpStatus.OK);
    }
}
