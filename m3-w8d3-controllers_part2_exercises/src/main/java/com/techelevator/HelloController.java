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
	
	@RequestMapping("/newReviewInput")
	public String displayNewReviewInput() {

		return "newReviewInput";

	}
		
	@RequestMapping(path= {"/", "/home"}, method=RequestMethod.GET)
	public String displayHome(Review newReview, HttpServletRequest request){
		
		request.setAttribute("reviews", reviewDao.getAllReviews());
		
		return "home";

	}
	
	@RequestMapping(path= ("/home2"), method=RequestMethod.POST)
	public String displayHome2(Review newReview, HttpServletRequest request){

		LocalDateTime dateSubmitted = LocalDateTime.now();
		
		newReview.setDateSubmitted(dateSubmitted);
		
		reviewDao.save(newReview);
			
		request.setAttribute("reviews", reviewDao.getAllReviews());
		
		return "home2";

	}

	
}
