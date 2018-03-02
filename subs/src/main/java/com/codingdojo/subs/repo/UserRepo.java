package com.codingdojo.subs.repo;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.subs.models.User;

public interface UserRepo extends CrudRepository<User, Long>{
	
	User findByEmail(String email);

}
