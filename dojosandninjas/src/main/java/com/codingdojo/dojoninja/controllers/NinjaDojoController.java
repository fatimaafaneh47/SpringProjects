package com.codingdojo.dojoninja.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.dojoninja.models.Dojo;
import com.codingdojo.dojoninja.models.Ninja;
import com.codingdojo.dojoninja.services.DojoService;
import com.codingdojo.dojoninja.services.NinjaService;

@Controller
public class NinjaDojoController {
	
	@Autowired
	DojoService dojoService;
	
	@Autowired
	NinjaService ninjaService;
	
	@GetMapping("/dojos/new")
	public String index(@ModelAttribute("dojo") Dojo dojo ) {
	
			return "index.jsp";
		}
	@PostMapping("/dojos/new")
	public String index(@ModelAttribute("dojo") Dojo dojo,Model model) {
			dojoService.createDojo(dojo);
			return "redirect:/dojos/new";
		}
	@GetMapping("/ninjas/new")
	public String ninja(Model model,@ModelAttribute("ninja") Ninja ninja) 
	{
		model.addAttribute("dojos", dojoService.allDojos());
			return "ninja.jsp";
		}
	@PostMapping("/ninjas/new")
	public String creatninja(@ModelAttribute("ninja") Ninja ninja) {
			ninjaService.createNinja(ninja);
			return "redirect:/ninjas/new";
		}
	
	@GetMapping("/dojos/{id}")
	public String show(@PathVariable(value="id") Long id ,Model model ) {
		Dojo dojo = dojoService.findDojo(id);
		model.addAttribute("dojo", dojo);
		return "show.jsp";
		}
	
}
		
		


