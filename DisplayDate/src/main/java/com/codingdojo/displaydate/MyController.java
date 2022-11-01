package com.codingdojo.displaydate;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	 @GetMapping("/date")
	  public String date(Model model) {
		 Date date =new Date();
		 SimpleDateFormat newdate= new SimpleDateFormat("EEEE,'the 'dd' of' MMMM ,YYYY");
		 String formatdate=newdate.format(date);
		 model.addAttribute("formatdate",formatdate);
		 
           return "date.jsp";
	  }

	@RequestMapping("/time")
	public String time(Model model) {
		 Time time =new Time(0);
		 SimpleDateFormat newtime= new SimpleDateFormat("h:mm a");
		 String formattime=newtime.format(time);
		 model.addAttribute("formattime",formattime);
		return "time.jsp";
	}
	

}
