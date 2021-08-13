package com.fis.innovate48.thor.registration.repository.impl;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fis.innovate48.thor.model.Users;
import com.fis.innovate48.thor.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class UserRepositoryImpl implements UserRepository{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public Users findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * This method is use to validate user credentials by email and password.
	 * 
	 * @param {@link {@link Users}}
	 */
	@Override
	public Users validateUserCredentials(Users user) {
		// TODO Auto-generated method stub
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Users> cr = builder.createQuery(Users.class);
		
		Root<Users> root = cr.from(Users.class);
		Predicate emailCheck = builder.equal(root.get("email"), user.getEmail());
		Predicate passwordCheck = builder.equal(root.get("password"), user.getPassword());
		cr.select(root).where(emailCheck,passwordCheck);
		TypedQuery<Users> query = entityManager.createQuery(cr);
		Users response = null;
		try {
			if(query.getMaxResults() > 0)
				response= query.getSingleResult();
		}
		catch(Exception ex) {
			log.error(ex.getLocalizedMessage());	
			
		}		
		
		return response;
	}
	
	

}
