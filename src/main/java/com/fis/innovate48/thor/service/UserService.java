package com.fis.innovate48.thor.service;


import java.util.Objects;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fis.innovate48.thor.model.Users;
import com.fis.innovate48.thor.registration.dto.UsersDto;
import com.fis.innovate48.thor.repository.UserRepository;


@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	
	
	@Transactional
	public Users findById(int id) {
		Users userDetails = userRepository.findById(id);
		
		return userDetails;
	}
	
	@Transactional
	public Boolean validateUser(UsersDto userDto, HttpServletRequest request) {
		
		Users user = new Users();
		BeanUtils.copyProperties(userDto, user);
		
		Users response = userRepository.validateUserCredentials(user);
		if(Objects.nonNull(response)) {
			request.setAttribute("User", response);
			return true;			
		}
		return false;
	}
	
	
	


}
