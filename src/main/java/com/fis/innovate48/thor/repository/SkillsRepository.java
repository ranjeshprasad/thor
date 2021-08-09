package com.fis.innovate48.thor.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fis.innovate48.thor.model.Skills;

@Repository
public interface SkillsRepository  extends  CrudRepository<Skills, Integer>{
	
	public List<Skills> findAll();
	public Skills save(Skills userSkills);
	

}
