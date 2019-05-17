package com.sergey.didenko.spring.hqljdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Main class
 */
@SpringBootApplication
@EnableConfigurationProperties({LiquibaseProperties.class})
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}

