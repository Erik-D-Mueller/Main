package com.techelevator.validation.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.validation.model.Login;
import com.techelevator.validation.model.Registration;

@Controller
public class UserController {

	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String emptyLoginView(Model model) {

		if (!model.containsAttribute("login")) {
			model.addAttribute("login", new Login());
		}

		return "login";
	}

	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public String handleLoginForm(@Valid @ModelAttribute("login") Login login, BindingResult result) {

		if (result.hasErrors()) {
			return "login";
		}

		return "redirect:/confirmation";
	}

	@RequestMapping(path = "/confirmation", method = RequestMethod.GET)
	public String confirmation() {
		return "confirmation";
	}

	@RequestMapping(path = "/registration", method = RequestMethod.GET)
	public String emptyRegistrationView(Model model) {

		if (!model.containsAttribute("registration")) {
			model.addAttribute("registration", new Registration());
		}

		return "registration";
	}

	@RequestMapping(path = "/registration", method = RequestMethod.POST)
	public String handleRegistrationForm(@Valid @ModelAttribute("registration") Registration registration,
			BindingResult result) {

		if (result.hasErrors()) {
			return "registration";
		}
		return "redirect:/registrationConfirmation";
	}

	@RequestMapping(path = "/registrationConfirmation", method = RequestMethod.GET)
	public String registrationConfirmation() {
		return "registrationConfirmation";
	}

}