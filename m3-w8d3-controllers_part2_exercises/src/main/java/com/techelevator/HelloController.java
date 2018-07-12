package com.techelevator;

import java.time.LocalDateTime;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.model.Review;
import com.techelevator.model.ReviewDao;


@Controller
public class HelloController {

	@Autowired
	private ReviewDao reviewDao;
	
	@RequestMapping("/greeting")
	public String displayGreeting() {

		return "greeting";
	}

	
	@RequestMapping("/newReviewInput")
	public String displayNewReviewInput() {

		return "newReviewInput";

	}
	
	
	
	@RequestMapping(path= {"/", "/home"}, method=RequestMethod.POST)
	public String displayHome(Review newReview, HttpServletRequest request){

		LocalDateTime dateSubmitted = LocalDateTime.now();
		
		newReview.setDateSubmitted(dateSubmitted);
		
	//	System.out.println(" Username:  " +newReview.getUsername() + " Rating: " + newReview.getRating() + " Title: " +  newReview.getTitle() + " Text: " +  newReview.getText());
		
		
		
		
		reviewDao.save(newReview);
		
		
		
		
		
		request.setAttribute("reviews", reviewDao.getAllReviews());
		
		return "home";

	}


	
	

	
	
	
	
	
	
}
