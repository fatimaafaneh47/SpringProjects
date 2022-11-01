package com.codingdojo.counter;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
	@Controller
	public class MyController {
		@RequestMapping("/your_server")
	    public String index(HttpSession session, Model model){
			if (session.getAttribute("count") == null) {
				session.setAttribute("count", 0);
			}
			else {
				Integer currentCount = (Integer) session.getAttribute("count");
				currentCount ++;
				session.setAttribute("count", currentCount);
			}	 
			model.addAttribute("count", session.getAttribute("count"));
			return "index.jsp";
		}
		@RequestMapping("/your_server/counter")
		public String showCount() {
			
			return "showuser.jsp";
		}

}
