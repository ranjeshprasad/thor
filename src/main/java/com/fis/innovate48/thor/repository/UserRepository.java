package com.fis.innovate48.thor.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fis.innovate48.thor.model.Users;

@Repository
public interface UserRepository extends  CrudRepository<Users, Integer>{

}
