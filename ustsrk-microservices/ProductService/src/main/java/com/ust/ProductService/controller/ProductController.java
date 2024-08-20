package com.ust.ProductService.controller;
import com.ust.ProductService.dto.Productdto;
import com.ust.ProductService.model.Product;
import com.ust.ProductService.service.ProductService;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")

public class ProductController {
        @Autowired
        private ProductService productService;

        @PostMapping("/addproducts")
        public ResponseEntity<Product> addProducts(@RequestBody @Valid Productdto productList) {
                return new ResponseEntity<>(productService.addProducts(productList), HttpStatus.CREATED);
        }

        @GetMapping("/getproducts")
        public ResponseEntity<List<Product>> getProducts(){
                List<Product> products = productService.getProducts();
                return new ResponseEntity<>(products, HttpStatus.OK);
        }

        @GetMapping("/getproductbyid/{id}")
        public ResponseEntity<Product> getProductById(@PathVariable Long id){
                return new ResponseEntity<>(productService.getProductById(id), HttpStatus.OK);
        }

        @DeleteMapping("/delete/{id}")
        public ResponseEntity<String> deleteProduct(@PathVariable Long id) {
                productService.deleteProductById(id);
                return new ResponseEntity<>("Product removed from the database", HttpStatus.OK);
        }
        @GetMapping("company/{mcode}")
        public ResponseEntity<List<Product>> getProductsByMcode(@PathVariable Long mcode) {
                return ResponseEntity.ok(productService.getProductsByMcode(mcode));
        }
}