package com.fis.innovate48.thor.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fis.innovate48.thor.registration.dto.UsersDto;
import com.fis.innovate48.thor.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class UserController {

	@Autowired
	public UserService userService;
	
	@GetMapping("/")
	public String login() {
		
		return "login.html";
	}
	@GetMapping("/registartion")
	public String registartion() {		
		return "registartion.html";
	}
	
	@RequestMapping(value = "validateUser",method = RequestMethod.POST)
	public String checkCredential(@ModelAttribute UsersDto user,Model model,HttpServletRequest request) {
		log.info("validateUser called");
				
		Boolean response = userService.validateUser(user,request);		
		if(response) {
			model.addAttribute("email", user.getEmail());
			model.addAttribute("loginResponse", "success");
		}
		else {
			model.addAttribute("loginResponse", "Invalid Credential, Please check username/password");
		}
		return "login.html";
	}
	
	
}
