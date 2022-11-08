package com.codingdojo.language.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.language.models.Language;
import com.codingdojo.language.services.LanguageService;

@Controller
public class LanguageController {
	private final LanguageService languageService;
		public LanguageController(LanguageService languageService){
		   this.languageService=languageService;
		   
		    }
		@GetMapping("/languages")
		public String languages(@ModelAttribute("language") Language language ,Model model) {
			List<Language> languages = languageService.allLanguages();
			model.addAttribute("languages", languages);
			return "index.jsp";
			}
		@PostMapping("/languages")
		public String createLanguage(@Valid @ModelAttribute("language") Language language, BindingResult result, Model model) {
			if(result.hasErrors()) {
				List<Language> languages = languageService.allLanguages();
				model.addAttribute("languages", languages);
				return "index.jsp";
			}else {
				languageService.createLanguage(language);
				return "redirect:/languages";
			}
		}
		@GetMapping("/languages/edit/{id}")
		public String edit(@PathVariable("id") Long id, Model model) {	
			Language language = languageService.findLanguage(id);	
			model.addAttribute("language", language);
			return "edit.jsp";
		}
		    
		 	@PutMapping("/languages/edit/{id}")
			public String update(@Valid @ModelAttribute("language") Language language, BindingResult result) {
				if(result.hasErrors()) {
					return "edit.jsp";
				}else {
					languageService.updateLanguage(language);
					return "redirect:/languages";
				}
			}
		 	@RequestMapping("/languages/{id}/delete")
			public String delete(@PathVariable("id") Long id) {
				languageService.deleteLanguage(languageService.findLanguage(id));
				return "redirect:/languages";
			}
		 	@GetMapping("/languages/{Id}")
			public String show(Model model, @PathVariable(value="Id")Long Id) {
				Language language =languageService.findLanguage(Id);
				model.addAttribute("language", language);
				return "show.jsp";
				
			}
	
		    }


