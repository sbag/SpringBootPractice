package com.baxter.springBoot.SpringBootWebApp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.baxter.springBoot.controller","com.baxter.springBoot.service"})
public class SpringBootWebApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebApp1Application.class, args);
	}
}
