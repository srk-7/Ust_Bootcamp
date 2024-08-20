package com.ust.ProductService.repository;

import com.ust.ProductService.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Productrepo extends JpaRepository<Product, Long> {
    List<Product> findByMcode(Long mcode);
}
