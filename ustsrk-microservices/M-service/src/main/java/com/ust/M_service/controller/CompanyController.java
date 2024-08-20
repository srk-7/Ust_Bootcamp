package com.ust.M_service.controller;

import com.ust.M_service.client.Fullresponse;
import com.ust.M_service.model.Minfo;
import com.ust.M_service.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/company")
@RequiredArgsConstructor
public class CompanyController {
    @Autowired
    private CompanyService service;

    @PostMapping("/addcompany")
    public Minfo saveCompany(@RequestBody Minfo company) {
        return service.saveCompany(company);
    }
    @GetMapping("/withproducts/{mcode}")
    public ResponseEntity<Fullresponse> findcompanyByMcode(@PathVariable("mcode") Long mcode){
        return ResponseEntity.ok(service.findcompanyByMcode(mcode));
    }
}