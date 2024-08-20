package com.srk.movie_details.repository;

import com.srk.movie_details.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Repository extends JpaRepository<Movie, Integer> {

    Optional<Movie> findByMid(Integer mid);
}








