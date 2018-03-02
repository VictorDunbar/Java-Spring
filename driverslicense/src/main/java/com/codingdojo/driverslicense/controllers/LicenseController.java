package com.codingdojo.driverslicense.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.codingdojo.driverslicense.models.License;
import com.codingdojo.driverslicense.models.Person;
import com.codingdojo.driverslicense.services.LicenseService;
import com.codingdojo.driverslicense.services.PersonService;

@Controller
@RequestMapping("/")
public class LicenseController {
	
	private final PersonService personService;
	private final LicenseService licenseService;
	
	public LicenseController(PersonService personService, LicenseService licenseService) {
		this.personService = personService;
		this.licenseService = licenseService;
	}
	
	@RequestMapping("")
	public String index(Model model) {
		List<Person> persons = personService.getAllPersons();
		model.addAttribute("persons", persons);
		return "index.jsp";
	}

	@RequestMapping("/persons/new")
	public String showAddPerson(@ModelAttribute("person") Person person) {
		return "add.jsp";
	}
	
	@PostMapping("/persons/new")
	public String AddPerson(@Valid @ModelAttribute("person") Person person, BindingResult result, RedirectAttributes errors) {
		if(result.hasErrors()) {
			errors.addFlashAttribute("errors", result.getAllErrors());
			return "redirect:/persons/new";
		}else {
			personService.addPerson(person);
			return "redirect:/";
		}
	
	}
	
	@RequestMapping("/licenses/new")
	public String showAddLicense(Model model, @ModelAttribute("license") License license) {
		List<Person> persons = personService.getAllPersons();
		model.addAttribute("persons", persons);
		return "addlicense.jsp";
	}
	
	@PostMapping("/licenses/new")
	public String addLicense(@Valid @ModelAttribute("license") License license, BindingResult result, RedirectAttributes errors, Model model) {
		if(result.hasErrors()) {
			errors.addFlashAttribute("errors", result.getAllErrors());
			return "addlicense.jsp";
//			return "redirect:/licenses/new";
		}else {
			licenseService.addLicense(license);
			return "redirect:/";
		}
	}
	
	@RequestMapping("/persons/{id}")
	public String showOnePerson(Model model, @PathVariable("id") Long id) {
		Person person = personService.getPersonById(id);
		if(id == null) {
			return "redirect:/";
		}
		model.addAttribute("person", person);
		return "showlicense.jsp";
	}
	
	@RequestMapping("persons/{personId}/delete")
	public String deletePerson(@PathVariable("personId") Long personId) {
		licenseService.deleteLicense(licenseService.getLicenseById(personId).getId());
//		personService.deletePerson(personId);
		return "redirect:/";
	}

	
}