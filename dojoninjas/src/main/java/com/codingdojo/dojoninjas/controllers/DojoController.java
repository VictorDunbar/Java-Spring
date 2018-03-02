package com.codingdojo.dojoninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.dojoninjas.models.Dojo;
import com.codingdojo.dojoninjas.models.Ninja;
import com.codingdojo.dojoninjas.services.DojoService;

@Controller
public class DojoController {
	
	private final DojoService dojoService;
	
	public DojoController(DojoService dojoService) {
		this.dojoService = dojoService;
	}
	
	@RequestMapping("/")
	public String main(Model model) {
		return "redirect:/dojos/new";
	}
	
	@RequestMapping("/dojos/new")
	public String addDojo(Model model) {
		model.addAttribute("dojo", new Dojo());
		return "newdojo.jsp";
	}
	
	@PostMapping("/dojos/new")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "redirect:/dojos/new";
		}
		else {
			Long newdojo = dojoService.addDojo(dojo);
			return "redirect:/dojos/" + newdojo;
		}
	}
	
	@RequestMapping("/dojos/{id}")
	public String showDojo(@PathVariable("id") Long id, Model model) {
		model.addAttribute("dojo", dojoService.getDojo(id));
		List<Ninja> ninjas = dojoService.getDojo(id).getNinjas();
		model.addAttribute("ninjas", ninjas);
		return "dojo.jsp";
	}
}

