package com.ust.ProductService.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class Productdto {
    public Long id;
    @NotNull(message = "Product name cannot be null")
    @NotEmpty(message = "Product name cannot be empty")
    public String productname;
    @Size(min = 1,max=200, message = "Category should be greater than 0")
    public String category;
    @Min(value = 1, message = "Price should be greater than 0")
    @NotNull(message = "Price cannot be null")
    @Digits(integer = 10, fraction = 2, message = "Price should have maximum 2 decimal places")
    public double price;
    public String brand;
    @Pattern(regexp = "^(new|used|refurbished)$", message = "Quality should be new, used, or refurbished")
    public String quality;
    public String info;
    @Size(min = 5, max = 1000, message = "Description should be between 10 and 1000 characters")
    public String image;
    @Min(value = 1, message = "Rating should be between 1 and 5")
    @Max(value = 5, message = "Rating should be between 1 and 5")
    public int rating;
    public Long mcode;
}
