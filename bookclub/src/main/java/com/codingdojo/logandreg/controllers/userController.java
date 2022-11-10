package com.codingdojo.logandreg.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.codingdojo.logandreg.models.Book;
import com.codingdojo.logandreg.models.LoginUser;
import com.codingdojo.logandreg.models.User;
import com.codingdojo.logandreg.services.BookService;
import com.codingdojo.logandreg.services.UserService;

@Controller
public class userController {
	
	@Autowired
    private UserService userServ;
	
	@Autowired
    private BookService bookServ;
   
   @GetMapping("/")
   public String index(Model model, HttpSession session) {
   	
   	if (session.getAttribute("userId")!= null){
   		return "redirect:/books";
   	}
   	
       model.addAttribute("newUser", new User());
       model.addAttribute("newLogin", new LoginUser());
       return "login.jsp";
   }
   
   @PostMapping("/register")
   public String register(@Valid @ModelAttribute("newUser") User newUser, 
           BindingResult result, Model model, HttpSession session) {
       
   	User registeredUser = userServ.register(newUser, result);
       
       if(result.hasErrors()) {
           
           model.addAttribute("newLogin", new LoginUser());
           return "login.jsp";
       }
       session.setAttribute("userId", registeredUser.getId());
       return "redirect:/books";
     
   }
   
   @PostMapping("/login")
   public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
           BindingResult result, Model model, HttpSession session) {
       
   	
        User user = userServ.login(newLogin, result);
   
       if(result.hasErrors()) {
           model.addAttribute("newUser", new User());
           return "login.jsp";
       }
       
       session.setAttribute("userId", user.getId());
       return "redirect:/books";
   }
   
   @GetMapping ("/books")
   public String home(Model model, HttpSession session){
   	if (session.getAttribute("userId")!= null){
   		Long userId = (Long) session.getAttribute("userId");
   		User currentUser = userServ.findUserById(userId);
   		model.addAttribute("currentUser", currentUser);	
   		List<Book> books = bookServ.allBooks();
        model.addAttribute("books", books);
   		return "success.jsp";
   	}
   	return "redirect:/";
   	  		
   }
   
   @GetMapping ("/logout")
   public String logout(HttpSession session){
   	session.invalidate();
   	return "redirect:/";		
   }
   @GetMapping ("/books/new")
   public String logout(@ModelAttribute("books")Book book ,Model model, HttpSession session){
  		Long userId = (Long) session.getAttribute("userId");
  		User user = userServ.findUserById(userId);
  		model.addAttribute("user", user);
   		return "form.jsp";		
   }
   @PostMapping("/books/new")
	public String create(@Valid @ModelAttribute("books") Book book, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "form.jsp";
		}else {
			bookServ.createBook(book);
			return "redirect:/books";
		}
	}
   @GetMapping("/books/{id}")
	public String show(@PathVariable(value="id") Long id ,Model model, HttpSession session ) {
		Book book = bookServ.findBook(id);
		Long userId = (Long) session.getAttribute("userId");
   		User currentUser = userServ.findUserById(userId);
   		model.addAttribute("currentUser", currentUser);	
		model.addAttribute("Book", book);
		return "show.jsp";
		}
   
   
    
}
