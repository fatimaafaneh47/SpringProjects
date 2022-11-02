package com.codingdojo.form;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	int mycurrentgold = 0;
	ArrayList<String> activities= new ArrayList<>();
	@RequestMapping("/Gold")  
	  public String index(Model model ,HttpSession session){
		if (session.getAttribute("mycurrentgold")==null) {
			session.setAttribute("mycurrentgold", 0);
		}
		model.addAttribute("gold",mycurrentgold);
		session.setAttribute("activities",activities);
		return "index.jsp";
	}
	
	@RequestMapping(value="/money")
	public String process(@RequestParam(value="action")String action, HttpSession session) {
		if(action.equals("Farm")) {
			mycurrentgold += 10+(int)(Math.random()*10);
			ArrayList<String> myarray =(ArrayList<String>)session.getAttribute("activities");
			myarray.add("you entered a farm and earned "+ mycurrentgold);
			session.setAttribute("activities", activities);
		}
		if(action.equals("Cave")) {
			int earnedMoney =  10+(int)(Math.random()*10);
			mycurrentgold += earnedMoney;
			ArrayList<String> myarray =(ArrayList<String>)session.getAttribute("activities");
			myarray.add("you entered a farm and earned "+ mycurrentgold);
			session.setAttribute("activities", activities);
		}
		if(action.equals("House")) {
			mycurrentgold += 10+(int)(Math.random()*10);
			ArrayList<String> myarray =(ArrayList<String>)session.getAttribute("activities");
			myarray.add("you entered a farm and earned "+ mycurrentgold);
			session.setAttribute("activities", activities);
		}
		if(action.equals("Quest")) {
			mycurrentgold += 10+(int)(Math.random()*+40);
			mycurrentgold -= 10+(int)(Math.random()*+40);
			ArrayList<String> myarray =(ArrayList<String>)session.getAttribute("activities");
			myarray.add("you entered a farm and earned "+ mycurrentgold);
			session.setAttribute("activities", activities);
		}
		
		return "redirect:/Gold";
			
	}
	
	
	
	
	}
	


	
