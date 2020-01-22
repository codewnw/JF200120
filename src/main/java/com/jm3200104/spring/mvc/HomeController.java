package com.jm3200104.spring.mvc;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String homePage() {
		return "index";
	}

	@GetMapping("/date")
	public String showMeDate(Model model) {
		model.addAttribute("date", new Date());
		return "date-page";
	}
}
