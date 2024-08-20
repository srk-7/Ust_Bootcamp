package com.ust.M_service.repo;

import com.ust.M_service.model.Minfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Companyrepo extends JpaRepository<Minfo, Long>
{
    Optional<Minfo> findByMcode(Long mcode);
}