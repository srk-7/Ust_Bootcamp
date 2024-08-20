package com.srk.movie_details.service;

import com.srk.movie_details.client.FullResponse;
import com.srk.movie_details.client.User;
import com.srk.movie_details.feign.MovieClient;
import com.srk.movie_details.model.Movie;
import com.srk.movie_details.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    public Repository repo;

    @Autowired
    public MovieClient client;

    public Movie addMovie(Movie movie) {
        return repo.save(movie);
    }

    public String deleteMovie(int mid){
        repo.deleteById(mid);
        return "deleted";
    }

    public List<Movie> getAllMovies(){
        return repo.findAll();
    }

    public Movie getMovieById(int mid){
        return repo.findById(mid).orElse(null);
    }

    public FullResponse finduserByMid(Integer mid) {
        Movie c=  repo.findByMid(mid).orElse(null);
        List<User> list=client.findUsersByMcode(mid);
        FullResponse res= new FullResponse();
        res.setMid(c.getMid());
        res.setMname(c.getMname());
        res.setDirector(c.getDirector());
        res.setRelease_year(c.getRelease_year());
        res.setUsers(list);
        return res;
    }

}
