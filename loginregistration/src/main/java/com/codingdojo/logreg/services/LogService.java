package com.codingdojo.logreg.services;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.codingdojo.logreg.models.User;
import com.codingdojo.logreg.repositories.LogRepository;



@Service
public class LogService {
	private LogRepository lRepo;
	public LogService(LogRepository lRepo) {
		this.lRepo = lRepo;
	}
	
	public Object loginUser(String email, String password) {
		User user = lRepo.findByEmail(email);
		if(user == null) {
			return "User not found";
		}else {
			if(BCrypt.checkpw(password, user.getPassword())) {
			System.out.println("It matches");
			return user;
			}
			else {
				System.out.println("It doesnt match");
				return "user password does not work";
			}
		}
	}
}

