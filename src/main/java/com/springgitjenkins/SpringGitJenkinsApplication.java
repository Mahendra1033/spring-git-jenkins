package com.springgitjenkins;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringGitJenkinsApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringGitJenkinsApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("The Application has been started !!! ");
		logger.info("The Application has been started Again and Again !!! ");
	}
	
	public static void main(String[] args) {
		logger.info("Application Excecuted ... ");
		SpringApplication.run(SpringGitJenkinsApplication.class, args);
	}

}
