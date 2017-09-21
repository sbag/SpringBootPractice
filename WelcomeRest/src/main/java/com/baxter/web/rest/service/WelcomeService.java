package com.baxter.web.rest.service;

import org.springframework.stereotype.Component;

@Component
public class WelcomeService {
	
	public String retrieveWelcomeMessage()
	{
		return "Hello message from sourav..";
	}

}
