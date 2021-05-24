package com.demo.jenkin.api;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsDemoApplication {

	public static final Logger LOGGER = LoggerFactory.getLogger(SpringJenkinsDemoApplication.class);

	@PostConstruct
	public void init() {
		LOGGER.info("Application started...");
	}

	public static void main(String[] args) {
		LOGGER.info("Application executing...");
		SpringApplication.run(SpringJenkinsDemoApplication.class, args);
	}

}
