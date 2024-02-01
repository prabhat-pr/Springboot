package com.cdac.Lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.cdac.Lab")
public class ProductProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductProjectApplication.class, args);
	}

}
