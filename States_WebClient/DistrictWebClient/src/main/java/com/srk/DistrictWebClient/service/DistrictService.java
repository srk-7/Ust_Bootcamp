package com.srk.DistrictWebClient.service;

import com.srk.DistrictWebClient.model.District;
import com.srk.DistrictWebClient.repository.DistrictRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictService {

    @Autowired
    public DistrictRepo repo;

    public District addDistrict(District district) {
        return repo.save(district);
    }

    public List<District> getAllDistricts() {
        return repo.findAll();
    }

    public District getDistrictById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    public List<District> getDistrictByState(String scode) {
        return repo.findByScode(scode);
    }
}
