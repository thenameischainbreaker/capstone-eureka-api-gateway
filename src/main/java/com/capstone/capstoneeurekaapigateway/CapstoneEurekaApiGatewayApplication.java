package com.capstone.capstoneeurekaapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CapstoneEurekaApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapstoneEurekaApiGatewayApplication.class, args);
	}

}
