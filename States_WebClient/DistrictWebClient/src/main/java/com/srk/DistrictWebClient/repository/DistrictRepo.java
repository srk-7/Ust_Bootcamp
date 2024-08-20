package com.srk.DistrictWebClient.repository;

import com.srk.DistrictWebClient.model.District;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DistrictRepo extends JpaRepository<District, Integer> {
    List<District> findByScode(String scode);

}