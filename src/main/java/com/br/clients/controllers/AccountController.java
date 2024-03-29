package com.br.clients.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.br.clients.services.AccountService;

@Controller
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	@GetMapping("/")
	public ModelAndView viewAccounts() {
	 ModelAndView modelAndView = new ModelAndView("mainScreen.html");
	 modelAndView.addObject("account", accountService.showAllAccounts());
	 return modelAndView;
	 
	}
	
	
	
	
	
	
	
	

}
