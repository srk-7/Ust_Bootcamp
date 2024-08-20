package com.ust.ProductService.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Productdto {
//    @NotNull(message="Product id cannot be null")
//    @NotEmpty(message="Product id cannot be empty")
    public Long id;
    @NotNull(message="Product name cannot be null")
    @NotEmpty(message="Product name cannot be empty")
    public String productname;
    public String category;
//    @Min(value=1, message="Price should be greater than 0")
//    @NotNull(message="Price cannot be null")
//    @Digits(integer=8, fraction=2, message="Price should have maximum 2 decimal places")
    public double price;
    public String brand;
    @Pattern(regexp="^(new|used|refurbished)$",message="Quality should be new, refurbished or used")
    public String quality;
    public String info;
    @Size(min=5,max=1000,message="Size should be between 10 to 1000 characters")
    public String image;
    @Min(value=1, message="Size should be between 1 and 5")
    @Max(value=5, message="Size should be between 1 and 5")
    public String rating;
//    @NotNull(message="Price cannot be null")
//    @NotEmpty(message="Model cannot be empty")
    public Long mcode;
}