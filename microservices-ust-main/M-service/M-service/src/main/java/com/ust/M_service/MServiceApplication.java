package com.ust.M_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MServiceApplication.class, args);
	}

}
