package com.srk.MovieUser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MovieUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieUserApplication.class, args);
	}

}