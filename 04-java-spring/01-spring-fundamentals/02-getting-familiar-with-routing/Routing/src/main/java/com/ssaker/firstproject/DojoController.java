package com.ssaker.firstproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping(value="/dojo", method=RequestMethod.GET)
	public String pathvar1() {
		return "The dojo is awesome!";
	}
	@RequestMapping(value="/burbank-dojo", method=RequestMethod.GET)
	public String pathvar2() {
		return "Burbank Dojo is located in Southern California.";
	}
	
	@RequestMapping(value="/san-jose", method=RequestMethod.GET)
	public String pathvar3() {
		return "San Jose dojo is the headquarters.";
	}
}
