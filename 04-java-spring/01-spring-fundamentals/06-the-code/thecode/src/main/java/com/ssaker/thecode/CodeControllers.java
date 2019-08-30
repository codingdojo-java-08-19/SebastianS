package com.ssaker.thecode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CodeControllers {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping("/errorflash")
	public String flashMessages(RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("error", "You must train harder!");
		return "redirect:/";
	}
	@RequestMapping("/code")
	public String success() {
		return "secret.jsp";
	}
	@RequestMapping(value="/validation", method=RequestMethod.POST)
	public String validate(@RequestParam("code") String codeTest) {
		String trueCode= "bushido";
		if (codeTest.equals(trueCode)) {
			return "redirect:/code";
		}
		else {
			return "redirect:/errorflash";
		}
	}
}
