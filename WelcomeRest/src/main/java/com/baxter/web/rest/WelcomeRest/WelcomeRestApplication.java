package com.baxter.web.rest.WelcomeRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.baxter.web.rest.controller","com.baxter.web.rest.service"})
public class WelcomeRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(WelcomeRestApplication.class, args);
	}
}
