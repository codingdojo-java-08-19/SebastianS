package com.ssaker.displaydate;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping("/date")
	public String date(Model model) {
		Date date= new Date();
		
		SimpleDateFormat currDay= new SimpleDateFormat("EEEEE");
		SimpleDateFormat currDate= new SimpleDateFormat("dd");
		SimpleDateFormat currMonth= new SimpleDateFormat("MMMMM");
		SimpleDateFormat currYear = new SimpleDateFormat("yyyy");
		
		String strDay= currDay.format(date);
		String strDate = currDate.format(date);
		String strMonth= currMonth.format(date);
		String strYear= currYear.format(date);
		
		model.addAttribute("dateToView",strDay+ ", the "+strDate+" of "+strMonth+", "+strYear);
		return "date.jsp";
	}
	@RequestMapping("/time")
	public String time(Model model) {
		Date time= new Date();
		String timePattern="hh:mma";
		SimpleDateFormat timeFormat= new SimpleDateFormat(timePattern);
		String strTime = timeFormat.format(time);
		model.addAttribute("timeToView",timeFormat.format(time));
		
		return "time.jsp";
	}
}
