package com.baxter.springBoot.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SuppressWarnings("unused")
@Controller
public class LogoutController {
	
	@RequestMapping(value="/logout",method = RequestMethod.GET)
	public String logOut(HttpServletRequest req, HttpServletResponse res)
	{
		System.out.println("Logout");
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if(auth.isAuthenticated())
		{
			new SecurityContextLogoutHandler().logout(req, res, auth);
		}
		System.out.println("Redirect...");
		return "redirect:/";
	}

}
