package com.codingdojo.book.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.book.models.Book;
import com.codingdojo.book.services.BookService;



@Controller
public class BookController {
private final BookService bookService;
    
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    
	@RequestMapping("/books")
	public String index(Model model) {
        List<Book> books = bookService.allBooks();
        model.addAttribute("books", books);
        return "index.jsp";
	}
	@GetMapping("/books/{Id}")
	public String index(Model model, @PathVariable(value="Id")Long Id) {
		Book book =bookService.findBook(Id);
		model.addAttribute("book", book);
		return "show.jsp";
		
	}
	
	
}
