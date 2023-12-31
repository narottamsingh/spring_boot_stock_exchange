package com.bce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info =
	@Info(title = "Order Book API", version = "1.0", description = "Documentation Order Book API v1.0")
)
public class OrderBookServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderBookServiceApplication.class, args);
	}

}
