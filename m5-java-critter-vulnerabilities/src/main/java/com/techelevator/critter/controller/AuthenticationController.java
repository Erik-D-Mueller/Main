package com.techelevator.critter.controller;

// In the "real world" as usernames and passwords sent POST, with no encryption?   Or are
// they sent POST with some type of encryption?  Would the database of usernames and passwords also be encrypted?

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.techelevator.critter.model.UserDAO;

@Controller
@SessionAttributes("currentUser")
public class AuthenticationController {

	private UserDAO userDAO;

	@Autowired
	public AuthenticationController(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	
	// This catches the initial request for a blank login page which is just an html link and returns the blank page
	@RequestMapping(path="/login", method=RequestMethod.GET)
	public String displayLoginForm() {
		return "login";
	}
	
	// THis get and post, is that how it is sent to the client, or server, or both?  The 
	//browser is already connected a little bit, before the URL is sent, and thus knows to do POST?
	// THis catches the request FROM the login page after we hit "submit" and send in our id/login
	//Modelmap and httpsessin are just generated on the spot?
	//I'm still a little confused on how the return redirect works, technically
	
	//After logging in, the website takes me to private messages, where does it call to do that?
	
	
	//If currentUser is put into model here, and other functions "declare" model, can they see currentUser?
	@RequestMapping(path="/login", method=RequestMethod.POST)
	public String login(@RequestParam String userName, 
						@RequestParam String password, 
						@RequestParam(required=false) String destination,
						ModelMap model,
						HttpSession session) {
		
		if(userDAO.searchForUsernameAndPassword(userName, password)) {
			session.invalidate();
			model.put("currentUser", userName);
			if(isValidRedirect(destination)) {
				return "redirect:"+ destination;
			}else {
				return "redirect:/users/" + userName;
			}
		} else {
			return "redirect:/login";
		}
	}

	private boolean isValidRedirect(String destination) {
		return destination !=null && destination.startsWith("Http://localhost");
	}
	
	@RequestMapping(path="/logout", method=RequestMethod.POST)
	public String logout(ModelMap model, HttpSession session) {
		model.remove("currentUser");
		session.removeAttribute("currentUser");
		return "redirect:/";
	}
}
