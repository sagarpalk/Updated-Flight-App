package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages="com.cybage")
@EnableJpaRepositories("com.cybage.repositories")
@EntityScan("com.cybage.model")
public class HibernateMappingApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateMappingApplication.class, args);
	}

}