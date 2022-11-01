package com.codingdojo.daikichiroutes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController


public class Daikichiroutes2Application {

	public static void main(String[] args) {
		SpringApplication.run(Daikichiroutes2Application.class, args);
	}
	@RequestMapping("/daikichi")
	public String welcome() {
		return "welcome";
	}
	@RequestMapping("/daikichi/today")
	public String today() {
		return "Today you will find luck in all your endovers";
	}
	@RequestMapping("/daikichi/tomorrow")
	public String tomorrow() {
		return "Tomorrow,an opportunity will a rise,so be open to new ideas!";
	}
	

}
