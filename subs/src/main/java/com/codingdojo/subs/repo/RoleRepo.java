package com.codingdojo.subs.repo;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.subs.models.Role;

public interface RoleRepo extends CrudRepository<Role, Long> {
	
	Role findByName(String string);

}
