package com.controller;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.model.Candidate;

import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SessionAttributes("candidateInfo")
public class MainController {

   
	
	@RequestMapping(path= {"/", "/index"}, method=RequestMethod.GET)
    String showIndexPage(Model model) {

        return "IndexPage";
    }
	
		
	@RequestMapping(path= "/CV", method=RequestMethod.POST)
    String showCVPage(@RequestParam String firstName,
						@RequestParam String lastName,
						@RequestParam String country, 
						@RequestParam String userDate,
						ModelMap model) {
		
		Candidate candidate = new Candidate();
		
		candidate.setFirstName(firstName);
		candidate.setLastName(lastName);
		candidate.setCountry(country);
	    candidate.setDate(userDate);
		
		
		model.addAttribute("candidateInfo", candidate);
		
		
        return "CVPage";
    }
	
	
}
