package com.org.voter_application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.ui.ModelMap;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class VoterApplication {

	public static void main(String[] args) {
		SpringApplication.run(VoterApplication.class, args);
	}

}
