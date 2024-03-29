package com.dev.jenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JenkinsApplicationTests {

	public  static Logger logger = LoggerFactory.getLogger(JenkinsApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test Being Executed... Hello world. this is my test build path");
		logger.info("Its Test Commit. ITs second commit");
		logger.info("Test Commit 02");
		assertEquals(true, true);
	}

}
