package com.codingdojo.logreg.services;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.codingdojo.logreg.models.User;
import com.codingdojo.logreg.repositories.LogRepository;
import com.codingdojo.logreg.repositories.RegRepository;

@Service
public class RegService {
	
	private RegRepository regRepo;
	private LogRepository logRepo;
	public RegService(RegRepository regRepo, LogRepository logRepo) {
		this.regRepo = regRepo;
		this.logRepo = logRepo;
	}

	public Object registerUser(String c_pass, User user, RedirectAttributes redirectAttributes) {
		
		boolean userExists = false;
		if(logRepo.findByEmail(user.getEmail()) instanceof User) {
			userExists = true;
			redirectAttributes.addFlashAttribute("reg", "email already registered");
		}
		
		if(c_pass.equals(user.getPassword()) && !userExists) {
			user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt()));
			return regRepo.save(user);
		}else {
			return "errors";
			
		}
	}

}
