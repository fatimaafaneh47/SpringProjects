package com.codingdojo.book.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codingdojo.book.models.Book;
import com.codingdojo.book.services.BookService;

@RestController
public class BooksApi {
    private final BookService bookService;
    public BooksApi(BookService bookService){
        this.bookService = bookService;
    }
    @RequestMapping("/api/books")
    public List<Book> index() {
        return bookService.allBooks();
    }
    
    @RequestMapping(value="/api/books", method=RequestMethod.POST)
    public Book create(@RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String language, @RequestParam(value="pages") Integer numberOfPages) {
        Book book = new Book(title, desc, language, numberOfPages);
        return bookService.createBook(book);
    }
    
    @RequestMapping("/api/books/{id}")
    public Book show(@PathVariable("id") Long id) {
        Book book = bookService.findBook(id);
        return book;
    }


    @RequestMapping(value="api/books/{id}",method=RequestMethod.PUT)
    public Book update(@PathVariable("id") Long id,@RequestParam(value="title")String title,@RequestParam(value="description")String desc ,@RequestParam(value="language")String language,@RequestParam(value="pages")Integer numOfPages ) {
    	Book book =new Book(title,desc,language,numOfPages);
    	book.setId(id);
    	Book updatedBook = bookService.updateBook(book);
    	return updatedBook;
    }
    @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
    // we only need the Book ID to delete the book in our bookService
    public void destroy(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
    }
}