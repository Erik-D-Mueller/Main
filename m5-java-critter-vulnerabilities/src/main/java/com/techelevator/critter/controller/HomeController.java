package com.techelevator.critter.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techelevator.critter.model.MessageDAO;




//What did we do on friday?  Go over that

// Are controller just regular java classes that happen to say @Controller inside of them?
@Controller
public class HomeController {
	
	private MessageDAO messageDAO;

	
	// What is going on below?  Where is it coming from and going? Is this one of the pieces that we "copy and paste" but don't really edit?  Part of the Spring Framework?
	@Autowired
	public HomeController(MessageDAO messageDAO) {
		this.messageDAO = messageDAO;
	}
	
	
	
	// Where is the below map model coming from?  Is it being "caught from somewhere else" or is it constructing it from new?  If it's constructing it from new, why do they make it appear as if it is being "caught" from somewhere else?
	// How does this funtion definition relate to returning the page?  It autmatically has "model" withit when returned because we wrote it in as a parameter?
	// Somehow, anything written in the parameters magically "goes with it" it appears?
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String showHomePage(Map<String, Object> model) {
		//From the above, a list is an object?
		
		
		model.put("messages", messageDAO.getPublicMessages(10));
		return "home";
	}

	
	@RequestMapping(path="/delete/{id}", method=RequestMethod.GET)
	public String showHomePageAgain(Map<String, Object> model, @PathVariable long id) {
		
		messageDAO.deleteMessage(id);
		model.put("messages", messageDAO.getPublicMessages(10));
		return "home";
	}


}
