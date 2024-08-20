package com.srk.movie_details.controller;

import com.srk.movie_details.client.FullResponse;
import com.srk.movie_details.model.Movie;
import com.srk.movie_details.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    public MovieService service;

    @PostMapping("/addMovie")
    public Movie addMovie(@RequestBody Movie movie){
        return service.addMovie(movie);
    }

    @GetMapping("/getMovie/{mid}")
    public Movie getMovie(int mid){
        return service.getMovieById(mid);
    }

    @GetMapping("/getAllMovies")
    public List<Movie> getAllMovies(){
        return service.getAllMovies();
    }

    @DeleteMapping("/deleteMovie/{mid}")
    public String deleteMovie(@PathVariable int mid){
        return service.deleteMovie(mid);
    }

    @GetMapping("withusers/{mid}")
    public ResponseEntity<FullResponse> finduserByMid(@PathVariable("mid") Integer mid){
        return ResponseEntity.ok(service.finduserByMid(mid));
    }
}