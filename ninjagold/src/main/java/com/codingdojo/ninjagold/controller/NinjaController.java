package com.codingdojo.ninjagold.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller 
public class NinjaController {
		ArrayList<ArrayList> updates = new ArrayList<ArrayList>();
		int gold = 0;
		Date dateTime = new java.util.Date();
		String time = String.format("(%s %te %<tB %<tY %<tI:%<tM %<tp)", "", dateTime);
		
		@RequestMapping("/")
		public String index(HttpSession session) {
			session.setAttribute("gold", gold);
			return "index.jsp";
		}
		
		@RequestMapping(path="/process_da_money", method=RequestMethod.POST)
		public String money(@RequestParam(value="place") String place, HttpSession session) {
			
			
			switch(place) {
			case "farm":
				int amt = ThreadLocalRandom.current().nextInt(10,21);
				gold += amt;
				String color = "Ninja earned " + amt + " gold from the Farm!";
				String msg = "Ninja earned " + amt + " from the Farm!";
				ArrayList<String> data = new ArrayList<String>();
				data.add(color);
				data.add(msg);
				data.add(time);
				updates.add(data);
				break;
				
			case "cave":
				
				amt = ThreadLocalRandom.current().nextInt(5,11);
				gold += amt;
				color = "Ninja earned " + amt + " gold from the Cave!";;
				msg = "Ninja earned " + amt + " from the Cave!";
				data = new ArrayList<String>();
				data.add(msg);
				data.add(color);
				data.add(time);
				updates.add(data);
				break;
				
			case "house":
				
				amt = ThreadLocalRandom.current().nextInt(2,5);
				gold += amt;
				color = "Ninja earned " + amt + " gold from the House!";;
				msg = " Ninja earned " + amt + " from the House!";
				data = new ArrayList<String>();
				data.add(msg);
				data.add(color);
				data.add(time);
				updates.add(data);
				break;
				
			case "casino":
				
				amt = ThreadLocalRandom.current().nextInt(-51,51);
				gold += amt;
				if(amt < 0) {
					color = "Ninja lost " + amt + " gold from the Casino!";
					msg = "Ninja lost " + amt + " gold at the Casino!";
				}
				else if(amt == 0) {
					color = "Ninja made nothing this time...";
					msg = "Ninja made nothing this time...";
				}
				
				else {
					color = "Ninja  won " + amt + " gold at the Casino!";
					msg = "Ninja  won " + amt + " gold at the Casino!";
				}
				
				data = new ArrayList<String>();
				data.add(msg);
				data.add(color);
				data.add(time);
				updates.add(data);
				break;
				
			
			}
			session.setAttribute("updates", updates);
			session.setAttribute("size", updates.size() - 1);
			return "redirect:/";
		}
}
