package com.fis.innovate48.thor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fis.innovate48.thor.repository.SkillsRepository;

@Service
public class SkillsService {
	
	@Autowired
	private SkillsRepository userSkillsRepository;

}
