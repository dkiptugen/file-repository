package com.ashken.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthenticationController {
	
	@RequestMapping("/")
	public String getLoginPage()
	{
		return "login";
	}
	
	@RequestMapping("/home")
	public String getHomePage()
	{
		return "home";
	}

}
