package com.codingdojo.counterapp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	Integer counter = 0;
	
	@RequestMapping("/")
	public String index(HttpSession session) {
		counter ++;
		session.setAttribute("counter", counter);
		return "index";
	}
	
	@RequestMapping("/counter")
	public String counter(HttpSession session) {
		String count = Integer.toString((int) session.getAttribute("counter"));
		return "counter";
	}
	
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		counter = 0;
		session.setAttribute("counter", counter);
		return "redirect:/";
	}
	
	@RequestMapping("/increment")
	public String increment(HttpSession session) {
		counter ++;
		session.setAttribute("counter", counter);
		return "redirect:/counter";
	}
}