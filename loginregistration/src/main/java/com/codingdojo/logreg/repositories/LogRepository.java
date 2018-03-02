package com.codingdojo.logreg.repositories;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.logreg.models.User;

public interface LogRepository extends CrudRepository<User, Long> {

	User findByEmail(String email);
}
