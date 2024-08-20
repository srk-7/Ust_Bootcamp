package com.srk.StateWebClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class StateWebClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(StateWebClientApplication.class, args);
	}

	@Bean
	public WebClient webClient() {
		return WebClient.builder().build();
	}
}
