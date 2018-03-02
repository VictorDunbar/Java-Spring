package com.codingdojo.subs.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.subs.models.Role;
import com.codingdojo.subs.repo.RoleRepo;

@Service
public class RoleService {
	private RoleRepo roleRepo;
	
	public RoleService(RoleRepo roleRepo){
		this.roleRepo = roleRepo;
	}
	
	public List<Role> all(){
		return (List<Role>) roleRepo.findAll();
	}
	
	public Role findByName(String name){
		return (Role) roleRepo.findByName(name);
	}
	
	public void create(Role role){
		roleRepo.save(role);
	}
	public void update(Role role){
		roleRepo.save(role);
	}
	public void destroy(long id){
		roleRepo.delete(id);
	}
}
