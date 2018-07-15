package com.techelevator;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@SessionAttributes
@Controller 
public class HelloController {

	@RequestMapping("/Page1")
	public String displayPage1() {
		
		return "Page1";
	}



@RequestMapping("/Page2")
public String displayPage2() {
	
	return "Page2";
}


@RequestMapping("/Page3")
public String displayPage3() {
	
	return "Page2";
}


@RequestMapping("/Page4")
public String displayPage4() {
	
	return "Page2";
}




}
