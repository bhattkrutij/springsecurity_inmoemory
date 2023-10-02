package com.example.inmoemorysecurity.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")

	public String indexPage() {
		return "index";
	}

	@RequestMapping("/user")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public String userPage() {
		return "user";
	}

	@RequestMapping("/admin")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public String adminPage() {
		return "admin";
	}

}
