package com.authenticate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AuthenticateApplication {

	

	public static void main(String[] args) {
		SpringApplication.run(AuthenticateApplication.class, args);
	}

}
