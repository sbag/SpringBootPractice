package com.baxter.springboot.jpa.data.rest.SpringBootDataRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages={"com.baxter.springboot.jpa.data.rest.SpringBootDataRest.samples"})
@EnableJpaRepositories("com.baxter.springboot.jpa.data.rest.SpringBootDataRest.samples")
@EntityScan("com.baxter.springboot.jpa.data.rest.SpringBootDataRest.samples")
public class SpringBootDataRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataRestApplication.class, args);
	}
}
