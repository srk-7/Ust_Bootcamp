package com.srk.DistrictWebClient.controller;

import com.srk.DistrictWebClient.model.District;
import com.srk.DistrictWebClient.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/district")
public class DistrictController {
    @Autowired
    public DistrictService service;

    @PostMapping("/saveDistrict")
    public District saveDistrict(@RequestBody District district) {
        return service.addDistrict(district);
    }

    @GetMapping("{did}")
    public District getDistrict(int did) {
        return service.getDistrictById(did);
    }

    @GetMapping("/all")
    public List<District> getAllDistricts() {
        return service.getAllDistricts();
    }

    @GetMapping("/{scode}")
    public List<District> getDistrictByState(@PathVariable String scode){
        return service.getDistrictByState(scode);
    }

}