package com.ssaker.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		Integer count = (Integer) session.getAttribute("count");
		if (count==null) {
			count=0;
		}
		count++;
		
		session.setAttribute("count", count);
		
		return "index.jsp";
	}
	@RequestMapping("/counter")
	public String counter(HttpSession session, Model model) {
		Integer count = (Integer) session.getAttribute("count");
		if (count==null) {
			count=0;
		}
		
		model.addAttribute("count",count);
		return "counter.jsp";
	}
	
}
