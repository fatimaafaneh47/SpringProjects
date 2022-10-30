package com.codingdojo.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeController {
	@RequestMapping("/")
	 public String index(@RequestParam(value="name",required=false) String searchQuery ,@RequestParam(value
			 ="last_name",required=false)String searchQueryLast , @RequestParam(value="times",required=false)Integer times ) {
		if (searchQuery==null) { 
			return "Hello Human";
		}
        return ("Hello " + searchQuery + " "+ searchQueryLast).repeat(times);
    }
	
}
