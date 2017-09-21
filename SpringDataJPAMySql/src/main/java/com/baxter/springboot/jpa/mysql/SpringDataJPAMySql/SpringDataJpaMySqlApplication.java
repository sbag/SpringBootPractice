package com.baxter.springboot.jpa.mysql.SpringDataJPAMySql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages={"com.baxter.springboot.mysql.jpa"})
@EntityScan("com.baxter.springboot.mysql.jpa")
@EnableJpaRepositories("com.baxter.springboot.mysql.jpa")
public class SpringDataJpaMySqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaMySqlApplication.class, args);
	}
}
