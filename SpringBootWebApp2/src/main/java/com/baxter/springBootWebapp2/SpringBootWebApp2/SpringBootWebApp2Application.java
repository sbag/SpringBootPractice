package com.baxter.springBootWebapp2.SpringBootWebApp2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SuppressWarnings("unused")
@SpringBootApplication
@ComponentScan(basePackages={"com.baxter.springBoot.controller","com.baxter.springBoot.model","com.baxter.springBoot.service"})
public class SpringBootWebApp2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebApp2Application.class, args);
	}
}
