package com.Parse.Sayings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class SayingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SayingsApplication.class, args);


	}

}
