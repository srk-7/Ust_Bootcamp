package com.srk.movie_details;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MovieDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieDetailsApplication.class, args);
	}

}
