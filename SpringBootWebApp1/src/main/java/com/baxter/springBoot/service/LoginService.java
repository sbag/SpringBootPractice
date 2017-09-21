package com.baxter.springBoot.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	public boolean validateUser(String username, String password)
	{
		//Should be always sourav / sourav
		return username.equalsIgnoreCase("sourav") && password.equals("sourav");
	}

}
