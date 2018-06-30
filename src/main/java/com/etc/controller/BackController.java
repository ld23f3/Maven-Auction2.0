package com.etc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BackController {
	@RequestMapping(value="show.html")
	public String showLogin() {
		return "/Back/login";
	}
	@RequestMapping(value="index.html")
	public String ShowIndex() {
		return "/Back/index";
	}
	
}
