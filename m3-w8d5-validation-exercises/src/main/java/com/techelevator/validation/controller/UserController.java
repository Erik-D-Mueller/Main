package com.techelevator.validation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techelevator.validation.model.Login;

@Controller
@RequestMapping("/login")
		
public class UserController {
	// GET: /
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String getMainScreen() {
		return "homePage";
	}

	// Add the following Controller Actions

	// GET: /register
	// Return the empty registration view

	// POST: /register
	// Validate the model and redirect to confirmation (if successful) or return
	// the
	// registration view (if validation fails)

	
	
@RequestMapping(path="/login", method=RequestMethod.GET)
public String emptyLoginView(Model modelHolder) {
	
if(! modelHolder.containsAttribute("login")) {
	modelHolder.addAttribute("login", new Login());
 }
	
	return "login";
}
	


	@RequestMapping(path="/confirmation", method=RequestMethod.POST)
	public String confirmation() {
		return "Confirmation";
	}
		
		
	

	
	

	// POST: /login
	// Validate the model and redirect to login (if successful) or return the
	// login view (if validation fails)

	// GET: /confirmation
	// Return the confirmation view
}
