package com.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@GetMapping("/home")
	public String get()
	{
		return "testing of the api has been completed";
	}
	
}
