package com.fis.innovate48.thor.registration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping("/")
	public String login() {
		return "login.html";
	}
	@GetMapping("/registartion")
	public String registartion() {		
		return "registartion.html";
	}
}
