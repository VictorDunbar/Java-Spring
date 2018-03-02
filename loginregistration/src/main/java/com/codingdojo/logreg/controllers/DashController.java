package com.codingdojo.logreg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller		
public class DashController {
	
		@RequestMapping("/success")
		public String main(Model model) {
			return "success.jsp";
		}
}
