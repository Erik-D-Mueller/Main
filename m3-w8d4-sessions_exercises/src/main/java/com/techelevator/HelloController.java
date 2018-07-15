package com.techelevator;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes("favorites")

@Controller
public class HelloController {

	@RequestMapping("/Page1")
	public String displayPage1() {

		return "Page1";
	}

	@RequestMapping("/Page2")
	public String displayPage2(HttpServletRequest request, ModelMap model) {

		if (model.isEmpty()) {
			Favorites favorites = new Favorites();
			model.addAttribute("favorites", favorites);
		}

		Favorites favorites = (Favorites) model.get("favorites");

		favorites.setColor(request.getParameter("favoriteColor"));

		model.addAttribute("favorites");

		return "Page2";
	}

	@RequestMapping("/Page3")
	public String displayPage3(HttpServletRequest request, ModelMap model) {

		if (model.isEmpty()) {
			Favorites favorites = new Favorites();
			model.addAttribute("favorites", favorites);
		}

		Favorites favorites = (Favorites) model.get("favorites");

		favorites.setFood(request.getParameter("favoriteFood"));

		model.addAttribute(favorites);

		return "Page3";
	}

	@RequestMapping("/Page4")
	public String displayPage4(HttpServletRequest request, ModelMap model) {

		if (model.isEmpty()) {
			Favorites favorites = new Favorites();
			model.addAttribute("favorites", favorites);
		}

		Favorites favorites = (Favorites) model.get("favorites");
		
		favorites.setSeason(request.getParameter("favoriteSeason"));
		
		request.setAttribute("favoriteColor", favorites.getColor());
		request.setAttribute("favoriteFood", favorites.getFood());
		request.setAttribute("favoriteSeason", favorites.getSeason());

		return "Page4";
	}

}
