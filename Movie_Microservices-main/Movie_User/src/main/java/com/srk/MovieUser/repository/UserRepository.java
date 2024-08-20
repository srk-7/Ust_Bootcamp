package com.srk.MovieUser.repository;

import com.srk.MovieUser.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByMid(Integer mid);

}