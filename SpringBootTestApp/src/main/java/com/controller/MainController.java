package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;

public class MainController {

	
	
	
	
	
	@RequestMapping("/")
	public String displayHomePage(HttpServletRequest request) {

		request.setAttribute("parksList", parkDao.getAllParks());

		return "home";

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
