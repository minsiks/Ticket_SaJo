package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController_jsy {

	@RequestMapping("/login")
	public String login() {
		return "login";
	}
}