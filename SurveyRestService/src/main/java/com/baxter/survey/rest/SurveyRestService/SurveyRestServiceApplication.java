package com.baxter.survey.rest.SurveyRestService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.baxter.survey.rest.service","com.baxter.survey.rest.controller","com.baxter.survey.rest.model"})
public class SurveyRestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SurveyRestServiceApplication.class, args);
	}
}
