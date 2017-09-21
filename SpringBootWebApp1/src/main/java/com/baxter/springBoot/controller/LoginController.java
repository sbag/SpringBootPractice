package com.baxter.springBoot.controller;

import java.lang.reflect.Method;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.baxter.springBoot.service.LoginService;

@SuppressWarnings("unused")
@Controller
public class LoginController {
	@Autowired
	LoginService service;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String showView(Model model)
	{
		return "login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String showWelcome(Model model, @RequestParam String name, @RequestParam String password)
	{
		boolean isValidated = service.validateUser(name, password);
		if (!isValidated)
		{
			model.addAttribute("errorMessage", "Invalid Credentials !!!");
			return "login";
		}
		model.addAttribute("name", name);
		model.addAttribute("password", password);
		return "welcome";
	}

}
