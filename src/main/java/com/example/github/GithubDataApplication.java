package com.example.github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubDataApplication {


	public static void main(String[] args) {
		SpringApplication.run(GithubDataApplication.class, args);
        System.out.println("Hello World :: Github Data Application");
	}

}
