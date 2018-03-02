package com.codingdojo.dojoninjas.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.codingdojo.dojoninjas.models.Ninja;
import com.codingdojo.dojoninjas.services.DojoService;
import com.codingdojo.dojoninjas.services.NinjaService;

@Controller
@RequestMapping("/ninjas")
public class NinjaController {
	
		private final NinjaService ninjaService;
		private final DojoService dojoService;
		
		
		public NinjaController(NinjaService ninjaService, DojoService dojoService) {
			this.ninjaService = ninjaService;
			this.dojoService = dojoService;
		}
		
		@RequestMapping("/new")
		public String addNinja(Model model) {
			model.addAttribute("ninja", new Ninja());
			model.addAttribute("dojos", dojoService.showDojos());
			return "newninja.jsp";
		}
		
		@PostMapping("/new")
		public String createdAt(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
			if(result.hasErrors()) {
				System.out.println(result.getAllErrors());
				return "redirect:/new";
				
			}
			else {
				Long newNinja = ninjaService.addNinja(ninja);
				Long ninjasDojo = ninjaService.getNinja(newNinja).getDojo().getId();
				return "redirect:/dojos/" + ninjasDojo;
			}
		
		}
}