package com.fis.innovate48.thor.repository;


import com.fis.innovate48.thor.model.Users;



public interface UserRepository {
	
	public Users findById(int id);
	
	public Users validateUserCredentials(Users user);
	
	

}
