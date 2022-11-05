package com.codingdojo.book.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.codingdojo.book.models.Book;
import com.codingdojo.book.services.BookService;

@Controller
public class bookcontroller {
	@Autowired
	BookService bookservice;
	
	@GetMapping("/books/{bookId}")
	public String index(Model model, @PathVariable(value="bookId")Long bookId) {
		
		Book book =bookservice.findBook(bookId);
		model.addAttribute("book", book);
		return "index.jsp";
		
	}

}
