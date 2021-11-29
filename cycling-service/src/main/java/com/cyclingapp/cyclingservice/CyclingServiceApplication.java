package com.cyclingapp.cyclingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.cyclingapp.cyclingservice"})
public class CyclingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CyclingServiceApplication.class, args);
	}

}
