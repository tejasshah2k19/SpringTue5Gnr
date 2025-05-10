package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NameController {

	
	//jsp open method 
	
	@GetMapping("inputname")
	public String openInputName(){
		return "InputName";//jsp 
	}
	
	
	@PostMapping("convert")
	public String convert(String firstName,Model model) {
		//read name 
		//convert uppercase 
		firstName = firstName.toUpperCase(); 
		//print uppercase 
		System.out.println(firstName);
		
		//how to send data from controller -> jsp 
		model.addAttribute("firstName",firstName);
		
		return "OutputName";
	}
}
