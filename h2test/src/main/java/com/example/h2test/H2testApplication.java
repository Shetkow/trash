package com.example.h2test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class H2testApplication {

	public static void main(String[] args) {
		SpringApplication.run(H2testApplication.class, args);

	}
	@Bean
	public CommandLineRunner testApp(Repository repo){
		return args -> {
			repo.save(new Entity("Entity1"));
			Iterable<Entity> entityList = repo.findAll();
			System.out.println(entityList);



		};
	}

}
