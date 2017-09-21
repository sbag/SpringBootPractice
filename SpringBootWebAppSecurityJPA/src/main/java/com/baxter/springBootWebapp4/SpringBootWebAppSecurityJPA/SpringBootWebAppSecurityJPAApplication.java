package com.baxter.springBootWebapp4.SpringBootWebAppSecurityJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SuppressWarnings("unused")
@SpringBootApplication
@ComponentScan(basePackages={"com.baxter.springBoot.controller","com.baxter.springBoot.model","com.baxter.springBoot.service"
		,"com.baxter.springBoot.web.security"})
@EntityScan("com.baxter.springBoot.model")
@EnableJpaRepositories("com.baxter.springBoot.service")
public class SpringBootWebAppSecurityJPAApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebAppSecurityJPAApplication.class, args);
	}
}
