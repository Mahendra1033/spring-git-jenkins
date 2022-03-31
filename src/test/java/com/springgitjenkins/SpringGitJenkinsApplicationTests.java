package com.springgitjenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringGitJenkinsApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringGitJenkinsApplicationTests.class);
	
	@Test
	void contextLoads() {
		logger.info("The Test Case has been executed ... ");
		assertEquals(true, true);
	}

}
