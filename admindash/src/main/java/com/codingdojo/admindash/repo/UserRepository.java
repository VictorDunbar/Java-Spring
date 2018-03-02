package com.codingdojo.admindash.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.admindash.models.User;
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	
	User findByEmail(String email);

}
