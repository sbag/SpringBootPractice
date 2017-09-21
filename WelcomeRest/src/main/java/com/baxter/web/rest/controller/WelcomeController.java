package com.baxter.web.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baxter.web.rest.service.WelcomeService;

@RestController

public class WelcomeController {
	@Autowired
	private WelcomeService service;
	
	@RequestMapping("/welcome")
	public String showWelcomeMessage()
	{
		return service.retrieveWelcomeMessage();
	}

}
