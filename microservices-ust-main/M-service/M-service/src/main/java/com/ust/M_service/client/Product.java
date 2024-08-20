package com.ust.M_service.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
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
