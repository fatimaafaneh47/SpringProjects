package com.codingdojo.form;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
@RequestMapping("/")  
public String index() {
		       
	return "index.jsp";
		    }
@RequestMapping(value="/enterdata")
public String form(
		@RequestParam(value="number") Integer number,
		@RequestParam(value="city") String city,
		@RequestParam(value="name") String name,
		@RequestParam(value="job") String job,
		@RequestParam(value="living") String living,
		@RequestParam(value="description") String description,
		HttpSession session) {
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("name", name);
		session.setAttribute("job", job);
		session.setAttribute("living", living);
		session.setAttribute("description", description);
			
			return "redirect:/dashboard";
}

@RequestMapping(value="/dashboard")
public String dashboardpage() {
	return "show.jsp";
}
	

}






