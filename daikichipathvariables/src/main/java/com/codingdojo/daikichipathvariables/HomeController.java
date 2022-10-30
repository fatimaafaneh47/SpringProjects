package com.codingdojo.daikichipathvariables;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/daikichi/travel/{country}")
		public String showLesson(@PathVariable("country") String country){
    	return ("congratulations! you will soon travel to"+" "+ country);
    }
	@RequestMapping("/daikichi/lotto/{number}")
	public String Controller(@PathVariable("number") Integer number) {
		if (number%2 ==0) {
			return "You will take a grand journey in the near future,but be weary of tempting offers";
		}
		else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends";
			
		}
	}

}
