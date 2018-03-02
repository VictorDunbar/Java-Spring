package com.codingdojo.logreg.repositories;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.logreg.models.User;

public interface RegRepository extends CrudRepository<User, Long> {
	
	

}
