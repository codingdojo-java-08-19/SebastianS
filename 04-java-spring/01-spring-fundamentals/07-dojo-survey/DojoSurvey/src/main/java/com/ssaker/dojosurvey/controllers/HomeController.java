package com.ssaker.dojosurvey.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		System.out.println("IN INDEX");
		return "index.jsp";
	}
	@RequestMapping(value="/process", method=RequestMethod.POST)
	public String process(HttpSession session, @RequestParam("name") String name,@RequestParam("location") String location, @RequestParam("fav") String fav, @RequestParam("comment") String comment) {
		session.setAttribute("name", name);
		session.setAttribute("location", location);
		session.setAttribute("fav", fav);
		session.setAttribute("comment", comment);
		return "redirect:/result";
	}
	
	@RequestMapping("/result")
	public String result(Model model, HttpSession session) {
		model.addAttribute("name", session.getAttribute("name"));
		model.addAttribute("location", session.getAttribute("location"));
		model.addAttribute("fav", session.getAttribute("fav"));
		model.addAttribute("comment", session.getAttribute("comment"));
		return "submit.jsp";
	}
}
