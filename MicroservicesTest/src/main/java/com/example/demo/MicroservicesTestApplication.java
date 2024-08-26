package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EntityScan
public class MicroservicesTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesTestApplication.class, args);
	}
	

}
