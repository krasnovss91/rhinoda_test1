package com.example.rhinoda_test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RhinodaTest1Application {

	public static void main(String[] args) {
		SpringApplication.run(RhinodaTest1Application.class, args);
	}

}
