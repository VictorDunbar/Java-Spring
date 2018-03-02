package com.codingdojo.learningplatform.homecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@RequestMapping("")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/m/{chapter}/0483/{assignmentNumber}")
	public String assignment(Model model, @PathVariable("chapter") String discard, @PathVariable("assignmentNumber") String assignment){
		if(assignment.equals("0345")) {
			model.addAttribute("assignment", "Coding Forms");
		}
		else if(assignment.equals("2342")) {
			model.addAttribute("assignment", "Fortran to Binary");
		}
		else {
			model.addAttribute("assignment", "UH OH! Where is this assignment?");
		}
		return "assignment.jsp";
	}
	
	@RequestMapping("/m/{chapter}/0553/{lessonNumber}")
	public String lesson(Model model, @PathVariable("chapter") String discard, @PathVariable("lessonNumber") String lesson){
		if(lesson.equals("0733")) {
			model.addAttribute("lesson", "Setting up your Servers");
		}
		else if(lesson.equals("0342")) {
			model.addAttribute("lesson", "Punch Cards");
		}
		else if(lesson.equals("0348")) {
			model.addAttribute("lesson", "Advanced Fortran Intro");
		}
		else {
			model.addAttribute("lesson", "UH OH! Where is this lesson?");
		}
		return "lesson.jsp";
	}
}
