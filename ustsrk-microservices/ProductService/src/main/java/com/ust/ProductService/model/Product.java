package com.ust.ProductService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    public String rating;
    public Long mcode;
}
