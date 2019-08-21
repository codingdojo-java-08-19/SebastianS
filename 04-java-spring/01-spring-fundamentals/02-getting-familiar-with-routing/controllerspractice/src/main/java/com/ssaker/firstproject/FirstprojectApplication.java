package com.ssaker.firstproject;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;


@SpringBootApplication
@RestController
@RequestMapping("/coding")
public class FirstprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstprojectApplication.class, args);
	}
	@RequestMapping("")
	public String coding() {
		return "Coding Dojo is great!";
	}
	@RequestMapping("/python")
	public String hello() {
		return "Python is just as awesome!";
	}
	@RequestMapping("/java")
	public String java() {
		return "Java/Spring is better";
	}
	@RequestMapping("/{dojo}")
	public String pathvar1(@PathVariable("dojo") String dojo) {
		return "The "+dojo+" is awesome!";
	}
	@RequestMapping("/{burbank-dojo}")
	public String pathvar2(@PathVariable("burbank-dojo") String str) {
		return str+  " is located in Southern California.";
	}
	
	@RequestMapping("/{san-jose}")
	public String pathvar3(@PathVariable("san-jose") String str) {
		return str+ " dojo is the headquarters.";
	}
	
	
	

}
