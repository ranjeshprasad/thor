package com.fis.innovate48.thor.skills.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fis.innovate48.thor.skills.service.SkillsService;

@Controller
public class SkillsController {
	
	@Autowired
	private SkillsService skillsService;
	
	@GetMapping("/skills")
	public String getSkills() {
		return "skills/skills.html";
	}
	
	@RequestMapping("/skills")
	public String saveSkills() {
		return "skills/skills.html";
	}

}
