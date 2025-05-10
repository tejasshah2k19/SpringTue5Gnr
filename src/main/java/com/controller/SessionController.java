package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

//stereotype
@Controller
public class SessionController {

	
	//method->jsp open -> url 

	@GetMapping("register")
	public String openSignup() {
		return "Signup"; //jsp name 
	}

	@GetMapping("login")
	public String openLogin() {
		return "Login";
	}

	
	//saveuser
	@PostMapping("saveuser")
	public String saveUser(String firstName,String lastName,String email,String password) {
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(email);
		System.out.println(password);
		return "Login";
	}
}
