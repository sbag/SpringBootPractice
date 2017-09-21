package com.baxter.springBootWebapp4.SpringBootWebApp4Security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SuppressWarnings("unused")
@SpringBootApplication
@ComponentScan(basePackages={"com.baxter.springBoot.controller","com.baxter.springBoot.model","com.baxter.springBoot.service"
		,"com.baxter.springBoot.web.security"})
public class SpringBootWebAppSecurityJPAApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebAppSecurityJPAApplication.class, args);
	}
}
