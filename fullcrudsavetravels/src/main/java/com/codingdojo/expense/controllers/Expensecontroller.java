package com.codingdojo.expense.controllers;

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
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.expense.models.Expense;
import com.codingdojo.expense.services.ExpenseService;

@Controller
public class Expensecontroller {
	private final ExpenseService expenseService;
	public Expensecontroller(ExpenseService expenseService){
		   this.expenseService=expenseService;
		    }
			 
	@GetMapping("/expenses")
	public String newexpense(@ModelAttribute("expense") Expense expense ,Model model) {
		List<Expense> expenses = expenseService.allExpenses();
		model.addAttribute("expenses", expenses);
		return "index.jsp";
		}
	
	@PostMapping("/expenses")
	public String index(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Expense> expenses = expenseService.allExpenses();
			model.addAttribute("expenses", expenses);
			return "index.jsp";
		}else {
			expenseService.createExpense(expense);
			return "redirect:/expenses";
		}
	}
	@GetMapping("/edit/{id}")
	public String show(@PathVariable("id") Long id, Model model) {	
		Expense expense = expenseService.findExpense(id);	
		model.addAttribute("expense", expense);
		return "edit.jsp";
	}
	    
	 	@PutMapping("/edit/{id}")
		public String update(@Valid @ModelAttribute("expense") Expense expense, BindingResult result) {
			if(result.hasErrors()) {
				return "edit.jsp";
			}else {
				expenseService.updateExpense(expense);
				return "redirect:/expenses";
			}
		}
	 	 @DeleteMapping("/expenses/{id}")
	     public String delete(@PathVariable("id") Long id) {
	         expenseService.deleteExpense(id);
	         return "redirect:/expenses";
	     }
	 	@GetMapping("/expenses/{Id}")
		public String index(Model model, @PathVariable(value="Id")Long Id) {
			Expense expense =expenseService.findExpense(Id);
			model.addAttribute("expense", expense);
			return "show.jsp";
			
		}
		
		}
	