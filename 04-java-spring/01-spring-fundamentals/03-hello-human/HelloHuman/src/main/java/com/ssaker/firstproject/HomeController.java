package com.ssaker.firstproject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/")
	public String defHello() {
		return "Hello Human! Welcome to SpringBoot!";
	}
	@RequestMapping("/{name}")
	public String hello(@PathVariable("name") String name) {
			String toReturn= name+"!";
			return "Hello "+toReturn+ " Welcome to SpringBoot!";
	}
}
