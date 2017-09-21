package com.baxter.springBoot.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@SuppressWarnings("unused")
@Service
public class LoginService {

	public boolean validateUser(String userid, String password) {
		// sourav, sourav
		return userid.equalsIgnoreCase("sourav")
				&& password.equalsIgnoreCase("sourav");
	}

}
