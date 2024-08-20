package com.ust.Security.repository;

import com.ust.Security.model.Userinfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userinforepository extends JpaRepository<Userinfo, Integer> {
}
