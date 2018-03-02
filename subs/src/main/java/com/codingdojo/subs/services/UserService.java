package com.codingdojo.subs.services;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.codingdojo.subs.models.Role;
import com.codingdojo.subs.models.User;
import com.codingdojo.subs.repo.RoleRepo;
import com.codingdojo.subs.repo.UserRepo;

@Service
public class UserService {
    private UserRepo userRepo;
    private RoleRepo roleRepo;
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    
    public UserService(UserRepo userRepo, RoleRepo roleRepo, BCryptPasswordEncoder bCryptPasswordEncoder)     {
        this.userRepo = userRepo;
        this.roleRepo = roleRepo;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }
    
    
    public void saveWithUserRole(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(Arrays.asList(roleRepo.findByName("ROLE_USER")));
        userRepo.save(user);
    }
     
    public void saveUserWithAdminRole(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(Arrays.asList(roleRepo.findByName("ROLE_ADMIN")));
        userRepo.save(user);
    }    
    
    public User findByEmail(String email) {
        return userRepo.findByEmail(email);
    }
    
    public void updateUser(User user){ 
    		user.setUpdatedAt(new Date());
    		userRepo.save(user);
    }
    
    public void createUser(User user) {
    		userRepo.save(user);
    }
    
    public User getUserById(Long id) {
    		return userRepo.findOne(id);
    }
    
    public void deletebyId(Long id) {
    		userRepo.delete(id);
    }
    
    public boolean checkIfAdmin(User user) {
    		List<Role> roles = user.getRoles();
    		for( int i = 0; i < roles.size(); i++) {
    			if(roles.get(i).getName().equals("ROLE_ADMIN")) {
    				return true;
    			}
    		}
    		return false; 			
    }
    
    public List<User> getAll(){
    		return (List<User>) userRepo.findAll();
    }
    
    public void deleteUser(Long id) {
    		userRepo.delete(id);
    }

}
