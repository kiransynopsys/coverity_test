package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsPipelineDemoApplication {

	public static void main(String[] args) {
		String value = null;
		System.out.println(value.substring(0));
		SpringApplication.run(JenkinsPipelineDemoApplication.class, args);
	}

}
