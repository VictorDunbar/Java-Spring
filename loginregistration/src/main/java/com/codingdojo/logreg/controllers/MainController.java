package com.codingdojo.logreg.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.codingdojo.logreg.models.User;
import com.codingdojo.logreg.services.LogService;
import com.codingdojo.logreg.services.RegService;

@Controller
public class MainController {
	private RegService rService;
	private LogService lService;
	public MainController(RegService rService, LogService lService) {
		this.rService = rService;
		this.lService = lService;
	}

	@RequestMapping("/")
	public String index(Model model, @ModelAttribute("user") User user, @ModelAttribute("errors") String errors, Object email) {
		model.addAttribute("currentUser", findByEmail(email));
		return "home.jsp";
	}
	
	
	private Object findByEmail(Object email) {
		// TODO Auto-generated method stub
		return null;
	}

	@PostMapping("/register/user")
	public String saveUser(@Valid @ModelAttribute("user") User user, BindingResult result, @RequestParam(value="c_password") String c_pass, RedirectAttributes redirectAttributes) {
		if(result.hasErrors()) {
			redirectAttributes.addFlashAttribute("errors", "registration error!");
			return "home.jsp";
		}
		rService.registerUser(c_pass, user, redirectAttributes);
		return "redirect:/";
		
	}
	
	@PostMapping("/login_user")
	public String loginUser(@RequestParam(value="email") String email, @RequestParam(value="password") String password, HttpSession session, RedirectAttributes redirectAttributes) {
		Object val = lService.loginUser(email, password);
		if(val instanceof String) {
			redirectAttributes.addFlashAttribute("log", val);
			return "redirect:/";
		}
		return "redirect:/success";
	
	}
	
	@RequestMapping("/logout")
	public String logout() {
		return "redirect:/";
	}
}
