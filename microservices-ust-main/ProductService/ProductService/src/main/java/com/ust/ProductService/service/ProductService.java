package com.ust.ProductService.service;

import com.ust.ProductService.dto.Productdto;
import com.ust.ProductService.model.Product;
import com.ust.ProductService.repository.Productrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private Productrepo repo;

    public Product addProducts(Productdto productList) {
        Product product1 = Product.builder()
                .id(productList.getId())
                .productname(productList.getProductname())
                .category(productList.getCategory())
                .price(productList.getPrice())
                .brand(productList.getBrand())
                .quality(productList.getQuality())
                .info(productList.getInfo())
                .image(productList.getImage())
                .rating(productList.getRating())
                .mcode(productList.getMcode())
                .build();
        return repo.save(product1);
    }

    public List<Product> getProductsByMcode(Long mcode) {
        return repo.findByMcode(mcode);
    }
}



