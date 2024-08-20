package com.ust.ProductService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    @Id
    public Long id;
    public String productname;
    public String category;
    public double price;
    public String brand;
    public String quality;
    public String info;
    public String image;
    public int rating;
    public Long mcode;

}
