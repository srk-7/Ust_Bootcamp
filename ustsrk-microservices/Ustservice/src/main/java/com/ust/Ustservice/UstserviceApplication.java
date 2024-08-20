package com.ust.Ustservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class UstserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UstserviceApplication.class, args);
	}

}