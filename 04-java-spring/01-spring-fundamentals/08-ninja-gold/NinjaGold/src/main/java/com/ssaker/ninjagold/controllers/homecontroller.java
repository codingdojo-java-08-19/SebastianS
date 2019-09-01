package com.ssaker.ninjagold.controllers;

import java.util.ArrayList;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class homecontroller {
	@RequestMapping("/")
	public String index(HttpSession session) {
		if (session.getAttribute("gold")==null) {
			session.setAttribute("gold", 0);
			ArrayList<String> comments = new ArrayList<String>();
			comments.add("---------");
			session.setAttribute("comments", comments);
			
		}
		
		return "index.jsp";
	}
	@RequestMapping(value="/process", method=RequestMethod.POST)
	public String process(HttpSession session, @RequestParam("location") String location) {
		Integer gold;
		System.out.println(location);
		Random rand= new Random();
		Integer newGold=0;
		if (session.getAttribute("gold")==null) {
			gold = 0;
		}
		else {
			gold=(Integer)session.getAttribute("gold");
		}
		if (location.contentEquals("farm")) {
			newGold= rand.nextInt(11)+10;
		}
		else if (location.contentEquals("cave")) {
			newGold= rand.nextInt(6)+5;
		}
		else if (location.contentEquals("house")) {
			newGold= rand.nextInt(4)+2;
		}
		else if (location.contentEquals("casino")) {
			newGold= rand.nextInt(101)-50;
		}
		else {
			return "redirect:/";
		}
		gold+=newGold;
		session.setAttribute("gold", gold);
		
		String comment="From the "+ location+": "+newGold.toString();
		
		ArrayList<String> comments = (ArrayList<String>) session.getAttribute("comments");
		comments.add(comment);
		session.setAttribute("comments", comments);
		return "redirect:/";
		
	}
	
}
