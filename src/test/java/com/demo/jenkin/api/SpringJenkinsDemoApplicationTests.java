package com.demo.jenkin.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsDemoApplicationTests {
	
	public static final Logger LOGGER = LoggerFactory.getLogger(SpringJenkinsDemoApplicationTests.class);

	@Test
	void contextLoads() {
		LOGGER.info("Test case executing...");
		LOGGER.info("Test case executing...SECOND LOG STATEMENT...");
		assertEquals(true, true);
	}

}
