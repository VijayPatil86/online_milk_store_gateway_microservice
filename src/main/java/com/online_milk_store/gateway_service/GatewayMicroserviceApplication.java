package com.online_milk_store.gateway_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@EnableDiscoveryClient
@SpringBootApplication
public class GatewayMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayMicroserviceApplication.class, args);
	}

}
