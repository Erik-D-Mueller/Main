package com.techelevator;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.techelevator.dao.ActorDao;
import com.techelevator.model.Review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller 
public class ActorSearchController {

	@Autowired
	private ActorDao ActorDao;
	
	@RequestMapping( path = {"/"}, method=RequestMethod.GET)
	public String showSearchActorForm(HttpServletRequest request) {
		
		return "actorList";
	}

	@RequestMapping( path = {"/actorList"}, method=RequestMethod.POST)
	public String searchActors(String searchString, HttpServletRequest request) {
		
		request.setAttribute("results", ActorDao.getMatchingActors(searchString));
		
		return "actorList";
	}
}






















//
//
//
//
//@Controller 
//public class ActorSearchController {
//
//	@Autowired
//	private ActorDao actorDao;
//
//	/* What request mapping do we want here */
//	public String showSearchActorForm() {
//		return null;
//	}
//
//	/* What about here? */
//	public String searchActors(/* What arguments go here to get parameters from the page? */) {
//		/* Call the model and pass values to the jsp */
//		return null;
//	}
//}


