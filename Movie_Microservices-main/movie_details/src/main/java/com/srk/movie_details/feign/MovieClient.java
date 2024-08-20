package com.srk.movie_details.feign;

import com.srk.movie_details.client.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@FeignClient(name="MovieUser", url="http://localhost:9098/m1")
public interface MovieClient {
    @GetMapping("/movie/{mid}")
    List<User> findUsersByMcode(@PathVariable("mid") Integer mid);
}